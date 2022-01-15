package tasks_Day21ForEachLoopUtilities;

public class Palindrome {
    public static void main(String[] args) {

     String [] words= {"anna", "level", "Java"};
        int count=0;
        for (String word:words) {
          String reverseWord="";

            for (int i = word.length()-1; i >= 0 ; i--) {
                reverseWord+=word.charAt(i);
            }
            if(word.equalsIgnoreCase(reverseWord)){
                System.out.print(" Word "+word+" is palidrome, ");
                count++;
            }

        }
        System.out.println(count+" words are palindrome");


    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
