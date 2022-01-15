package tasks_Day22MultiDimensionalArray;

public class OddEvenMultiDimensional {
    public static void main(String[] args) {

        int numbers[][] = {{10, 80, 70}, {5, 1, 20}};
         int countOdd=0;
        int countEven=0;
        for (int[] arr1D : numbers) {
            for (int number : arr1D) {
                if(number%2==0){
                   countEven++;
                }else{
                    countOdd++;
                }
            }
        }
        System.out.println("even numbers: "+countEven+" Odd numbers: "+countOdd);
    }
}
/*
2. Write a program that can count the total odd and even numbers from a two dimensional array
 */