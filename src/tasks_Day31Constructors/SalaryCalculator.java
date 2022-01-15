package tasks_Day31Constructors;

public class SalaryCalculator {
    public double hourlyRate,stateTaxRate,federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double totalStateTax(){

        return salary() * stateTaxRate;
    }

    public double totalFederalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-totalFederalTax()-totalStateTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "Salary =$"+ salary() +
                ", State Tax= $"  + totalStateTax() +
                ", Federal Tax= $" + totalFederalTax() +
                ", Salary net = $" + salaryAfterTax() +
                '}';
    }
}
  /*  Add a constructor to set all the fields

    Actions:
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): claculates the totalstateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

   */

