package tasks_day07;

public class MedNumber {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 20;

        String med_Number;

        boolean aIsMed = (b < a && a < c) || (c < a && a < b);
        boolean bIsMed = (a < b && b < c) || (c < b && b < a);
        boolean cIsMed = !aIsMed && !bIsMed;

        if (aIsMed) {
            med_Number = a+" is the median number." ;
        } else if (bIsMed) {
            med_Number = b+" is the median number." ;
        } else {
            med_Number = c+" is the median number." ;
        }
            System.out.println(med_Number);

            /* if (aIsMed) {
                med_Number = a+" is the median number." ;
            } else if (bIsMed) {
                med_Number = b+" is the median number." ;
            } else {
                med_Number = c+" is the median number." ;

                System.out.println(med_Number);
              */


    }
}

