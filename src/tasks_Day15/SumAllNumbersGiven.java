package tasks_Day15;

import java.util.Scanner;

public class SumAllNumbersGiven {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        int result=0;

        System.out.println("please enter a number to sum off all number to");
        int number=inPut.nextInt();

        for(int i=1; i<=number; i++){
            result+=i;
        }

        System.out.println(result);
    }
}
/*
22. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
