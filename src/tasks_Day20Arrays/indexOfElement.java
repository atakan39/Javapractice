package tasks_Day20Arrays;

import java.util.Scanner;

public class indexOfElement {
    public static void main(String[] args) {
       Scanner inPut=new Scanner(System.in);

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

       System.out.println("Enter an item");
       String item=inPut.next().toLowerCase();

        for (int i = 0; i < items.length; i++) {

            if(items[i].equalsIgnoreCase(item)){
                System.out.println("indeks number :"+i);
            }
            if(items[i].equalsIgnoreCase(item)){
                System.out.println("item includes in the list");
            }

        }
        for (int i = 0; i < items.length ; i++) {
            System.out.println(items[i]+"--"+prices[i]+"--"+itemIDs[i]);
        }




inPut.close();

    }
}
