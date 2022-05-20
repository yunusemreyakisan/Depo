package mf.bm443.depo.layouts.urunIslemleri;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Objects;

import mf.bm443.depo.R;
import mf.bm443.depo.models.UrunlerimModel;


public class UrunEkle extends AppCompatActivity {

    private EditText urunAdi, urunDeposu, urunMiktari, yeniKategori;
    private Spinner spinnerUrunKategorisi;
    private Button btnUrunekle, btnKategoriEkle;
    FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private DatabaseReference spinnerRef;
    private ArrayList<String> spinnerList;
    private ArrayAdapter<String> spinnerAdapter;
    //private FirebaseFirestore mFirestore;
    private FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_ekle);
        mAuth = FirebaseAuth.getInstance();
        //mFirestore = FirebaseFirestore.getInstance();

        String user_id = mAuth.getCurrentUser().getUid();
        mUser = mAuth.getCurrentUser();

        //Ürün Kategorisi Spinner DB Referansı
        spinnerRef = FirebaseDatabase.getInstance().getReference()
                .child("Kullanıcılar")
                .child(user_id)
                .child("Ürünlerim")
                .child("Ürün Kategorileri");

        initComponents();
        btnUrunEkleIslevi();
        urunKategorisiEkle();


    }

    private void urunKategorisiEkle() {
        spinnerList = new ArrayList<>();
        spinnerAdapter = new ArrayAdapter<String>(UrunEkle.this, android.R.layout.simple_spinner_dropdown_item, spinnerList);

        btnKategoriEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = yeniKategori.getText().toString();
                String key = spinnerRef.push().getKey();

                spinnerRef.child(key).setValue(value);
                yeniKategori.setText("");
                spinnerList.clear();
                spinnerAdapter.notifyDataSetChanged();

                Toast.makeText(getApplicationContext(), "Kategori eklendi.", Toast.LENGTH_SHORT).show();

            }
        });

        spinnerUrunKategorisi.setAdapter(spinnerAdapter);
        ShowData();

    }

    //Spinner Veriyi Gösterme
    private void ShowData() {
        spinnerRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot item : snapshot.getChildren()) {
                    spinnerList.add(item.getValue().toString());
                }
                spinnerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


    private void btnUrunEkleIslevi() {
        mAuth = FirebaseAuth.getInstance();
        btnUrunekle.setOnClickListener(view -> {

            //Veritabanına Canlı Kayıt Etme (Realtime Database)
            String user_id = Objects.requireNonNull(mAuth.getCurrentUser()).getUid();
            mUser = mAuth.getCurrentUser();
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Kullanıcılar").child(user_id).child("Ürünlerim");


            //Alan Tanımları
            String urunadi = urunAdi.getText().toString();
            String urundeposu = urunDeposu.getText().toString();
            String urunMiktar = urunMiktari.getText().toString();
            if (TextUtils.isEmpty(urunadi) || TextUtils.isEmpty(urunMiktar) || TextUtils.isEmpty(urundeposu)) {
                Toast.makeText(UrunEkle.this, "Boş bırakılamaz.", Toast.LENGTH_SHORT).show();
            } else {

                UrunlerimModel urunlerimmodel = new UrunlerimModel(urunadi, urundeposu, urunMiktar);
                mDatabase.push().setValue(urunlerimmodel);
                Intent intent = new Intent(UrunEkle.this, Urunlerim.class);
                startActivity(intent);
                Toast.makeText(UrunEkle.this, "Ürün başarıyla oluşturuldu.", Toast.LENGTH_SHORT).show();
            }

        });
    }


    private void initComponents() {
        urunAdi = findViewById(R.id.txtUrunAdi);
        spinnerUrunKategorisi = findViewById(R.id.txtUrunKategori);
        urunDeposu = findViewById(R.id.txtUrunDeposu);
        urunMiktari = findViewById(R.id.txtUrunMiktar);
        btnUrunekle = findViewById(R.id.btnUrunuEkle);
        btnKategoriEkle = findViewById(R.id.btnUrunKategoriEkle);
        yeniKategori = findViewById(R.id.txtYeniKategori);
    }


}
