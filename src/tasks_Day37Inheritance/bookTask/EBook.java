package tasks_Day37Inheritance.bookTask;

public class EBook extends Book{
    public int pages;
    public EBook(String title, String type, String author, double price, int pages) {
        super(title,type,author,price);
        this.pages=pages;
    }


    public void readBook(){
        System.out.println("you can read ebook "+title);
    }

}
