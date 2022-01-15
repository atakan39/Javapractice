package tasks_Day23CustomMethods;

public class PrintOdd1to100 {
    public static void main(String[] args) {

        oddNumbers(1,100);
    }
    public static void oddNumbers(int x, int y){
        for (int i = x; i < y; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space
 */