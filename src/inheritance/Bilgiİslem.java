package inheritance;

public class Bilgiİslem extends Memur{
    protected String gorev;

    public Bilgiİslem(String adSoyad, String ePosta, int telefon,String gorev) {
        super(adSoyad, ePosta, telefon);
        this.gorev=gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
