package tasks_Day19LoopsExitMethPracs;

import java.util.Scanner;

public class RectangleAreaDoWhile {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String anotherOne="";

        do {


            System.out.println("Enter the witdh of the rectangle:");
            double width = inPut.nextDouble();

            if (!(width > 0)) {
                System.err.println("Invalid Entry for the witdh of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the length of the rectangle:");
            double length = inPut.nextDouble();

            if (!(length>0)) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            double Area = width * length;
            double Perimeter = 2 * (width+length);




            System.out.println("Perimeter = " + Perimeter);
            System.out.println("Area = " + Area);

            System.out.println("Would you like to calculate another rectangle?");
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

