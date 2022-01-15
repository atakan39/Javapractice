package tasks_Day13_14;

import java.util.Scanner;

public class thhreeLetterWord {
    public static void main(String[] args) {
            Scanner inPut =new Scanner(System.in);

        System.out.println("Enter three letter word");
        String word=inPut.next();
        if (word.length() < 3) {
            System.out.println("Word is to short");
        }else if(word.length() > 3) {
            System.out.println("Word is to long");
        }else{
            if(word.charAt(1)=='a'){
                System.out.println("Cool word");
            }else{
                System.out.println("okay word");
        }
        }
        System.out.println(word.length()+" letters input");

inPut.close();
    }
}
/*
@@@ 1. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'.
 In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */