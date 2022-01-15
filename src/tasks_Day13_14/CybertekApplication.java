package tasks_Day13_14;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        String username="Cydeo";
        String password="WoodenSpoon";

        System.out.println("Enter username:");
        String userInput=inPut.next();
        System.out.println("Enter password:");
        String userInput2=inPut.next();

        if(username.equals(userInput)&&password.equals(userInput2)){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }

        inPut.close();
    }
}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */
