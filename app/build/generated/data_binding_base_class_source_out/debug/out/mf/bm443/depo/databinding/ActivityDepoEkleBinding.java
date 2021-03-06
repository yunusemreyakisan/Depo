// Generated by view binder compiler. Do not edit!
package mf.bm443.depo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mf.bm443.depo.R;

public final class ActivityDepoEkleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDepolarimaEkle;

  @NonNull
  public final TextInputEditText depoAd;

  @NonNull
  public final TextInputEditText depoAdres;

  @NonNull
  public final TextInputEditText depoBuyuklugu;

  @NonNull
  public final TextView iconBoxDepoEkle;

  private ActivityDepoEkleBinding(@NonNull LinearLayout rootView, @NonNull Button btnDepolarimaEkle,
      @NonNull TextInputEditText depoAd, @NonNull TextInputEditText depoAdres,
      @NonNull TextInputEditText depoBuyuklugu, @NonNull TextView iconBoxDepoEkle) {
    this.rootView = rootView;
    this.btnDepolarimaEkle = btnDepolarimaEkle;
    this.depoAd = depoAd;
    this.depoAdres = depoAdres;
    this.depoBuyuklugu = depoBuyuklugu;
    this.iconBoxDepoEkle = iconBoxDepoEkle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDepoEkleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDepoEkleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_depo_ekle, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDepoEkleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDepolarimaEkle;
      Button btnDepolarimaEkle = ViewBindings.findChildViewById(rootView, id);
      if (btnDepolarimaEkle == null) {
        break missingId;
      }

      id = R.id.depoAd;
      TextInputEditText depoAd = ViewBindings.findChildViewById(rootView, id);
      if (depoAd == null) {
        break missingId;
      }

      id = R.id.depoAdres;
      TextInputEditText depoAdres = ViewBindings.findChildViewById(rootView, id);
      if (depoAdres == null) {
        break missingId;
      }

      id = R.id.depoBuyuklugu;
      TextInputEditText depoBuyuklugu = ViewBindings.findChildViewById(rootView, id);
      if (depoBuyuklugu == null) {
        break missingId;
      }

      id = R.id.iconBoxDepoEkle;
      TextView iconBoxDepoEkle = ViewBindings.findChildViewById(rootView, id);
      if (iconBoxDepoEkle == null) {
        break missingId;
      }

      return new ActivityDepoEkleBinding((LinearLayout) rootView, btnDepolarimaEkle, depoAd,
          depoAdres, depoBuyuklugu, iconBoxDepoEkle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
