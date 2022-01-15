package tasks_Day12Scanner;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("\t\t\t\tDOLLAR CALCULATOR \nput belov amount of cents to convert :");

        int inputcents = inPut.nextInt();

        int dollars = inputcents / 100;
        int cents = inputcents % 100;

        System.out.println(+inputcents + " cents equal to: " + dollars + " dollars and " + cents +" cents.");

        inPut.close();
    }
}