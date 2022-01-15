package tasks_Day13_14;

import java.util.Scanner;

public class EndsWithLy {
    public static void main(String[] args) {
      Scanner inPut=new Scanner(System.in);

        System.out.println("Enter a word:");
        String word=inPut.next().toLowerCase();
        String result;

        if(word.endsWith("ly")){
            result="really???";
        }else{
            result="never mind";
        }
        System.out.println(result);

        inPut.close();
    }
}
/*
ask the user to enter a word.
 if the word ends with "ly",
  print "really???" ,
    otherwise, print "never mind"
 */