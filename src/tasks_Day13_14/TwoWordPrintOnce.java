package tasks_Day13_14;

import java.util.Locale;
import java.util.Scanner;

public class TwoWordPrintOnce {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1= inPut.next().toLowerCase();
        System.out.println("Enter second word:");
        String word2=inPut.next().toLowerCase();

         char last=word1.charAt(word1.length()-1);
         char first=word2.charAt(0);

         String output="";

        if(last==first){
            output=word1+word2.substring(1);
        }
        System.out.println(output);

        inPut.close();
    }
}
/*
10. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */