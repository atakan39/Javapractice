package tasks_Day17;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("enter your name:");
        String name=inPut.nextLine();

        System.out.println("Enter your gender: ");
        String gender=inPut.next().toLowerCase();
        while(!(gender.equals("male")||gender.equals("female"))){
            System.err.println("! not valid please re-enter ");
            gender=inPut.next().toLowerCase();
        }

        System.out.println("Are you Married? (yes/no)");
        String married=inPut.next().toLowerCase();
        while(!(gender.equals("male")||gender.equals("female"))){
            System.err.println("! not valid please re-enter gender ");
            married=inPut.next().toLowerCase();
        }

        System.out.println("Enter your age: ");
        int age=inPut.nextInt();
        while(!(age>0 && age<=120)){
            System.err.println("! not valid please re-enter age");
        }

        System.out.println("how many miles you drive in a day?");
        int miles=inPut.nextInt();
        while(!(miles>=5)){
            System.err.println("! not valid please re-enter milliage minimum(5)");
        }

        System.out.println("Full coverage /or  Liability insurance?\nEnter 1 for full\t enter 2 for Liability");
        int one_two=inPut.nextInt();
        while(!(one_two==1 || one_two==2)){
            System.err.println("please re enter the number (1) or (2)");
        }

        System.out.println("had any accidents or claims in past 5 years? (Yes/No)");
        String accident=inPut.next().toLowerCase();
        while(!(accident.equals("yes")||accident.equals("no"))){
            System.err.println("! not valid please re-enter answer ");
            accident=inPut.next().toLowerCase();
        }
        System.out.println("car has any anti theft device ? (Yes/No)");
        String device=inPut.next().toLowerCase();
        while(!(device.equals("yes")||device.equals("no"))){
            System.err.println("! not valid please re-enter answer ");
            accident=inPut.next().toLowerCase();
        }
        double fullCoverage=0;
        double liabilityCoverage=0;

        if(one_two==1){// full coverage
            if(age<25){
                fullCoverage+=160;
                if(miles<=10){
                fullCoverage+=20;
                }
                else if(miles>10 && miles<=50){
                 fullCoverage+=40;
                }else{
                 fullCoverage+=70;
                }
            }else{
                fullCoverage+=120;
                if(miles<=10){
                    fullCoverage+=20;
                }
                else if(miles>10 && miles<=50){
                    fullCoverage+=40;
                }else{
                    fullCoverage+=70;
                }
            }
            if(device.equals("yes")){
                fullCoverage-=fullCoverage*0.05;
            }
            if(married.equals("yes")){
                fullCoverage-=fullCoverage*0.05;
            }
            if(accident.equals("yes")){
                fullCoverage+=fullCoverage*0.15;
            }else if(accident.equals("no")){
                fullCoverage-=fullCoverage*0.10;
            }
            System.out.println("fullCoverage = " + fullCoverage);
       }else{
            if(age<25){
                liabilityCoverage+=90;
                if(miles<=10){
                    liabilityCoverage+=10;
                }
                else if(miles>10 && miles<=50){
                    liabilityCoverage+=30;
                }else{
                    liabilityCoverage+=50;
                }
            }else{
                liabilityCoverage+=50;
                if(miles<=10){
                    liabilityCoverage+=10;
                }
                else if(miles>10 && miles<=50){
                    liabilityCoverage+=30;
                }else{
                    liabilityCoverage+=50;
                }
            }
            if(device.equals("yes")){
                liabilityCoverage-=liabilityCoverage*0.05;
            }
            if(married.equals("yes")){
                liabilityCoverage-=liabilityCoverage*0.05;
            }
            if(accident.equals("yes")){
                liabilityCoverage+=liabilityCoverage*0.15;
            }else if(accident.equals("no")){
                liabilityCoverage-=liabilityCoverage*0.10;
            }

            System.out.println("liabilityCoverage = " + liabilityCoverage);
        }


        inPut.close();



        }



}
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:

    		1. Ask the user to enter your name

    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */