package tasks_Day20Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int array[]={10,20,30,40,50};

        int [] reversedNumbers=new int[array.length];
        int j= array.length-1; // last element indeks number.

        for (int i = 0; i < array.length; i++) {
            reversedNumbers[i]=array[j];
            j--;
        }

        System.out.println(Arrays.toString(reversedNumbers));
    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */
