package tasks_Day08_09;

public class NumberToWord {
    public static void main(String[] args) {
        int n = 5;
        String word = "";
        if (n >= 0 && n <= 9) {
            word = (n == 0) ? "Zero" : (n == 1) ? "One" : (n == 2) ? "Two" : (n == 3) ? "Three" : (n == 4) ? "Four"
                    : (n == 5) ? "Five" : (n == 6) ? "Six" : (n == 7) ? "Seven" : (n == 8) ? "Eight" : "Nine";
        } else {
            word = "Invalid entry";
        }
        System.out.println(word);
    }
}
