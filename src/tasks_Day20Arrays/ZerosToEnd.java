package tasks_Day20Arrays;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {

        int array []= {10, 0, 5, 0, 1, 0};
        int zeroEnd[]=new int[array.length];

        for (int i = 0, j=0 ; i < array.length; i++) {
            if(array[i]!=0){
                zeroEnd[j]=array[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(zeroEnd));


       /*         int array[] = {10, 0, 5, 0, 1, 0};
                int MoveZ[] = new int[array.length];
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != 0) {
                        MoveZ[count] = array[i];
                        count++;
                    }
                }
                System.out.println(Arrays.toString(MoveZ));

        */
            }
        }
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */

