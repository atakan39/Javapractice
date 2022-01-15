package tasks_Day19LoopsExitMethPracs;

import java.util.Scanner;

public class SalaryCalculatorWhileTrue {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

while(true) {
    System.out.println("Enter Hourly rate:");
    double hourlyRate = inPut.nextDouble();
    if(!(hourlyRate>0)){
         System.err.println("Invalid Entry for Hourly Rate");
         System.exit(0);
    }

    System.out.println("Enter hours you work in a week:");
    int hours = inPut.nextInt();
    if(!(hours>1&&hours<=144)){
        System.err.println("Invalid Entry for Hours in week");
        System.exit(0);
    }

    System.out.println("Enter State tax %:");
    double stTaxRate = inPut.nextDouble();
    if(!(stTaxRate>0&&stTaxRate<=10)){
        System.err.println("Invalid Entry for state tax");
        System.exit(0);
    }

    double fedTaxRate =26;

    double grossSalary = hours * hourlyRate * 52;
    double stateTax = grossSalary * stTaxRate / 100;
    double federalTax = grossSalary * fedTaxRate / 100;
    double totalTax = stateTax + federalTax;
    double netIncome = grossSalary - totalTax;

    System.out.println("salary = " + grossSalary);
    System.out.println("stateTax = " + stateTax);
    System.out.println("federalTax = " + federalTax);
    System.out.println("totalTax = " + totalTax);
    System.out.println("netIncome = " + netIncome);

    System.out.println("would u like to continue?");
    String anotherOne=inPut.next().toLowerCase();
    if(!(anotherOne.equals("yes")||anotherOne.equals("no"))){
        System.err.println("Invalid Entry");
        System.exit(0);
    }

    if(anotherOne.equals("no")){
        System.out.println("Thank you for using Cydeo Salary Calculator APP");
        break;
    }


}
        inPut.close();
    }
}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


			Hint: Ones Uzun knows all the formulas you need for this task
 */
