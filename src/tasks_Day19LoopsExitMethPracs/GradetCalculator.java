package tasks_Day19LoopsExitMethPracs;

import java.util.Scanner;

public class GradetCalculator {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        String anotherOne;



        while (true) {
            System.out.println("Enter your score");
            int score = inPut.nextInt();

            if (!(score > 0 && score <= 100)) {
                System.err.println("invalid entry!");
                System.exit(0);
            }

            char grade = (score < 60) ? 'F' : (score < 70) ? 'D' : (score < 80) ? 'C' : (score < 90) ? 'B' : 'A';

            System.out.println(grade);

            System.out.println("Would you like to continue?");
            anotherOne = inPut.next().toLowerCase();

            while (!(anotherOne.equals("yes") || anotherOne.equals("no"))) {
                System.err.println("invalid entry re enter answer");
                anotherOne = inPut.next();
            }

            if (anotherOne.equals("no")) {
                System.out.println("thank you for using grade calculator APP");
                break;
            }

        }

        inPut.close();
    }
}