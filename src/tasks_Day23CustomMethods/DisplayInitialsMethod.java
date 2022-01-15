package tasks_Day23CustomMethods;

public class DisplayInitialsMethod {
    public static void main(String[] args) {


        displayInitials("atakan","taskin");

    }

    public static void displayInitials(String firstName, String lastName){

        String firstIn=firstName.substring(0, 1).toUpperCase();
        String lastIn=lastName.substring(0,1).toUpperCase();

        System.out.println(firstIn+"."+lastIn+".");

    }
}
/*
@@@ 1. Create a method that can display the initials of the person

yesterday dinner tasks one of the task it was array as a parameter ? @muhtar
 */