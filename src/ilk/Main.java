package ilk;

import ilk.Encapsulation;
import ilk.Final;

public class Main {
    public static void main(String[] args) {

        System.out.println(Static.howStudent());
        Static std1= new Static("ali",9,45);
        Static std2 = new Static("veli",20,55);
        Static std3= new Static("ayse",12,80);
        System.out.println(Static.howStudent());
        Static.exit();
        System.out.println(Static.howStudent());

        int [] notlar = new int[3];
        notlar[0]=std1.point;
        notlar[1]=std2.point;
        notlar[2]=std3.point;

        System.out.println(Static.calcOveral(notlar));
        System.out.println(Final.alan(2));


        Encapsulation e1=new Encapsulation("kkk","kkkl","iii",677);
        e1.setNumberOfPage(201);
        System.out.println(e1.getNumberOfPage());




    }
}
