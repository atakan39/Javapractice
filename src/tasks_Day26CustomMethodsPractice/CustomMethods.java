package tasks_Day26CustomMethodsPractice;

import java.util.Arrays;

public class CustomMethods {
    public static void main(String[] args) {

        String str1="mekal";
                String str2="kemal";


        System.out.println(isAnagram(str1,str2));

        System.out.println(reverse("atakan"));

        System.out.println(isPalindrome("lewel"));

        int [] numbers={1,1,1,1,1,2,2};

        int [] numbers2={4,4,4,4};



        System.out.println(frequencyOfElement(numbers,1));

        System.out.println(Arrays.toString(addElement(numbers,3)));

        System.out.println(Arrays.toString(merge(numbers,numbers2)));

        System.out.println(Arrays.toString(reverse(numbers)));
        System.out.println(contains(numbers,2));
    }

    public static boolean isAnagram(String word,String word2){

      char[] ch=word.toCharArray();
      char[] ch2=word2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);


        return Arrays.equals(ch,ch2);


    }

    public static String reverse(String word){
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String word){

        return word.equals(reverse(word));
    }

    public static int frequencyOfElement(int []array,int number){
        int count=0;
        for (int each:array) {
            if(each==number){
                count++;
            }
        }
        return count;
    }

    public static int[]addElement(int[]array,int number){
        int []arr=new int[array.length+1];

        int i=0;
        for (int each:array) {
            arr[i++]=each;
        }
        arr[i++]=number;

        return arr;
    }

    public static int[]merge(int[]array1,int[]array2){
        int[] arr3=new int[array1.length+ array2.length];

        int i=0;

        for (int each : array1) {
            arr3[i++]=each;
        }
        for (int each : array2) {
            arr3[i++]=each;
        }

        return arr3;

    }

    public static int[]reverse(int[]array){
        int reverse[]=new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }

    public static boolean contains(int [] array,int number){
        int count=0;
        for (int each : array) {
            if(each==number){
                count++;
            }
        }
       boolean contains=count>0;
        return contains;
    }
}
