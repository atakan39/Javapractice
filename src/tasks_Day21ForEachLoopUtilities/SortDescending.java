package tasks_Day21ForEachLoopUtilities;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int numbers[]={15,4,8,12,10};
        int reverse[]=new int[numbers.length];

        Arrays.sort(numbers);
        int i=numbers.length-1;
        for (int each:numbers) {
        reverse[i--]=each;

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));


    }
}
/*
@@@	1. Write a program that sort the array of integer in descending order

 */
