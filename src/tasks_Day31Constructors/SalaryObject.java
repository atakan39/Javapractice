package tasks_Day31Constructors;

public class SalaryObject {

    public static void main(String[] args) {

        SalaryCalculator salary1=new SalaryCalculator(13.5,0.05,0.2,40);

        SalaryCalculator salary2=new SalaryCalculator(17.5,0.05,0.2,40);

        SalaryCalculator salary3=new SalaryCalculator(60.5,0.10,0.25,40);

        SalaryCalculator salary4=new SalaryCalculator(25,0.07,0.22,40);

        System.out.println(salary1);
        System.out.println(salary2);

        SalaryCalculator[] salaries={salary1,salary2,salary3,salary4};

        double max=salaries[0].salary();
        double min=salaries[0].salary();

        for (SalaryCalculator each : salaries) {
            if(each.salary()>max){
                max=each.salary();
            }
            if(each.salary()<min){
                min= each.salary();

            }
        }

        System.out.println(max+" max salary");
        System.out.println(min+" min salary");






    }
}
