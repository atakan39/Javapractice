package tasks_Day10;

public class NumberToWord {
    public static void main(String[] args) {
        int number=5;
        String word=(number==0)?"Zero":(number==1)?"One":(number==2)?"Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"Five":(number==6)?"Six"
                :(number==7)?"Seven":(number==8)?"Eight":(number==9)?"Nine" : "invalid";

        System.out.println(word);
    }

}
/*
2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */