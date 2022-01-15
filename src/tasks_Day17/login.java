package tasks_Day17;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter your Password");
        String userName= inPut.next();
        System.out.println("Enter your Password");
        String passWord= inPut.next();

        int attempts=3;
        boolean valid=userName.equals("Cydeo")&&passWord.equals("Cydeo123");

        if(valid){
            System.out.println("logged in");
        }
        else {


            while (!(valid) && attempts > 0) {
                System.out.println("Incorrect username or password");
                System.err.println("Re-Enter your Password");
                userName = inPut.next().toLowerCase();
                System.err.println("Re-Enter your Password");
                passWord = inPut.next().toLowerCase();
                attempts--;

            if (valid) {
                System.out.println("logged in");
                break;
            }
        }
            if(!valid){
                System.out.println("your account is locked!");
            }




        }
        inPut.close();
    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                 to have three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is lucked."
*/