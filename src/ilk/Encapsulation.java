package ilk;

public class Encapsulation {

    public  String name, author, publisher;
    private int numberOfPage;
    Encapsulation(String name, String author, String publisher, int numberOfPage){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        if(numberOfPage<1){
            numberOfPage=10;
        }else{
            this.numberOfPage=numberOfPage;
        }
    }

        public int getNumberOfPage(){
            return this.numberOfPage;
        }
        public void setNumberOfPage(int page){
            this.numberOfPage=page;
        }




}
