package tasks_Day25CustomMethods_Overloading;

import java.util.Arrays;

public class reverseArrayOverloading {
    public static void main(String[] args) {

        String []arr={"atakan", "emre"};

        arr=reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    // reverse int array
    public static int []reverseArray(int [] array){

        int [] reverse=new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }
    // reverse double array
    public static double []reverseArray(double [] array){

        double [] reverse=new double[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }
    // reverse char array
    public static char []reverseArray(char [] array){

        char [] reverse=new char[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }
    // reverse String array
    public static String []reverseArray(String [] array){

        String [] reverse=new String[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }

}
