package tasks_Day20Arrays;

import java.util.Arrays;

public class Array1to100AndReverseIt {
    public static void main(String[] args) {



        int [] numbers=new int[100];
        int num=1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+num;

            // number[0]=1
            // number[1]=2
            // number[99]=100
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------");

        int []numberReverse=new int[100];

        int num2=100;
        for (int i = 0; i < numberReverse.length; i++) {
            numberReverse[i]=num2-i;
        }
        System.out.println(Arrays.toString(numberReverse));






    }
}

