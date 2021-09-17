package inheritance;

public class Asistan extends Akademisyen{
        protected String yuksekLisans;


    public Asistan(String adSoyad, String ePosta, int telefon, String bolum, String gorev, String ders,String yuksekLisans) {
        super(adSoyad, ePosta, telefon, bolum, gorev, ders);
        this.yuksekLisans=yuksekLisans;
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
    public  String giris(){
        return super.giris()+ "  asistan";
    }

    @Override
    public void giris2(int girisS) {
        Akademisyen.giris_sayisi=girisS;
        System.out.println(Akademisyen.giris_sayisi++);
    }


}
