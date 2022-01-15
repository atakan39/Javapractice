package tasks_Day15;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sumOfOdds=0;

        for(int i=1; i<=100; i+=2){
            sumOfOdds+=i;
        }
        System.out.println(sumOfOdds);

    }
}
/*
21. Write a program that can return the sum of odd numbers between 1 to 100
 */