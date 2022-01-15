package tasks_day07;

public class isEligible_Cigarettes {
    public static void main(String[] args) {
        int age = 16;
        String result;
        boolean isEligible = age >= 18;

        if(isEligible){
            result = "Can buy!";
        }
        else{
            result = "CAN NOT buy!";
        }
        System.out.println(result);



    }


}
/*
1. Given a number (byte) age,
write a program that can check if the person is eligible to buy Cigarettes
 */
