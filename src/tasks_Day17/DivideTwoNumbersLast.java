package tasks_Day17;

import java.util.Scanner;

public class DivideTwoNumbersLast {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);



        while(true){
            System.out.println("Enter dividend");
            double dividend = inPut.nextDouble();

            while(!(dividend >= 0)) {
                System.err.println("numbers can not be negative or 0 please re-enter");
                System.out.println("re-enter dividend");
                dividend = inPut.nextDouble();
            }

            System.out.println("Enter divisor");
            double divisor = inPut.nextDouble();


           while(!(divisor > 0)) {
               System.out.println("re-enter divisor");
               divisor = inPut.nextDouble();
           }

            double count = 0;
            double a = (dividend % divisor) / divisor;


            while (dividend>=divisor){
                dividend -= divisor;
                count++;}

            System.out.println( "Result of "+(dividend)+"/"+(divisor)+" = "+(count+a));

            System.out.println("continue???");
            String anotherOne=inPut.next().toLowerCase();

            while(!(anotherOne.equals("yes")||anotherOne.equals("no"))){
                System.out.println("re enter your answer");
                anotherOne=inPut.next().toLowerCase();
            }

if(anotherOne.equals("no")){
    System.out.println("Thank your for using divide calculator APP");
    break;
}

            }
    }

           }



