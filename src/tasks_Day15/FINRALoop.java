package tasks_Day15;

public class FINRALoop {
    public static void main(String[] args) {

        String output="";
        for(int i=1; i<101; i++){
            if(i%15==0){
                output="FINRA ";
            }else if(i%5==0){
                output="RA ";
            }else if(i%3==0){
                output="FIN ";
            }else{
                output=i+" ";
            }
            System.out.print(output);
        }


        }

    }
 /* 18. Write a method which prints out the numbers from 1 to 100 butfor numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
          for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

          ex:
          output:
          1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

  */

