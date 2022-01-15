package tasks_Day17;


import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("will you marry me?");

        String answer=inPut.next().toLowerCase();

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("invalid answer, Please re-enter");
            answer=inPut.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("congrats");
        }else{
            System.out.println("GoodBye");
        }

inPut.close();
    }
}
/*
Task:
    2.
      Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and
     repeat it until the user enters either yes or no
 */
