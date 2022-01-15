package tasks_Day12Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String result="";

        System.out.println("please enter your Full Name");
        String fullName=inPut.nextLine();

        System.out.println("enter your score");
        double score=inPut.nextDouble();

        if (score>0 && score<=100){
            result=score>=90? "A":score>=80? "B":score>=70? "C":score>=60?"D":"F";

        }else{
            result="Invalid score! Try Again!";
        }
        System.out.println("dear "+fullName+ "\nYour score ="+score+"\nyour grade : "+result);

        inPut.close();
    }
}
