package tasks_Day20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {

        Scanner inPut=new Scanner(System.in);

        System.out.println("enter beginning number:");
        int begin=inPut.nextInt();

        while(!(begin>0)){
            System.err.println("enter a positive number");
            begin= inPut.nextInt();
        }

        System.out.println("Enter ending number:");
        int end=inPut.nextInt();
        while(!(end>begin)){
            System.err.println("enter bigger number than beginning number");
            end= inPut.nextInt();
        }

        int numbers[]=new int[end-begin+1];
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+begin;
            sum+=numbers[i];

        }

        System.out.println("numbers :"+Arrays.toString(numbers));
        System.out.println("sum of the numbers = " + sum);
    }
}
