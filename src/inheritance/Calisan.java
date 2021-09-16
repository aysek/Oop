package inheritance;

public class Calisan {

    protected  String adSoyad,ePosta;
    protected int telefon;
    static int giris_sayisi=0;

    public Calisan(String adSoyad, String ePosta, int telefon) {
        this.adSoyad = adSoyad;
        this.ePosta = ePosta;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public static int getGiris_sayisi() {
        return giris_sayisi;
    }

    public static void setGiris_sayisi(int giris_sayisi) {
        Calisan.giris_sayisi = giris_sayisi;
    }

    public static void giris(){
        System.out.println("çalışan giris yaptı");
        System.out.println(giris_sayisi++);
    }



    public void cikis(){
        System.out.println("Çalışan cikis yaptı");
    }
    public void yemek(){
        System.out.println("");
    }




}
