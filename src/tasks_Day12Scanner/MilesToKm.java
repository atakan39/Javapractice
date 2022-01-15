package tasks_Day12Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter Miles :");
        double miles = inPut.nextDouble();

        double km = miles * 1.609;

        System.out.println(miles + " miles equal to " + km + " kilometers");

        inPut.close();
    }

}
