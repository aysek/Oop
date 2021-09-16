package inheritance;

public class Akademisyen extends Calisan{

        String bolum,gorev;
        String  ders;

        public Akademisyen(String adSoyad, String ePosta, int telefon, String bolum, String gorev, String ders) {

                super(adSoyad, ePosta, telefon);
                this.bolum = bolum;
                this.gorev = gorev;
                this.ders = ders;
        }

        public String getBolum() {
                return bolum;
        }

        public void setBolum(String bolum) {
                this.bolum = bolum;
        }

        public String getGorev() {
                return gorev;
        }

        public void setGorev(String gorev) {
                this.gorev = gorev;
        }

        public String getDers() {
                return ders;
        }

        public void setDers(String ders) {
                this.ders = ders;
        }

        public void derseGir(){

                System.out.println("derse gir ");
        }


}
