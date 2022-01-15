package tasks_Day18NestedLoop;

public class FirstDuplicatedChar {
    public static void main(String[] args) {

        String word = "abbbbccddee";



        for (int j = 0; j < word.length(); j++) {

            int freqs = 0;

            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(j) == word.charAt(i)) {
                    freqs++;
                }
            }


            if (freqs >1) {
                System.out.println("First duplicated char: "+word.charAt(j)+"\nfrequency : "+freqs+" times");
                System.out.println("index number of "+word.charAt(j)+" : "+word.indexOf(word.charAt(j)));
                break;
            }

        }
    /*    1. Write a program that can return the first duplicated character from a string */
    }
}