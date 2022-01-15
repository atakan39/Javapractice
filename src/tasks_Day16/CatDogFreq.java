package tasks_Day16;

import java.util.Scanner;

public class CatDogFreq {
    public static void main(String[] args) {

        Scanner inPut=new Scanner(System.in);
        String sentence=inPut.nextLine();
        String word1=inPut.next();
        String word2=inPut.next();

        int word1Freq=0;
        int word2Freq=0;

        if(word1.length()==word2.length()) {
            for (int i = 0; i <=sentence.length() - word1.length(); i++) {
                if (sentence.substring(i, i + word1.length()).equalsIgnoreCase(word1)) {
                    word1Freq+=1;
                } else if(sentence.substring(i, i + word2.length()).equalsIgnoreCase(word2)) {
                    word2Freq+=1;
                }
            }
        }else{
            for (int i = 0; i <= sentence.length() - word1.length(); i++) {
                if (sentence.substring(i, i + word1.length()).equalsIgnoreCase(word1)) {
                    word1Freq+=1;
                }
            }
            for (int i = 0; i <=sentence.length() - word2.length(); i++) {
                if (sentence.substring(i, i + word2.length()).equalsIgnoreCase(word2)) {
                    word2Freq+=1;
                }
            }
        }
        boolean freQEquality=word1Freq==word2Freq;


        System.out.println(" Freq of word1: "+word1Freq);
        System.out.println(" Freq of word2: "+word2Freq);

        System.out.println(freQEquality);
        inPut.close();
    }
}
/*
5. write a program to print true if the string "cat" and "dog"
appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */