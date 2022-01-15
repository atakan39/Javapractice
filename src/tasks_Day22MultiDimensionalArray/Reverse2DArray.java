package tasks_Day22MultiDimensionalArray;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {

       int Array2D [][] = { {1,2,3}, {4,5,6}};

       int reverseArray2D[][]=new int[Array2D.length][Array2D[1].length];

        for (int i = Array2D.length - 1, k=0; i >= 0; i-- ,k++) {

            for (int j=reverseArray2D[i].length-1 , l=0; j>=0; j--,l++){
                reverseArray2D[i][j]=Array2D[k][l];

            }

        }

        System.out.println(Arrays.deepToString(reverseArray2D));

    }
}
/*
@@@ 1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */