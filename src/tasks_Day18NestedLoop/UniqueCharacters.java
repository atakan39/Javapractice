package tasks_Day18NestedLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String chars = "";
        String result = "";

        System.out.println("Enter a word or sentence");
        String str = inPut.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (!chars.contains("" + str.charAt(i)) && !(str.charAt(i) + "").isBlank()) {
                chars += str.charAt(i);
            }
        }
        for (int j = 0; j < chars.length(); j++) {
            int freqs = 0;


            for (int i = 0; i < str.length(); i++) {
                if (chars.charAt(j) == str.charAt(i)) {
                    freqs++;
                }
            }
            if (freqs == 1) {
                result += "" + chars.charAt(j);
            }


        }
        System.out.println(result);

        inPut.close();
    }
}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf()
methods nested for loop

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, e
            the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */