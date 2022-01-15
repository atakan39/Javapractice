package tasks_Day13_14;

import java.util.Scanner;

public class TryThis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scan.next();

        scan.close();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".") ); // takes before .com

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

        scan.close();

    }
}
