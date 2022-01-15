package tasks_Day12Scanner;

import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("enter an item");
        String item =inPut.nextLine();

        System.out.println("enter the price");
        double price=inPut.nextDouble();

        System.out.println("enter quantity");
        int quantity=inPut.nextInt();

        System.out.println("enter your first name");
        String name =inPut.next();






        String reciept =name+",\n your order for "+quantity+" "+item+" has been places. \nprice for each item : $"+price+
         "\t\nYour Total : $"+(quantity*price)+
                "\t\t\t\t\n HAVE A GREAT DAY :)";
        System.out.println(reciept);

        inPut.close();

    }
}
