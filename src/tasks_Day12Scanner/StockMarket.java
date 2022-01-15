package tasks_Day12Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String result="";

        System.out.println("how many total shares you have?");
        int shares=inPut.nextInt();

        if(shares>0){
            System.out.println("how much is your total shares value in the market?");
            double value=inPut.nextDouble();

            inPut.nextLine();

            System.out.println("enter the stock name you have the most");
            String company=inPut.nextLine();

            System.out.println("your total market holding is $"+value+" which is made up of "+shares+". "+company+" is your company holdings");

        }else {
            System.out.println("buy stocks!");
        }

        inPut.close();
        }
    }

