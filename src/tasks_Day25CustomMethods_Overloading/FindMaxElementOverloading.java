package tasks_Day25CustomMethods_Overloading;

public class FindMaxElementOverloading {
    public static void main(String[] args) {

        int array[]={10,14,20};
        int max=max(array);
        System.out.println(max);

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

    public static double max(double [] array){

        double max=array[0];
        for (double each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static long max(long [] array){

        long max=array[0];
        for (long each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static short max(short [] array){

        short max=array[0];
        for (short each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static byte max(byte [] array){

        byte max=array[0];
        for (byte each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static float max(float [] array){

        float max=array[0];
        for (float each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }


}
/*
@@@ task 4  find max number  /  min number

 > creat a method tha can return max number from an integer array

 > creat a method tha can return max number from an double array

 > creat a method tha can return max number from an long array

 > creat a method tha can return max number from an short array

 > creat a method tha can return max number from an float array

 > creat a method tha can return max number from an byte array

 */