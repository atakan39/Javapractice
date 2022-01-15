package tasks_Day21ForEachLoopUtilities;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

       String sentence = "Today is a good day to learn Java";

       String words[]=sentence.split(" ");



        String []reversedSentence=new String[words.length];
         int i=words.length-1;
         for (String word:words) {
            reversedSentence [i--]=word+" ";
        }
        String reversed="";

        for (String each:reversedSentence) {
            reversed+=each;
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(reversedSentence));
        System.out.println(reversed);
    }
}
