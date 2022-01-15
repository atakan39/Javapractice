package tasks_Day21ForEachLoopUtilities;

import java.util.Arrays;

public class MergeOf3Array {
    public static void main(String[] args) {

       int arr1 [] = {30, 10, 20};
       int arr2 [] = {15, 40, 25, 35};
       int arr3 [] = {8, 9, 17, 5, 4, 1};

       int merge[]=new int[arr1.length+ arr2.length+ arr3.length];

       int count=0;
        for (int num:arr1) {
            merge[count++]=num;
        }
        for (int num:arr2) {
            merge[count++]=num;
        }
        for (int num:arr3) {
            merge[count++]=num;
        }

        System.out.println(Arrays.toString(merge));

        Arrays.sort(merge);

        System.out.println(Arrays.toString(merge));
}
  }
  /*
  @@@   5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}

   */