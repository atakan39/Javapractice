package tasks_Day25CustomMethods_Overloading;

public class FindMinElementOverloading {
    public static void main(String[] args) {


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

    public static double min(double [] array){

        double min=array[0];
        for (double each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static long min(long [] array){

        long min=array[0];
        for (long each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static short min(short [] array){

        short min=array[0];
        for (short each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static byte min(byte [] array){

        byte min=array[0];
        for (byte each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static float min(float [] array){

        float min=array[0];
        for (float each : array) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }
    
}
