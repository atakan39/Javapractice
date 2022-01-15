package tasks_Day23CustomMethods;

public class PrintEven1to100 {
    public static void main(String[] args) {

        evenNumber(1,100);
    }
    public static void evenNumber(int x,int y){

        System.out.print("Even numbers: ");
        for (int i = x; i < y; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
/*
2. create a method that can print even numbers between 1~100 in a same line saperated by space
 */
