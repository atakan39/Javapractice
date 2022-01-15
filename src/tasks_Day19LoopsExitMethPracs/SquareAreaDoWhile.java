package tasks_Day19LoopsExitMethPracs;

import java.util.Scanner;

public class SquareAreaDoWhile {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String anotherOne="";

        do {


            System.out.println("Enter the side of the square:");
            double side = inPut.nextDouble();

            double Area = side * side;
            double Perimeter = 4 * side ;

            if (!(side > 0)) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }


            System.out.println("Perimeter = " + Perimeter);
            System.out.println("Area = " + Area);

            System.out.println("Would you like to calculate another square?");
            anotherOne = inPut.next().toLowerCase();


            while (!(anotherOne.equals("yes") || anotherOne.equals("no"))) {
                System.err.println("invalid entry re enter answer");
                anotherOne = inPut.next().toLowerCase();
            }

            if (anotherOne.equals("no")) {
                System.out.println("See u next time");
            }

        }while(anotherOne.equals("thank you for using calculator APP"));
inPut.close();
    }
}
