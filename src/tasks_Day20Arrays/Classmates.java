package tasks_Day20Arrays;

public class Classmates {
    public static void main(String[] args) {

        String classMates[]={"rabia nur kaya", "bob marley","alex b","ronaldo c","emre yilmaz","sidar s.","ali ata","ozgur u","kejman m.","elif ayisik"};

        for (int i = 0; i < classMates.length; i++) {
            System.out.println((classMates[i].substring(0,1)+"."+classMates[i].substring(classMates[i].lastIndexOf(" ")+1, classMates[i].lastIndexOf(" ")+2)).toUpperCase()+".");
        }
    }
}
/*
@@ 1. create an array named classmates, and store 10 of your classmates' full names'
            print the initials of each classmates in separate lines
 */
