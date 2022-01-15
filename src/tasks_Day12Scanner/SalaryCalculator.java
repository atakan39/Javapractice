package tasks_Day12Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter Hourly rate:");
        double hourlyRate=inPut.nextDouble();
        System.out.println("Enter hours you work in a week:");
        int hours =inPut.nextInt();
        System.out.println("Enter your overtime per week");
        int overhours=inPut.nextInt();
        System.out.println("Enter State tax %:");
        double stTaxRate=inPut.nextDouble();
        System.out.println("Enter Federa tax %:");
        double fedTaxRate=inPut.nextDouble();

        double salary=hours * hourlyRate*52+overhours*hourlyRate*1.5*52;
        double overtimeIncome=overhours*hourlyRate*1.5*52;
        double stateTax=salary * stTaxRate/100;
        double federalTax=salary*fedTaxRate/100;
        double totalTax=stateTax+federalTax;
        double netIncome=salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
        System.out.println("over time Income = " + overtimeIncome);

        inPut.close();

    }
}
