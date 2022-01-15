package tasks_Day20Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class items {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);


        String items[] = new String[5];
        double prices[] = new double[5];
        double totalPrice=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an item:");
            items[i]=inPut.next().toLowerCase();

            System.out.println("enter price of the item:");
            prices[i]=inPut.nextDouble();

            totalPrice+=prices[i];
        }

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println("total : $"+totalPrice);


    }
}