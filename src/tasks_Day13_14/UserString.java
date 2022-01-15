package tasks_Day13_14;

import java.util.Scanner;

public class UserString {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter a String");
        String userString=inPut.next();

        if(!userString.isEmpty()){
            if(userString.length()>3){
                System.out.println(userString.substring(userString.length()-3));
            }else {
                System.out.println(userString);
        }}else{
            System.out.println("string is empty");
        }

        inPut.close();
    }
}
/*
@@@ 3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
