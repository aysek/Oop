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
       // as.derseGir();

        Calisan c= new Calisan("ahmet","a@gmail.com",121212121);
       // Akademisyen a= new Akademisyen("akademisyen","xxxxxxx",122,"dfdfdf","skdms","dfdf");
       // a.getAdSoyad();
       // System.out.println(a.getAdSoyad());
        OgretimUyesi o = new OgretimUyesi("ogr adadd","sssssssss",23232,"xxxxxxx","www","sss","wwwe");
        o.giris();
        //System.out.println(c.giris());
       // System.out.println(a.giris());
        Memur m= new Memur("memur1 ","@gmail",121344);

        Akademisyen akd= new Asistan("ayse","yeni",122,"ceng","ogr","101","no");//soldaki referans yani objenin nerden üretileceği
        //asistan bir akademisyen olduğu için  akademisyen sınıfından bir asistan nesnesi oluşturulabilir. ve asistan gibi davranır
       // System.out.println(akd.getAdSoyad());
       // System.out.println(akd.giris());
        //polymorphizm neden kullanılır normal kullanım varken

        //hergün giriş yapmış çalışanların listesini döndüren bir metod yazalım

        //Calisan [ ] girisListesi= {a,o,m};
       // Calisan.listele(girisListesi);
       Asistan asistan= new Asistan("asistan 1 ","xxxxxxx",122,"dfdfdf","skdms","dfdf","sdds");
       asistan.giris2(12);
       asistan.giris2(Akademisyen.giris_sayisi);


    }
}
