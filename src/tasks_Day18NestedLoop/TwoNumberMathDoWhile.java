package tasks_Day18NestedLoop;

import java.util.Scanner;

public class TwoNumberMathDoWhile {
    public static void main(String[] args) {

        Scanner inPut=new Scanner(System.in);

        String anotherOne;
    do{
        System.out.println("enter first number");
        int num1=inPut.nextInt();

        System.out.println("choose your math operator");
        char operator = inPut.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.err.println("Please re-enter operator (+,-,*,/)");
            operator = inPut.next().charAt(0);
        }

        System.out.println("enter second number");
        int num2=inPut.nextInt();

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

        System.out.println("Would u like to continue?");
       anotherOne=inPut.next().toLowerCase();

        while(!(anotherOne.equals("yes") || anotherOne.equals("no"))){
            System.out.println("re enter answer ! Would u like to continue?");
            anotherOne=inPut.next().toLowerCase();
        }




    }while(anotherOne.equals("yes"));


inPut.close();
    }
}
/*
@@@ 3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
