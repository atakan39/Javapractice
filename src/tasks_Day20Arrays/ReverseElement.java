package tasks_Day20Arrays;

import java.util.Arrays;

public class ReverseElement {
    public static void main(String[] args) {

        String[]names={"atakan","emre","ali"};

        String reverseName[]={"","",""};

        for (int j = 0; j < names.length ; j++) {

            for (int i = names[j].length()-1; i >=0 ; i--) {
                reverseName[j]+=names[j].charAt(i);
            }

            System.out.println(reverseName[j]);
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(reverseName));

    }
}
