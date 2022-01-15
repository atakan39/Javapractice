package tasks_Day32Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class replt2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(12, 5, 7, 8));  // 5+5+5+5+5+5  +5     12+5+7+8=33/5= 6 +1 = 7

        int buyGas = refuel_times(list, 5);

        System.out.println("you need to fill "+buyGas+" times your gas tank.");

    }

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {


        int sum = 0;

        for (int each : deliveries) {
            sum += each;
        }

        if (sum % max_fuel != 0) {
            return sum / max_fuel + 1;

        } else {
            return sum / max_fuel;
        }

    }
}