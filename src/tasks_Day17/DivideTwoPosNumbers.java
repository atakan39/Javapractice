package tasks_Day17;


import java.util.Scanner;

public class DivideTwoPosNumbers {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Enter dividend");
        double dividend = inPut.nextInt();
        System.out.println("Enter divisor");
        double divisor = inPut.nextInt();

        double leftOver = dividend;
        double count = 0;

        double a = (dividend % divisor) / divisor;

        boolean valid = dividend >= 0 && divisor > 0;

        if (valid) {
            while (leftOver >= divisor) {
                leftOver -= divisor;
                count++;
            }

            System.out.println(count + a);
        } else {
            System.err.println("numbers can not be negative or 0 ");
        }



        inPut.close();
    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */