package tasks_Day13_14;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {


        Scanner inPut=new Scanner(System.in);


        System.out.println("Split or no split (yes or no)?");
        String splitYesNo=inPut.next().toLowerCase();

        System.out.println("Enter number of people:");
        int numberOfPeople=inPut.nextInt();

        System.out.println("Enter the check amount:");
        double amount=inPut.nextDouble();

        System.out.println("How was the service quality?:\n(Excellent/Great/Good/Fair/Poor)");
        String tip=inPut.next().toLowerCase();

        double tipRate;
        if(tip.equals("excellent")){
            tipRate=0.25;
        }else if(tip.equals("great")){
            tipRate=0.20;
        }else if(tip.equals("good")){
            tipRate=0.15;
        }else if(tip.equals("fair")){
            tipRate=0.10;
        }else if(tip.equals("poor")){
            tipRate=0.05;
        }else{
            tipRate=0;
        }

        double totalTip=amount*tipRate;
        double totalPay =amount+totalTip;


        if(splitYesNo.equals("yes")){
            System.out.println("Number of people entered: "+numberOfPeople);
            System.out.println("Total to pay: "+totalPay);
            System.out.println("total tip: "+totalTip);
            System.out.println("Total per person: "+totalPay/numberOfPeople);
            System.out.println("Tip per person: "+totalTip/numberOfPeople);
        }else{
            System.out.println("Total to pay: "+totalPay);
            System.out.println("total tip: "+totalTip);
        }

inPut.close();

    }
}
/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number)
	Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */
