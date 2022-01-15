package tasks_Day13_14;

import java.util.Scanner;

public class LastFirstCharacters {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("enter a sentence");
        String s1=inPut.nextLine();

        char lastCh=s1.charAt(s1.length()-1);
        char firstCh=s1.charAt(0);
        System.out.println(firstCh);
        System.out.println(lastCh);

inPut.close();

    }
}
/*
write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */
