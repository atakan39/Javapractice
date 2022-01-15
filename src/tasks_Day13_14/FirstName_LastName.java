package tasks_Day13_14;

import java.util.Scanner;

public class FirstName_LastName {
    public static void main(String[] args) {
            Scanner inPut=new Scanner(System.in);
            System.out.println("enter firstname:");
            String firstName=inPut.next();
            System.out.println("enter lastname:");
            String lastName=inPut.next();



            firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
            lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);
inPut.close();

    }
}
/*
@@@ 3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
