package tasks_Day25CustomMethods_Overloading;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {

        int []arr1={2,3};
        int []arr2={4,5};

        String class1[]={"atakan","emre"};
        String class2[]={"omer","sidar"};


        String merged2[]=mergeArray(class1,class2);
        System.out.println(Arrays.toString(merged2));

        int merged[]=mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(merged));


    }


    public static int[] mergeArray(int arr1[], int arr2[]) {

        int merge[] = new int[arr1.length + arr2.length];

        int count = 0;

        for (int each : arr1) {
            merge[count++] = each;
        }
        for (int each : arr2) {
            merge[count++] = each;
        }

        return merge;
    }

    public static double[] mergeArray(double arr1[], double arr2[]) {

        double merge[] = new double[arr1.length + arr2.length];

        int count = 0;

        for (double each : arr1) {
            merge[count++] = each;
        }
        for (double each : arr2) {
            merge[count++] = each;
        }

        return merge;
    }

    public static String[] mergeArray(String arr1[], String arr2[]) {

        String merge[] = new String[arr1.length + arr2.length];

        int count = 0;

        for (String each : arr1) {
            merge[count++] = each;
        }
        for (String each : arr2) {
            merge[count++] = each;
        }

        return merge;
    }

    public static char[] mergeArray(char arr1[], char arr2[]) {

        char merge[] = new char[arr1.length + arr2.length];

        int count = 0;

        for (char each : arr1) {
            merge[count++] = each;
        }
        for (char each : arr2) {
            merge[count++] = each;
        }

        return merge;
    }
}


/*
task 3  arrayMerger

 > creat a method that can merge two integer array

 > creat a method that can merge two char array

 > creat a method that can merge two double array

 > creat a method that can merge two String array
 */