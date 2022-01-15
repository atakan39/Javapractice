package tasks_Day15;

public class ReturnDigitsSum {
    public static void main(String[] args) {

        String str="ABC4B2";

        int sumOfNumber=0;

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            switch (ch){
                case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57:
                    sumOfNumber+=str.charAt(i);
            }
        }
        System.out.println(sumOfNumber);




    }
}
/*
25. Write a program that can return the sum of digits from a  string
 Ex:
        input: A1B2C3

        output:    6

        Hint: You need to get each of the character by using a loop
        To convert char to number:
        '0' - 48   ==> 0
        '1' - 48   ==> 1
        */
