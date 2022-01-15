package tasks_Day18NestedLoop;

public class IndeksNumOfFirstDupChar {
    public static void main(String[] args) {

        String word = "dfdfgthkbnk";

        String wordUntilpause="";

        for (int j = 0; j < word.length(); j++) {

            int freqs = 0;

            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(j) == word.charAt(i)) {
                    freqs++;
                }
            }
            wordUntilpause+=""+word.charAt(j);

            if (freqs >1) {
                System.out.println("First duplicated char: "+word.charAt(j)+" frequency ="+freqs+" times");
                System.out.println("indeks no = " + (wordUntilpause.length()-1));
                break;
            }

        }

    }

        }
/*
@@@   2. Write a program that can return the index number of the first duplicated character from a string

 */