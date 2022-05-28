package mf.bm443.depo.layouts;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import mf.bm443.depo.R;
import mf.bm443.depo.layouts.auth.MainActivity;
import mf.bm443.depo.layouts.depoIslemleri.Depolarim;
import mf.bm443.depo.layouts.sonIslemler.SonIslemlerSecimi;
import mf.bm443.depo.layouts.urunIslemleri.Urunlerim;

public class HomePage extends AppCompatActivity {

    private DatabaseReference mDatabase;
    FirebaseAuth mAuth;
    private TextView name;
    private Button btnDepoIslemleri, btnCikis, btnUrunIslemleri, btnStokIslemleri, btnSonIslemler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        isimOkuma();
        initComponents();
        depoIslemleri();
        urunIslemleri();
        sonIslemler();
      //  stokIslemleri();
        logoutWithAlertDialog();


    }


    //Geri tuşuna basıldığında çalışacak method.
    @Override
    public void onBackPressed() {
    }

    //Çıkış İşlemi (AlertDialog)
    private void logoutWithAlertDialog() {
        btnCikis.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(HomePage.this);
            // Pencere Baslik Tanımı
            builder.setTitle("Emin misiniz?");
            // Pencere Mesaj Tanımı
            builder.setMessage("Çıkış yapmak istediğinizden emin misiniz?");
            // Pencere İkon Tanımı
            builder.setIcon(R.drawable.logodark);

            class AlertDialogClickListener implements DialogInterface.OnClickListener {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (which == AlertDialog.BUTTON_NEGATIVE) {
                        Toast.makeText(HomePage.this, "İşlem iptal edildi.",
                                Toast.LENGTH_SHORT).show();
                    } else if (which == AlertDialog.BUTTON_POSITIVE) { // veya else
                        Toast.makeText(HomePage.this, "Çıkış başarıyla gerçekleştirildi.",
                                Toast.LENGTH_SHORT).show();
                        HomePage.this.finish(); // Activity’nin sonlandırılması

                        //Giriş ekranı için Pref. Kontrolü
                        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putString("Remember", "false");
                        editor.apply();
                        finish();
                        //Giriş aktivitesine dönülmesi
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);

                    }
                }
            }
            // AlertDialog Builder
            AlertDialogClickListener alertDialogClickListener = new AlertDialogClickListener();
            builder.setPositiveButton("EVET", alertDialogClickListener);
            builder.setNegativeButton("HAYIR", alertDialogClickListener);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        });


    }



    //Homepage üzerine çektiğimiz isim
    private void isimOkuma() {
        mAuth = FirebaseAuth.getInstance();
        String user_id = mAuth.getCurrentUser().getUid();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Kullanıcılar").child(user_id).child("Kullanıcı Bilgileri").child("Name");


        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if (snapshot.exists()) {
                    String isim = snapshot.getValue().toString();
                    name.setText(isim);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.d("Firebase İsim Çekme", "Böyle bir döküman yok!");
            }
        });

    }

    //Depo İşlemleri Buton İşlemi
    private void depoIslemleri() {
        btnDepoIslemleri.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Depolarim.class);
            startActivity(intent);
        });
    }


    //Ürün İşlemleri Buton İşlemi
    private void urunIslemleri() {
        btnUrunIslemleri.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Urunlerim.class);
            startActivity(intent);
        });
    }

    /*
    private void stokIslemleri() {
        btnStokIslemleri.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Kategoriler.class);
            startActivity(intent);
        });
    }
     */


  private void sonIslemler() {
      btnSonIslemler.setOnClickListener(view -> {
          Intent intent = new Intent(HomePage.this, SonIslemlerSecimi.class);
          startActivity(intent);
      });
  }

    private void initComponents() {
        name = findViewById(R.id.txtFirebaseAd);
        btnDepoIslemleri = findViewById(R.id.btnDepoIslemleri);
        btnCikis = findViewById(R.id.btnCikis);
        btnUrunIslemleri = findViewById(R.id.btnUrunIslemleri);
        btnSonIslemler = findViewById(R.id.btnSonIslemler);
       // btnStokIslemleri = findViewById(R.id.btnStokIslemleri);
    }
}



