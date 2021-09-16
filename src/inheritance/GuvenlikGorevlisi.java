package inheritance;

public class GuvenlikGorevlisi extends Memur{
        protected String  belge;

    public GuvenlikGorevlisi(String adSoyad, String ePosta, int telefon,String belge) {
        super(adSoyad, ePosta, telefon);
        this.belge= belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
}
