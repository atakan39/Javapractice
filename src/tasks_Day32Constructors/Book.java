package tasks_Day32Constructors;

public class Book {
    static {
        System.out.println(0);
    }

    static void run(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }

}
