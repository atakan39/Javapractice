package tasks_Day17;

import java.util.Scanner;

public class TwoNumberMath {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("enter first number");
        int num1=inPut.nextInt();
        System.out.println("enter second number");
        int num2=inPut.nextInt();


        System.out.println("choose your math operator");
        char operator = inPut.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("Please re-enter operator (+,-,*/)");
                operator = inPut.next().charAt(0);
            }
            switch (operator) {
                case '+':
                    System.out.println("Result = " + (num1 + num2));
                    break;
                case '-':
                    if(num2<0){
                    System.out.println("Result = " + (num1 -(-num2) ));
                    }else{
                        System.out.println("Result = " + (num1-num2));
                    }
                    break;
                case '*':
                    System.out.println("Result = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Result = " + (num1 / num2));
                    break;


            }
/*
        3. write a program to ask user to enter two number and math operator, and return the result.

        if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator
        (+, -, *, /)

 */

        }


    }

