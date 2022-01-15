package tasks_Day18NestedLoop;

import java.util.Scanner;

public class FreqOfTheChar {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("enter a sentence or word");
        String str=inPut.nextLine().toLowerCase();

        String chars="";
       String result="";

        for (int i =0; i<str.length(); i++){
            if(!chars.contains(""+str.charAt(i)) && !(str.charAt(i)+"").isBlank()){
                chars+=str.charAt(i);
            }
        }



       for(int j=0; j<chars.length(); j++){
           int freqs=0;
           for(int i=0; i<str.length(); i++){

               if(chars.charAt(j)==str.charAt(i)){
                   freqs++;
               }
           }
           result+=""+chars.charAt(j)+freqs;
       }

        System.out.println(result);
        System.out.println(chars);

       inPut.close();
    }

}
/*
4. Write a program that can find the frequency of the characters from a string    nested for loopi

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */