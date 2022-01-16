package tasks_Day07;

public class MaxNumber {
    public static void main(String[] args) {
       int n1=100;    int n2 = 200;
        String max,
                min;


        boolean n1IsMax = n1 > n2;

        if(n1IsMax) {
            max = "max number = " + n1;
            min = "min number = " + n2;
        }
            else{

                max ="max number = "+n2;
            min ="min number = "+n1;
        }
        System.out.println(max+"\n"+min);

            /*
            if(n2 > n1){
           max ="max number = "+n2;
       }
       else{
           max ="max number = "+n1;
       } */


       }
    }

 /*   Maximum number between two different numbers
      min number between two different number
  */