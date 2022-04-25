// Generated by view binder compiler. Do not edit!
package mf.bm443.depo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mf.bm443.depo.R;

public final class ActivityDepolarimBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDepoA;

  @NonNull
  public final Button btnYeniDepoEkle;

  @NonNull
  public final ImageView depoLogoDepolarim;

  @NonNull
  public final TextView txtGirisYap;

  private ActivityDepolarimBinding(@NonNull LinearLayout rootView, @NonNull Button btnDepoA,
      @NonNull Button btnYeniDepoEkle, @NonNull ImageView depoLogoDepolarim,
      @NonNull TextView txtGirisYap) {
    this.rootView = rootView;
    this.btnDepoA = btnDepoA;
    this.btnYeniDepoEkle = btnYeniDepoEkle;
    this.depoLogoDepolarim = depoLogoDepolarim;
    this.txtGirisYap = txtGirisYap;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDepolarimBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDepolarimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_depolarim, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDepolarimBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDepoA;
      Button btnDepoA = ViewBindings.findChildViewById(rootView, id);
      if (btnDepoA == null) {
        break missingId;
      }

      id = R.id.btnYeniDepoEkle;
      Button btnYeniDepoEkle = ViewBindings.findChildViewById(rootView, id);
      if (btnYeniDepoEkle == null) {
        break missingId;
      }

      id = R.id.depoLogoDepolarim;
      ImageView depoLogoDepolarim = ViewBindings.findChildViewById(rootView, id);
      if (depoLogoDepolarim == null) {
        break missingId;
      }

      id = R.id.txtGirisYap;
      TextView txtGirisYap = ViewBindings.findChildViewById(rootView, id);
      if (txtGirisYap == null) {
        break missingId;
      }

      return new ActivityDepolarimBinding((LinearLayout) rootView, btnDepoA, btnYeniDepoEkle,
          depoLogoDepolarim, txtGirisYap);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
