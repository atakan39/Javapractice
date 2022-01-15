package tasks_Day16;

import java.util.Scanner;

public class Multipilication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int multiplication=0;

        System.out.println("Enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();

        if(num1>0&&num2>0){
            for(int i=1; i<=num1; i++){
                multiplication+=num2;
            }
        }else{
            System.out.println("invalid");
        }

        System.out.println(num1+" * "+num2+" = "+multiplication);

        input.close();
    }
}
