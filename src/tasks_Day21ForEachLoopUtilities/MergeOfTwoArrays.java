package tasks_Day21ForEachLoopUtilities;

import java.util.Arrays;

public class MergeOfTwoArrays {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6};

        int sum[]=new int[arr1.length+ arr2.length];

        int i=0;
        for(int element:arr1){
            sum[i++]=element;
        }
        for(int element:arr2){
            sum[i++]=element;
        }

        System.out.println(Arrays.toString(sum));

        int sum2[]=Arrays.copyOf(arr1, 2);
        System.out.println(Arrays.toString(sum2));
    }
}
