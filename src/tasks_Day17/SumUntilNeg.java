package tasks_Day17;

import java.util.Scanner;

public class SumUntilNeg {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("enter number");
        int number=inPut.nextInt();
        int sum=0;
        sum=sum+number;
        String inputs=number+"";
        boolean valid=number>0;

        while(number>0){
            System.out.println("enter number");
            number=inPut.nextInt();

            if(number<0) break;

            sum+=number;
            inputs=inputs+"+"+number;

            }
        if(number<0){
            System.out.println("Total of (" +inputs+")= "+sum);
        }
inPut.close();
    }
}
/*
@@@	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */
