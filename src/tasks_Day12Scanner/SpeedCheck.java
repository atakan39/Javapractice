package tasks_Day12Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit =55;
        String warning="";
        Scanner inPut = new Scanner(System.in);
        int speed =inPut.nextInt();

        int overLimit=speed-speedLimit;

        warning=(speed>speedLimit)?"You're driving "+overLimit+" mph over the limit. Slow down!":" ";

        System.out.println(warning);

        inPut.close();

    }
}
