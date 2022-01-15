package tasks_Day32Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shortquiz {
    public static String at3(String target,String word){

        target=target.substring(0,3)+word+target.substring(3+word.length());


     return target;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));



    }
}
