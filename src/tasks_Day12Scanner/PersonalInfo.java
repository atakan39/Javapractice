package tasks_Day12Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("enter Age:");
        int age=inPut.nextInt();

        System.out.println("Enter Gender:");
        String gender=inPut.next();

        inPut.nextLine();

        System.out.println("Enter your full name:");
        String fullName= inPut.nextLine();

        System.out.println("Enter your phone number:");
        long phone=inPut.nextLong();

        System.out.println("Enter your Zipcode:");
        int zipCode=inPut.nextInt();

        inPut.nextLine();

        System.out.println("Enter your school name:");
        String schoolName=inPut.nextLine();

        System.out.println("Enter your city :");
        String cityName=inPut.nextLine();

        System.out.println("Enter your State :");
        String stateName=inPut.next();

        System.out.println("Enter your building number :");
        int building=inPut.nextInt();

        inPut.nextLine();

        System.out.println("Enter your street name :");
        String streetName=inPut.nextLine();

        System.out.println("\t\t\t\t\t\t "+fullName+"\n\t\t\t\t\t\t "+age+"\n\t\t\t\t\t\t "+gender+"\n\t\t\t\t\t\t "+phone+"\n\t\t\t\t\t\t address:\n"+building+" "+streetName+"\n\t\t\t\t\t\t\t "+cityName+", "+stateName+" "+zipCode+"\n\t\t\t\t\t\t "+schoolName);

        inPut.close();
    }
}
