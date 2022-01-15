package tasks_Day16;

import java.util.Scanner;

public class JavaFrequencyWithReplace {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userStr = inPut.nextLine().toLowerCase();

        System.out.println("Enter a word:");
        String word=inPut.next().toLowerCase();



        int wordFreq=0;

        for(int i=0; i<userStr.length(); i++ ){
            if(userStr.contains(word)){
                userStr=userStr.replaceFirst(word,"");
                wordFreq++;
            }
        }
        System.out.println(" "+wordFreq);



    }

}
/*
4. write a program that can return the frequency of the a word Java from the sentence  ??

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */
