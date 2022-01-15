package tasks_Day16;

import java.util.Locale;
import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userStr = inPut.nextLine().toLowerCase();

        System.out.println("Enter a char:");
        String userCh =inPut.next().toLowerCase();


        int charFreq=0;


        for (int i = 0; i < userStr.length(); i++) {
            if (userCh.equals(userStr.charAt(i)+"")) {
               charFreq++;
            }
        }
        System.out.println(""+charFreq);

        inPut.close();

    }
}
/* 2. Write a program that asks user to enter a string and a char,
the returns the frequency of the char from the given string
        Ex:
        inputs:
        str = "aabcccd";
        char = 'c';

        output: 3

        inputs:
        "Java programming language"
        'g'

        output: 4

 */