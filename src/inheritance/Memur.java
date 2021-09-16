package inheritance;

public class Memur extends Calisan{
    String departman,mesai;

    public Memur(String adSoyad, String ePosta, int telefon) {
        super(adSoyad, ePosta, telefon);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
}
