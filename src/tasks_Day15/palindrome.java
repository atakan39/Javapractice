package tasks_Day15;

public class palindrome {
    public static void main(String[] args) {
        String str="civic";
        String reversed="";

        for(int i = str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        boolean isPalindrom=str.equalsIgnoreCase(reversed);


        System.out.println(isPalindrom);
    }
}
/*
27. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */
