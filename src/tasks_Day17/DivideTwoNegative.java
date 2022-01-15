package tasks_Day17;

import java.util.Scanner;

public class DivideTwoNegative {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        System.out.println("Enter dividend");
        double dividend = inPut.nextInt();
        System.out.println("Enter divisor");
        double divisor = inPut.nextInt();

        double leftOver = dividend;
        double count = 0;
        double a = (dividend % divisor) / divisor;
        double result;

// if both negative
        if (dividend < 0 && divisor < 0) {

            while (leftOver <= divisor) {
                leftOver -= divisor;
                count++;
            }
            if (dividend > divisor) {
                if (dividend % divisor == 0 )
                    result = count;
                else {
                    result = count + a;
                }
                result = count + a;
            } else if (dividend < divisor) {
                result = count + a;
            }else{
                result=count;
            }

            System.out.println(result+"");
        }


inPut.close();
    }
}
