package tasks_Day13_14;

import java.util.Scanner;

public class FirstDigitLetterOrSpecial {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter a word");
        String word=inPut.next();
        String result="";
        char firstCh=word.charAt(0);

        if(firstCh >= '0' && firstCh <= '9'){ //if the character is between '0' to '9' then it's digit
           result="first character is digit";
        }else if(firstCh >= 'A' && firstCh <= 'Z'){ // if the character is between 'A' to 'Z' then it's letter
            result="first character is uppercase letter";
        }else if(firstCh >= 'a' && firstCh <= 'z'){// if the character is between 'a' to 'z' then it's letter
            result="first character is lowercase letter";
        }else{ // if the character is neither digit nor letter, then it's special character
            result="first character is special character";
            }


        System.out.println(result);
        inPut.close();
}
}
/*
11. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
        2. Ascii Table
 */
