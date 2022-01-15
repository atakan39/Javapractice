package tasks_Day20Arrays;

import java.util.Scanner;

public class AverageNumber2 {
    public static void main(String[] args) {

        Scanner inPut=new Scanner(System.in);

        System.out.println("how many numbers you would like to enter?");
        int userInp=inPut.nextInt();

        if(!(userInp>0)){
            System.err.println("invalid entry");
            System.exit(0);
        }

        int numbers[]=new int[userInp];
        double sum=0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number");
            numbers[i]=inPut.nextInt();
            sum+=numbers[i];
        }

        System.out.println("Average number: "+sum/numbers.length);

inPut.close();
    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */