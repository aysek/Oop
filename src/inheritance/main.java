package inheritance;

public class main {
    public static void main(String[] args) {
     /*   Calisan c= new Calisan();
        Calisan.giris();

        Akademisyen a= new Akademisyen();
        Akademisyen.giris();

        Memur m= new Memur();
        Memur.giris();

        Asistan as= new Asistan();
        Asistan.giris();*/

      /*  Akademisyen a= new Akademisyen();
        a.derseGir();*/

        Asistan as= new Asistan("aaa","xxxxxxx",122,"dfdfdf","skdms","dfdf","sdds");
        as.derseGir();

        Calisan c= new Calisan("ahmet","a@gmail.com",121212121);
        Akademisyen a= new Akademisyen("aaa","xxxxxxx",122,"dfdfdf","skdms","dfdf");
       // a.getAdSoyad();
        System.out.println(a.getAdSoyad());

    }
}
