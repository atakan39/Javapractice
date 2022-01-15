package tasks_Day13_14;

import java.util.Scanner;

public class replaceAllX {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("enter a word");
        String word=inPut.next();

        word=word.replace("x","a").replace("X","a");



        System.out.println(word);

        inPut.close();
    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
