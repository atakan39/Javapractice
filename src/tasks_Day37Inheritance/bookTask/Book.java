package tasks_Day37Inheritance.bookTask;

public class Book {

    public String title,type,author;
    public double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }


    public String toString() {
        return "AudioBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price= $" + price +
                '}';
    }


}
