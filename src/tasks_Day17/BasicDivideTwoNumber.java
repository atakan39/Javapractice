package tasks_Day17;

public class BasicDivideTwoNumber {
    public static void main(String[] args) {
        int a = 3; //a =30-7=23-7=16 -7 =9 - 7 = 2
        int b = 8;

        int count = 0; // count = 1+1=2+1 = 3+1 =4

        while (a >= b) {
            a -= b;
            count++;
        }


        System.out.println(count+" with a remainder of "+a);

    }
}
