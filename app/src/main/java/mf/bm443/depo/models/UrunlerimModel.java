package mf.bm443.depo.models;

import android.widget.ImageButton;

public class UrunlerimModel {

    private String urunAdi, urunDeposu, urunMiktar;


    UrunlerimModel() {
        //Boş Cons.
    }

    public UrunlerimModel(String urunAdi, String urunDeposu, String urunMiktar) {
        this.urunAdi = urunAdi;
        this.urunDeposu = urunDeposu;
        this.urunMiktar = urunMiktar;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunDeposu() {
        return urunDeposu;
    }

    public void setUrunDeposu(String urunDeposu) {
        this.urunDeposu = urunDeposu;
    }

    public String getUrunMiktar() {
        return urunMiktar;
    }

    public void setUrunMiktar(String urunMiktar) {
        this.urunMiktar = urunMiktar;
    }

}
