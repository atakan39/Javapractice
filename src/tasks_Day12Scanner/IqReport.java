package tasks_Day12Scanner;

import java.util.Scanner;

public class IqReport {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String result = "";
        System.out.println("what is you iq score ?");
        int score = inPut.nextInt();

        if (score >= 60 && score <= 140) {
            if (score < 81) {
                result = "stupid motherfucker";
            } else if (score < 101) {
                result = "normal insan evladi";
            } else if (score < 121){
                result = "smart bitch";
        } else {
            result = "you are fucking genius maaan";
        }
    }else{
            result="Invalid Enter try again ";
        }
        System.out.println(result);

        inPut.close();
    }
}
