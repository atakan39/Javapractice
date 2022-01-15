package tasks_Day37Inheritance.bookTask;

public class DandR {
    public static void main(String[] args) {

        AudioBook audioBook1=new AudioBook("robinson","adventure","defoe",15,70);

        EBook ebook1=new EBook("simyaci","adventure"," for example",12,255);


        System.out.println();

        ebook1.readBook();

        audioBook1.listen();

        System.out.println(audioBook1);
        System.out.println(ebook1);

    }
}
