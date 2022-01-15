package tasks_Day28ArrayList;

import java.util.ArrayList;

public class Retrieve_Task {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";

        char chars[]=str.toCharArray();

        ArrayList<Character>letters=new ArrayList<>();
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>specialCharacters=new ArrayList<>();

        for (char aChar : chars) {
            if(Character.isLetter(aChar)){
                letters.add(aChar);
            }else if(Character.isDigit(aChar)){
                digits.add(aChar);
            }else{
                specialCharacters.add(aChar);
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialCharacters);


    }
}
/*
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */
