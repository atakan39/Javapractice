package tasks_Day19LoopsExitMethPracs;

import java.util.Scanner;

public class CircleWhileTrue {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

while(true){

            System.out.println("Enter the radius of the circle:");
            double radius = inPut.nextDouble();
            double pI = 3.14;
            double diameter = radius * 2;
            double area = radius * radius * pI;
            double perimeter = 2 * radius * pI;

            if (!(radius > 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("diameter = " + diameter);
            System.out.println("Perimeter = " + perimeter);
            System.out.println("Area = " + area);

            System.out.println("Would you like to calculate another circle?");
            String anotherOne = inPut.next().toLowerCase();


            while (!(anotherOne.equals("yes") || anotherOne.equals("no"))) {
                System.err.println("invalid entry re enter answer");
                anotherOne = inPut.next().toLowerCase();
            }

            if (anotherOne.equals("no")) {
                System.out.println("thank you for using calculator APP");
                break;
            }

        }
inPut.close();

    }
}
