package tasks_Day13_14;

import java.util.Scanner;

public class replaceX {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("enter a word");
        String word=inPut.next();

        if(word.charAt(0)=='x'){
            System.out.println(word.replaceFirst("x","a"));
        }

        inPut.close();

    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */