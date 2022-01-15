package tasks_Day23CustomMethods;

import java.util.Arrays;

public class PrintEachChar {
    public static void main(String[] args) {

      printEachChar("atakan");
    }

    public static void printEachChar(String str){
        if(str.contains(" ")){
            str=str.replace(" ", "");
        }

        //way 1
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+", ");
        }

        System.out.println();

        // way 2

        for (char each : str.toCharArray()) {
            System.out.print(each+", ");
        }
    }
}
/*
13. create a method named printEachChar that can print each characters of a string
 */