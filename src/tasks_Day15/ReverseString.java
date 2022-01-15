package tasks_Day15;

public class ReverseString {
    public static void main(String[] args) {
        String str="Wooden Spoon";

        String result=" ";
        String loopResult=" ";// contain reverse version of str.

        // str.length()-1 == 11
        result += str.charAt(11); // n
        result += str.charAt(10); // o
        result += str.charAt(9); // o
        result += str.charAt(8);//p
        result += str.charAt(7);// S
        result += str.charAt(6);// " "
        result += str.charAt(5);//n
        result += str.charAt(4);//e
        result += str.charAt(3);//d
        result += str.charAt(2);//o
        result += str.charAt(1);//o
        result += str.charAt(0);//W

        // we can do this with loop

        for (int i=11; i>=0; i--){ // i: index number of str last index to 0  length()-1 {last index}
            loopResult+=str.charAt(i);
        }

        System.out.println(result);
        System.out.println(" ");

        System.out.println(loopResult.toLowerCase());
    }
}
/* 26. Write a program that can reverse any given string

        Ex:
        input:
        Wooden Spoon

        output:
        noopS nedooW

 */