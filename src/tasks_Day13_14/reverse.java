package tasks_Day13_14;

public class reverse {
    public static void main(String[] args) {
        String word="abcde";
        String reverse="";

        if(word.length()>5){
            System.out.println("too long");
        }else if(word.length()<5){
            System.out.println("Too short");
        }else{
            for(int i=word.length()-1; i>=0;i--){
               reverse += word.charAt(i);
            }
            System.out.println(reverse);
        }

    }
}
/*
Create a class called Reverse, write a program that will reverse a string. Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */
