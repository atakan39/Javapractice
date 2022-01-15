package tasks_Day23CustomMethods;

public class GradeOfStudent {
    public static void main(String[] args) {

        grade(69);
    }

    public static void grade(int score) {
        if (score >= 0 && score <= 100) {
            String result = (score >= 90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
            System.out.println("Your grade based on the score "+score+" = "+result);
        }else{
            System.err.println("Enter a valid score!");
        }
    }
}
/*
@@@	5. create a method that can calculate the grade of the student based on the score
 */