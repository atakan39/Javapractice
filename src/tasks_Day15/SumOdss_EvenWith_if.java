package tasks_Day15;

public class SumOdss_EvenWith_if {
    public static void main(String[] args) {
        int sumOfEvens=0;
        int sumOfOdds=0;

        for(int i=1; i<=100; i++){
           if(i%2==0){
               sumOfEvens+=i;
           }else{
               sumOfOdds+=i;
           }
        }
        System.out.println("Sum of Odd numbers = "+sumOfOdds);
        System.out.println("Sum of even numbers = "+sumOfEvens);
    }
}
/*
20 . Write a program that can return the sum of even numbers between 1 to 100

        21. Write a program that can return the sum of odd numbers between 1 to 100
*/