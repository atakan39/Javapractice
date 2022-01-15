package tasks_Day15;

public class DigitsLettersSpeacialChars {
    public static void main(String[] args) {
        String str="asdfghj12345 67!@#$% ";
        String letters="";
        String numbers="";
        String specialChars="";



        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if('0'<=ch && ch<='9'){
                numbers+=ch;
            }else if('a'<=ch && ch<='z'||'A'<=ch && ch<='Z'){
                letters+=ch;
            }else{
                if(ch !=' '){
                 specialChars+=ch;
                }
            }
        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specialChars);
    }
}
/*
24. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */