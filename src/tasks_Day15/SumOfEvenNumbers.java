package tasks_Day15;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sumOfEvens=0;

        for(int i=2; i<=100; i+=2){
            sumOfEvens+=i;
        }

        System.out.println(sumOfEvens);

    }
}
/*
20 . Write a program that can return the sum of even numbers between 1 to 100
 */

