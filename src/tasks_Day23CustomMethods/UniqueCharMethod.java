package tasks_Day23CustomMethods;

public class UniqueCharMethod {
    public static void main(String[] args) {

        uniqueChar("atakan");

    }

    public static void uniqueChar(String str) {
        String chars = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!chars.contains("" + str.charAt(i)) && !(str.charAt(i) + "").isBlank()) {
                chars += str.charAt(i);
            }
        }
        for (int j = 0; j < chars.length(); j++) {
            int freqs = 0;


            for (int i = 0; i < str.length(); i++) {
                if (chars.charAt(j) == str.charAt(i)) {
                    freqs++;
                }
            }
            if (freqs == 1) {
                result += "" + chars.charAt(j);
            }


        }
        System.out.println(result);

        }
    }
/*
1. create a method that can display the unique characters of a string
 */