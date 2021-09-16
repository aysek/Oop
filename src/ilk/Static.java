package ilk;

public class Static {

    public String name;
    public int id,point;
    private static int counter=0;
    Static(String name, int id, int point){
        this.name=name;
        this.id=id;
        this.point=point;
        Static.counter++;
    }
    public static void exit(){
        Static.counter--;
    }
    public static int howStudent(){
        return Static.counter;
    }
    public static double calcOveral(int[] arr){//ortalama hesaplama
        double overall=0;
        for(int i=0;i< arr.length;i++){
            overall+=arr[i];
        }

        return overall/arr.length;
    }

}
