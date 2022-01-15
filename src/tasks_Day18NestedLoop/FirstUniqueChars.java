package tasks_Day18NestedLoop;

public class FirstUniqueChars {
    public static void main(String[] args) {
        String word = "aaaskdjfhgjksdjkfk";


        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j);
            int freqs = 0;

            for (int i = 0; i < word.length(); i++) {

                if (ch == word.charAt(i)) {
                    freqs++;
                }
            }
            if(freqs==1){
                System.out.println(word.charAt(j)+" is first unique char");
                break;
            }
        }
    }
}
/*
 @@@   4. Write a program that can return the index number of the first unique character.
 */