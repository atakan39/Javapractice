package tasks_Day32Constructors;

public class MovesToEqualize {
    public static void main(String[] args) {

        int[] array = {1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(calMoves(array, 0, 1));

        System.out.println("---------------");

        System.out.println(calMoves3(array, 1, 0));

    }


    public static int calMoves(int[] arr, int num1, int num2) {
        int movesCount;
        int equality = arr.length / 2;

        int countnum1 = 0;
        int countnum2 = 0;

        if (arr.length % 2 == 0) {

            for (int each : arr) {

                if (each == num1) {
                    countnum1++;
                }

                if (each == num2) {
                    countnum2++;
                }

            }

            if (countnum1 > countnum2) {
                movesCount = (countnum1 - countnum2) / 2;
            } else if (countnum2 > countnum1) {
                movesCount = (countnum2 - countnum1) / 2;
            } else {
                movesCount = 0;
            }

            System.out.println("each element has to repeat " + equality + " times. For that we need make " + movesCount + " moves.");
            return movesCount;

        } else {

            System.err.println("Array length is not able to equalize");
            return 0;
        }

    }

    public static int calMoves2(int[] arr, int num1, int num2) {
        int movesCount, countnum1 = 0, countnum2 = 0;

        for (int each : arr) {
            if (each == num1)
                countnum1++;
            if (each == num2)
                countnum2++;
        }

        if (countnum1 > countnum2) {
            movesCount = (countnum1 - countnum2) / 2;
        } else {
            movesCount = (countnum2 - countnum1) / 2;
        }
        return movesCount;
    }

    public static int calMoves3(int[] arr, int num1, int num2) {
        int movesCount=0;
        int countnum1 = 0;
        int countnum2 = 0;

        for (int each : arr) {
            if (each == num1)
                countnum1++;
            if (each == num2)
                countnum2++;
        }
         movesCount=Math.abs((countnum1-countnum2)/2);
        return movesCount;

    }
}