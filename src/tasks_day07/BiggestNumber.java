package tasks_day07;

public class BiggestNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 10,
                c = 8,
                d = 7;

        String maxNumber;
        String preCentence = "Max number is = ";

        boolean aIsMax = a > b && a > c && a > d;
        boolean bIsMax = !aIsMax && b > c && b > d;
        boolean cIsMax = !aIsMax && !bIsMax && c > d;


        if (aIsMax) maxNumber = preCentence + a;
        else if (bIsMax) maxNumber = preCentence + b;
        else if (cIsMax) maxNumber = preCentence + c;
        else {           maxNumber = preCentence + d;
        }

        System.out.println(maxNumber);
    }
}
