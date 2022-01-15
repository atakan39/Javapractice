package tasks_Day16;

import java.util.Scanner;

public class PosNegNumber {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        int positiveNumbers=0;
        int negativeNumbers=0;

        System.out.println("Enter 5 numbers:");

        for(int i=1; i<=5; i++){
            int num=inPut.nextInt();

            if(num>0){
                positiveNumbers+=1;
            }else if(num<0){
                negativeNumbers+=1;
            }else{

            }
        }

        System.out.println( positiveNumbers+" positive and "+negativeNumbers+" negative");

        inPut.close();
    }
}

/* 1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
        Ex:
        Inputs:
        10
        20
        -1
        0
        3

        Output:
        3 positive and 1 negative

 */
