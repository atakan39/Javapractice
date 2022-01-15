package tasks_Day13_14;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter two sentence");

        String sen1=inPut.nextLine();
        String sen2=inPut.nextLine();

        if(sen1.length()>sen2.length()){
            System.out.println(sen1);
        }else{
            System.out.println(sen2);
        }

        inPut.close();
    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */
