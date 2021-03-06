// Generated by view binder compiler. Do not edit!
package mf.bm443.depo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mf.bm443.depo.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox beniHatirlaCheckbox;

  @NonNull
  public final MaterialButton btnGirisYap;

  @NonNull
  public final MaterialButton btnKaydol;

  @NonNull
  public final ImageView girisLogo;

  @NonNull
  public final TextInputLayout girisSifreWrapper;

  @NonNull
  public final TextInputLayout kullaniciAdiWrapper;

  @NonNull
  public final TextView txtGirisYap;

  @NonNull
  public final TextInputEditText txtGrsEmail;

  @NonNull
  public final TextInputEditText txtGrsSifre;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull CheckBox beniHatirlaCheckbox, @NonNull MaterialButton btnGirisYap,
      @NonNull MaterialButton btnKaydol, @NonNull ImageView girisLogo,
      @NonNull TextInputLayout girisSifreWrapper, @NonNull TextInputLayout kullaniciAdiWrapper,
      @NonNull TextView txtGirisYap, @NonNull TextInputEditText txtGrsEmail,
      @NonNull TextInputEditText txtGrsSifre) {
    this.rootView = rootView;
    this.beniHatirlaCheckbox = beniHatirlaCheckbox;
    this.btnGirisYap = btnGirisYap;
    this.btnKaydol = btnKaydol;
    this.girisLogo = girisLogo;
    this.girisSifreWrapper = girisSifreWrapper;
    this.kullaniciAdiWrapper = kullaniciAdiWrapper;
    this.txtGirisYap = txtGirisYap;
    this.txtGrsEmail = txtGrsEmail;
    this.txtGrsSifre = txtGrsSifre;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.beniHatirlaCheckbox;
      CheckBox beniHatirlaCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (beniHatirlaCheckbox == null) {
        break missingId;
      }

      id = R.id.btnGirisYap;
      MaterialButton btnGirisYap = ViewBindings.findChildViewById(rootView, id);
      if (btnGirisYap == null) {
        break missingId;
      }

      id = R.id.btnKaydol;
      MaterialButton btnKaydol = ViewBindings.findChildViewById(rootView, id);
      if (btnKaydol == null) {
        break missingId;
      }

      id = R.id.girisLogo;
      ImageView girisLogo = ViewBindings.findChildViewById(rootView, id);
      if (girisLogo == null) {
        break missingId;
      }

      id = R.id.girisSifreWrapper;
      TextInputLayout girisSifreWrapper = ViewBindings.findChildViewById(rootView, id);
      if (girisSifreWrapper == null) {
        break missingId;
      }

      id = R.id.kullaniciAdiWrapper;
      TextInputLayout kullaniciAdiWrapper = ViewBindings.findChildViewById(rootView, id);
      if (kullaniciAdiWrapper == null) {
        break missingId;
      }

      id = R.id.txtGirisYap;
      TextView txtGirisYap = ViewBindings.findChildViewById(rootView, id);
      if (txtGirisYap == null) {
        break missingId;
      }

      id = R.id.txtGrsEmail;
      TextInputEditText txtGrsEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtGrsEmail == null) {
        break missingId;
      }

      id = R.id.txtGrsSifre;
      TextInputEditText txtGrsSifre = ViewBindings.findChildViewById(rootView, id);
      if (txtGrsSifre == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, beniHatirlaCheckbox, btnGirisYap,
          btnKaydol, girisLogo, girisSifreWrapper, kullaniciAdiWrapper, txtGirisYap, txtGrsEmail,
          txtGrsSifre);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
