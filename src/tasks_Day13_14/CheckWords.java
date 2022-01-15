package tasks_Day13_14;

public class CheckWords {
    public static void main(String[] args) {
        String w1="123456";
        String w2="123456";
        String w3="123456";

        boolean allDifferent=w1.length()>w2.length() && w1.length()>w3.length() && w2.length()!=w3.length()
                ||w2.length()>w3.length()&&w2.length()>w1.length() && w1.length()!=w3.length()
                ||w3.length()>w2.length()&&w3.length()>w1.length() && w2.length()!=w1.length();

        if(w1.length()==w2.length()&&w1.length()==w3.length()){
            System.out.println("All words are same length");
        }else if(allDifferent){
            System.out.println("All different length");
        }else{
            System.out.println("Not same nor Different lengths");
        }
    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
