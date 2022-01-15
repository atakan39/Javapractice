package tasks_Day10;

public class AgeGroups {
    public static void main(String[] args) {
        int age=0;
        String ageGroup;

        if(age>0 && age <=150){
            if(age<21){
                ageGroup="Teenager";
            }else if(age<55){
                ageGroup="Adult";
            }else{
                ageGroup="Senior";
            }
        }else{
            ageGroup="invalid";
        }
        System.out.println(ageGroup);
    }
}
/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
