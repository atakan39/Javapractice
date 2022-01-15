package tasks_Day21ForEachLoopUtilities;

import java.util.Arrays;

public class WordAppearance {
    public static void main(String[] args) {

        String sentence="java python always good to use java";

        String words[]=sentence.split(" ");

        System.out.println(Arrays.toString(words));
        int countOfJava=0;
        int countOfPython=0;
        for (String word:words) {
            if(word.equalsIgnoreCase("java")){
                countOfJava++;
            }
            if(word.equalsIgnoreCase("python")){
                countOfPython++;
            }
        }
        System.out.println("Java counts: "+countOfJava+" Python counts: "+countOfPython);
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */