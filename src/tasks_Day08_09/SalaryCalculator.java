package tasks_Day08_09;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary =100000;
        double salaryNet=0;
        double tax=0;
        char married='Y';
        if(salary <= 80000){
            if(married=='Y'){
            salaryNet = salary - salary*0.2*0.95;}
            else if(married!='Y'){
                salaryNet = salary - salary*0.2;}
        }else if(salary<=100000){
            if(married=='Y'){
                salaryNet = salary - salary*0.25*0.95;}
            else if(married!='Y'){
                salaryNet = salary - salary*0.25;}

        }else if(salary<=130000){
            if(married=='Y'){
                salaryNet = salary - salary*0.30*0.95;}
            else if(married!='Y'){
                salaryNet = salary - salary*0.30;}
        }else{
            if(married=='Y'){
                salaryNet = salary - salary*0.35*0.95;}
            else if(married!='Y'){
                salaryNet = salary - salary*0.35;}

        }
        System.out.println(salaryNet);

    }
}
/*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 130k
                        25% for salary of 80K to 100K
                        20% for salary of 80K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */
