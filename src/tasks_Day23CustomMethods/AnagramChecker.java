package tasks_Day23CustomMethods;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {

        anagramChecker("kemal","malek");
    }

    public static void anagramChecker(String word1,String word2){

       char ch1[]=word1.toCharArray();
       char ch2[]=word2.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);

       if(Arrays.equals(ch1,ch2)){
           System.out.println("Given Strings is anagram");
       }else{
           System.out.println("not anagram");
       }
    }
}
/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */