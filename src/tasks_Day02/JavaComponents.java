package tasks_Day02;

import java.util.Scanner;

public class JavaComponents {
    public static void main(String[] args) {

        //Declare 4 String variables: item1, item2, item3, report
        String item1="tomatoes",
                item2="apples",
                item3="bananes";
        String report=item1 + item2 + item3;




        //Declare 4 double variables: price1, price2, price3, totalPrice
        double price1=5.5,
                price2=3.5,
                price3=6.3;
        double totalPrice=price1 + price2 + price3;





        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        // CONTINUE WRITE YOUR CODE BELOW THIS LINE:
        totalPrice = price1 + price2 + price3;

        report = "Item1: " + item1 + " Price: " +price1 + ", Item2: "+item2
                +" Price: "+price2 +", Item3: "+item3+" Price: "+price3
                +"\nTotal price: "+totalPrice;

        System.out.println(report);


    }
}
