package tasks_Day12Scanner;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        String result="";
        System.out.println("How many people do you live with ?");
        int people =inPut.nextInt();

        if(people>0){
            if(people<3){
                result="Live with less than 3 people";
            }else if(3<=people && people<=6){
                result="Live with 3 - 6 people";
            }else{
                result="Live with more than 6 people";
            }
        }else{
            result="Invalid Enter try again ";
        }
        System.out.println(result);

        inPut.close();
    }
}
