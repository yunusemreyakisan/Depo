// Generated by view binder compiler. Do not edit!
package mf.bm443.depo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mf.bm443.depo.R;

public final class ActivityHomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SwitchCompat btThemeSwitch;

  @NonNull
  public final MaterialButton btnDepoIslemleri;

  @NonNull
  public final MaterialButton btnStokBilgisi;

  @NonNull
  public final MaterialButton btnUrunIslemleri;

  @NonNull
  public final MaterialButton btnVeriOkuma;

  @NonNull
  public final ImageView imageDepoWhiteLogo;

  @NonNull
  public final TextView txtFirebaseAd;

  @NonNull
  public final TextView txtHosgeldin;

  @NonNull
  public final TextView veriOkuma;

  private ActivityHomePageBinding(@NonNull ConstraintLayout rootView,
      @NonNull SwitchCompat btThemeSwitch, @NonNull MaterialButton btnDepoIslemleri,
      @NonNull MaterialButton btnStokBilgisi, @NonNull MaterialButton btnUrunIslemleri,
      @NonNull MaterialButton btnVeriOkuma, @NonNull ImageView imageDepoWhiteLogo,
      @NonNull TextView txtFirebaseAd, @NonNull TextView txtHosgeldin,
      @NonNull TextView veriOkuma) {
    this.rootView = rootView;
    this.btThemeSwitch = btThemeSwitch;
    this.btnDepoIslemleri = btnDepoIslemleri;
    this.btnStokBilgisi = btnStokBilgisi;
    this.btnUrunIslemleri = btnUrunIslemleri;
    this.btnVeriOkuma = btnVeriOkuma;
    this.imageDepoWhiteLogo = imageDepoWhiteLogo;
    this.txtFirebaseAd = txtFirebaseAd;
    this.txtHosgeldin = txtHosgeldin;
    this.veriOkuma = veriOkuma;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_theme_switch;
      SwitchCompat btThemeSwitch = ViewBindings.findChildViewById(rootView, id);
      if (btThemeSwitch == null) {
        break missingId;
      }

      id = R.id.btnDepoIslemleri;
      MaterialButton btnDepoIslemleri = ViewBindings.findChildViewById(rootView, id);
      if (btnDepoIslemleri == null) {
        break missingId;
      }

      id = R.id.btnStokBilgisi;
      MaterialButton btnStokBilgisi = ViewBindings.findChildViewById(rootView, id);
      if (btnStokBilgisi == null) {
        break missingId;
      }

      id = R.id.btnUrunIslemleri;
      MaterialButton btnUrunIslemleri = ViewBindings.findChildViewById(rootView, id);
      if (btnUrunIslemleri == null) {
        break missingId;
      }

      id = R.id.btnVeriOkuma;
      MaterialButton btnVeriOkuma = ViewBindings.findChildViewById(rootView, id);
      if (btnVeriOkuma == null) {
        break missingId;
      }

      id = R.id.imageDepoWhiteLogo;
      ImageView imageDepoWhiteLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageDepoWhiteLogo == null) {
        break missingId;
      }

      id = R.id.txtFirebaseAd;
      TextView txtFirebaseAd = ViewBindings.findChildViewById(rootView, id);
      if (txtFirebaseAd == null) {
        break missingId;
      }

      id = R.id.txtHosgeldin;
      TextView txtHosgeldin = ViewBindings.findChildViewById(rootView, id);
      if (txtHosgeldin == null) {
        break missingId;
      }

      id = R.id.veriOkuma;
      TextView veriOkuma = ViewBindings.findChildViewById(rootView, id);
      if (veriOkuma == null) {
        break missingId;
      }

      return new ActivityHomePageBinding((ConstraintLayout) rootView, btThemeSwitch,
          btnDepoIslemleri, btnStokBilgisi, btnUrunIslemleri, btnVeriOkuma, imageDepoWhiteLogo,
          txtFirebaseAd, txtHosgeldin, veriOkuma);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
