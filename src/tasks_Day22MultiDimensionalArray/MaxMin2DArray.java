package tasks_Day22MultiDimensionalArray;

public class MaxMin2DArray {
    public static void main(String[] args) {

        int numbers[][] = {{10, 80, 70}, {5, 1, 20}};

        int max = numbers[0][0];
        int min = numbers[0][0];
        for (int[] each1d : numbers) {
            for (int element : each1d) {
                if (element > max) {
                    max = element;
                }
                if (element < min) {
                    min = element;
                }
            }
        }
        System.out.println("max number: "+max);
        System.out.println("min number: "+min);

    }
}
/*
@@@ 1. Write a program that can find the minimum and maximum numbers from a two dimensional array
 */