package inheritance;

public class OgretimUyesi extends Akademisyen{
    protected String unvan;

    public OgretimUyesi(String adSoyad, String ePosta, int telefon, String bolum, String gorev, String ders,String unvan) {
        super(adSoyad, ePosta, telefon, bolum, gorev, ders);
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
