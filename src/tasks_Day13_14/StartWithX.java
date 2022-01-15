package tasks_Day13_14;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter a word:");
        String word= inPut.next().toLowerCase();

        if(word.startsWith("x") || word.charAt(0)=='x'){
            System.out.println(word.substring(1));
            System.out.println(word.replaceFirst("x",""));
        }

        }
}
/*
    Ask user to enter a word. If the work starts with x, print the word without x.
        Input:
        xcode
        Output:
        code

 */