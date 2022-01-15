package tasks_Day15;

public class PrintShape {
    public static void main(String[] args) {
        String character="&";
        String print="";

        for(int i=0; i<6; i++){
           print+=(character+" ");
        }
        for (int i=0; i<8; i++){
            System.out.println(print);
        }

    }
}
/*
   17. print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */
