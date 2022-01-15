package tasks_Day37Inheritance.bookTask;

public class AudioBook extends Book {

    public AudioBook(String title, String type, String author, double price,int narrator) {
        super(title, type, author, price);
        this.narrator=narrator;
    }

   public int narrator;

    public void listen(){
        System.out.println(author+" is listening");
    }

}
