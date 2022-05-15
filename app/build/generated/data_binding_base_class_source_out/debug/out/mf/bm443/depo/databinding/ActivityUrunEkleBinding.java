// Generated by view binder compiler. Do not edit!
package mf.bm443.depo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mf.bm443.depo.R;

public final class ActivityUrunEkleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton btnUrunuEkle;

  @NonNull
  public final TextInputEditText txtUrunAdi;

  @NonNull
  public final TextInputEditText txtUrunDeposu;

  @NonNull
  public final TextInputEditText txtUrunKategori;

  @NonNull
  public final TextInputEditText txtUrunMiktar;

  @NonNull
  public final TextInputLayout urunAdiWrapper;

  @NonNull
  public final TextInputLayout urunDeposuWrapper;

  @NonNull
  public final TextInputLayout urunKategoriWrapper;

  @NonNull
  public final TextInputLayout urunMiktarWrapper;

  private ActivityUrunEkleBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton btnUrunuEkle, @NonNull TextInputEditText txtUrunAdi,
      @NonNull TextInputEditText txtUrunDeposu, @NonNull TextInputEditText txtUrunKategori,
      @NonNull TextInputEditText txtUrunMiktar, @NonNull TextInputLayout urunAdiWrapper,
      @NonNull TextInputLayout urunDeposuWrapper, @NonNull TextInputLayout urunKategoriWrapper,
      @NonNull TextInputLayout urunMiktarWrapper) {
    this.rootView = rootView;
    this.btnUrunuEkle = btnUrunuEkle;
    this.txtUrunAdi = txtUrunAdi;
    this.txtUrunDeposu = txtUrunDeposu;
    this.txtUrunKategori = txtUrunKategori;
    this.txtUrunMiktar = txtUrunMiktar;
    this.urunAdiWrapper = urunAdiWrapper;
    this.urunDeposuWrapper = urunDeposuWrapper;
    this.urunKategoriWrapper = urunKategoriWrapper;
    this.urunMiktarWrapper = urunMiktarWrapper;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUrunEkleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUrunEkleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_urun_ekle, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUrunEkleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnUrunuEkle;
      MaterialButton btnUrunuEkle = ViewBindings.findChildViewById(rootView, id);
      if (btnUrunuEkle == null) {
        break missingId;
      }

      id = R.id.txtUrunAdi;
      TextInputEditText txtUrunAdi = ViewBindings.findChildViewById(rootView, id);
      if (txtUrunAdi == null) {
        break missingId;
      }

      id = R.id.txtUrunDeposu;
      TextInputEditText txtUrunDeposu = ViewBindings.findChildViewById(rootView, id);
      if (txtUrunDeposu == null) {
        break missingId;
      }

      id = R.id.txtUrunKategori;
      TextInputEditText txtUrunKategori = ViewBindings.findChildViewById(rootView, id);
      if (txtUrunKategori == null) {
        break missingId;
      }

      id = R.id.txtUrunMiktar;
      TextInputEditText txtUrunMiktar = ViewBindings.findChildViewById(rootView, id);
      if (txtUrunMiktar == null) {
        break missingId;
      }

      id = R.id.urunAdiWrapper;
      TextInputLayout urunAdiWrapper = ViewBindings.findChildViewById(rootView, id);
      if (urunAdiWrapper == null) {
        break missingId;
      }

      id = R.id.urunDeposuWrapper;
      TextInputLayout urunDeposuWrapper = ViewBindings.findChildViewById(rootView, id);
      if (urunDeposuWrapper == null) {
        break missingId;
      }

      id = R.id.urunKategoriWrapper;
      TextInputLayout urunKategoriWrapper = ViewBindings.findChildViewById(rootView, id);
      if (urunKategoriWrapper == null) {
        break missingId;
      }

      id = R.id.urunMiktarWrapper;
      TextInputLayout urunMiktarWrapper = ViewBindings.findChildViewById(rootView, id);
      if (urunMiktarWrapper == null) {
        break missingId;
      }

      return new ActivityUrunEkleBinding((LinearLayout) rootView, btnUrunuEkle, txtUrunAdi,
          txtUrunDeposu, txtUrunKategori, txtUrunMiktar, urunAdiWrapper, urunDeposuWrapper,
          urunKategoriWrapper, urunMiktarWrapper);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
