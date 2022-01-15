package tasks_Day13_14;

import java.util.Scanner;

public class TwoWordsWithoutFirst {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter two words:");
        String word1=inPut.next();
        String word2=inPut.next();

        word1=word1.substring(1);
        word2=word2.substring(1);
        System.out.println(word1);
        System.out.println(word2);


        inPut.close();

    }
}

/*
 Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
