package tasks_Day20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberArray {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        int numbers[]=new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            int num=inPut.nextInt();
            numbers[i]=num;
        }
        int min=numbers[0];

        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j]<min){
                min=numbers[j];
            }

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("min number: "+min);
    }
}
