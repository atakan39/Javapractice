package tasks_Day19LoopsExitMethPracs;

import java.util.Scanner;

public class CircleAreaDoWhile {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        String anotherOne="";

        do {


            System.out.println("Enter the radius of the circle:");
            double radius = inPut.nextDouble();
            double PI = 3.14;
            double Diameter = radius * 2;
            double Area = radius * radius * PI;
            double Perimeter = 2 * radius * PI;

            if (!(radius > 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("diameter = " + Diameter);
            System.out.println("Perimeter = " + Perimeter);
            System.out.println("Area = " + Area);

            System.out.println("Would you like to calculate another circle?");
            anotherOne = inPut.next().toLowerCase();


            while (!(anotherOne.equals("yes") || anotherOne.equals("no"))) {
                System.err.println("invalid entry re enter answer");
                anotherOne = inPut.next().toLowerCase();
            }

            if (anotherOne.equals("no")) {
                System.out.println("thank you for using calculator APP");
            }

        }while(anotherOne.equals("yes"));

inPut.close();
    }
}
