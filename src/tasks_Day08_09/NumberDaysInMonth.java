package tasks_Day08_09;

public class NumberDaysInMonth {
    public static void main(String[] args) {
        int n = 8;
        String totalDays;
        if (n>=1 && n<=12){
            totalDays =(n==2)?"28 Days":(n==4||n==6 || n == 9||n==11)? "30 days": "31 Days";
        }else {
            totalDays="Invalid Entry";
        }
        System.out.println("totalDays of month "+n+" = " + totalDays);

    }
}
   /* Create a class named NumberOfDays,
        an integer variable named month that has numbers 1 ~12 is given to you,
        write a program that can find the number of days in the given number of month.

        EX:
        month = 5

        output:
        31 days

        (Assume that February has 28 days)

    */
