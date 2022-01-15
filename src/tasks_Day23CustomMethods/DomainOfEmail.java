package tasks_Day23CustomMethods;

public class DomainOfEmail {


    public static void main(String[] args) {

        displayDomain("ndjbhdd@gmail.com");
    }


    public static void displayDomain(String eMail){
        System.out.println(eMail.substring(eMail.indexOf("@")+1, eMail.lastIndexOf(".")));

    }

}
/*
2. Create a method that can display the domain of the email
 */