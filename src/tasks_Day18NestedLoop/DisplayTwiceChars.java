package tasks_Day18NestedLoop;

public class DisplayTwiceChars {
    public static void main(String[] args) {
        String word = "abbbbdccdee";
        String appearTwice = "";



        for (int j = 0; j < word.length(); j++) {

            int freqs = 0;

            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(j) == word.charAt(i)) {
                    freqs++;
                }

            }


            if (freqs == 2 && !(appearTwice.contains(word.charAt(j)+""))) {
                appearTwice += word.charAt(j);
            }
        }

        System.out.println("chars appears twice : "+appearTwice);


    }
    }
/*
Write a program that can display all the characters that appeared twice in the string.
 */