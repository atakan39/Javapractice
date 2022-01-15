package tasks_Day23CustomMethods;

import java.util.Scanner;

public class PrintEachElement {
    public static void main(String[] args) {

        printEachElement(new int[]{4, 5, 6, 2, 5});

        areaOfSquare();
    }

    public static void printEachElement(int[] numbers) {

        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }

    public static void areaOfSquare() {

        Scanner input = new Scanner(System.in);
        System.out.println("Entry for the side of the square");

        double s = input.nextDouble();
        double area = s * s;


        System.out.println("area = " + area);

    }
}

/*
@@@	14. create a method named printEachElement that can print each elements of an integer array
 */