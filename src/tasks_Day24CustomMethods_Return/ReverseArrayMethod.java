package tasks_Day24CustomMethods_Return;

import java.util.Arrays;

public class ReverseArrayMethod {

    public static void main(String[] args) {

        int [] numbers={1,2,3,4,5};

        numbers=reverseArray(numbers);

        System.out.println(Arrays.toString(numbers));


    }

    public static int []reverseArray(int [] array){

        int [] reverse=new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }
}
/*
@@@    6.creat a method that can return the reversed array.

    {1,2,3,4,5}  =====> {5,4,3,2,1}
 */