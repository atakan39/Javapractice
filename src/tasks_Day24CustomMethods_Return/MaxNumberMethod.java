package tasks_Day24CustomMethods_Return;

public class MaxNumberMethod {

    public static void main(String[] args) {
        int numbers[]={4,10,6,9};

        int max=max(numbers);

        System.out.println("max number = "+max);

        System.out.println("---------------------------------");
        int min=min(numbers);

        System.out.println("min number = "+min);

    }

    public static int max(int [] array){

        int max=array[0];
        for (int each : array) {
            if(each>max){
                  max=each;
            }
        }
        return max;
    }

    public static int min(int [] array){
        int min=array[0];
        for (int each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }
}
/*
@@@    4.creat a method that can return the maximum number from an array of integer.

@@@    5.creat a method that can return the minimum number from an integer array of integers
 */