package tasks_Day20Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

      Scanner inPut=new Scanner(System.in);


        int numbers[]=new int[10];



        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers");
            numbers[i]=inPut.nextInt();
            sum+=numbers[i];
        }

        double aveageNumber=sum/numbers.length;
        System.out.println(aveageNumber);

        inPut.close();
    }
}
