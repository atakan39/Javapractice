package tasks_Day24CustomMethods_Return;

import java.util.Arrays;

public class MergeArraysMethod {
    public static void main(String[] args) {

        int []group1={1,2,3};
        int []group2={4,5};

      int []newGorup=mergeArrays(group1,group2);

        System.out.println(Arrays.toString(newGorup));

    }

    public static int [] mergeArrays(int arr1[],int arr2[]){

        int merge[]=new int[arr1.length+arr2.length];

        int count=0;

        for (int each: arr1) {
            merge[count++]=each;
        }
        for (int each: arr2) {
            merge[count++]=each;
        }

        return merge;

    }
}
/*
7.creat a method that can merge two arrays and return the new Arrays

               arr1={1,2,3}
               arr2={4,5}

 */