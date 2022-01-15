package tasks_Day13_14;

public class FirstLast_Same {
    public static void main(String[] args) {

        String word="level";
        char fisrtCh=word.charAt(0);
        char lastch=word.charAt(word.length()-1);
        if(fisrtCh==lastch){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

    }
}
/*1. write a program that can check if the first and last characters of the string are same
        ex:
        level
        output:
        same

 */