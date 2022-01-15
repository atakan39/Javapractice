package tasks_Day13_14;

import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter a sentence:");

        /*String sentence=input.nextLine();

        sentence=sentence.toLowerCase();
        System.out.println(sentence);
        System.out.println("enter a word");
        String sentence2=input.next();
        sentence2=(sentence2+"\n").repeat(4);
        System.out.println(sentence2);
*/
        String s1="I love java";

        int ch =s1.indexOf("l"); // int variable=string.indexOf(letter)=> result integer
        System.out.println(ch);
        int chLast=s1.length()-1;
        System.out.println(chLast);
        char lastCharacter=s1.charAt(s1.length()-1 ); // char variable=string.charAt(number) result=> letter or sprecial characters
        System.out.println(lastCharacter);

        input.close();
    }
}
