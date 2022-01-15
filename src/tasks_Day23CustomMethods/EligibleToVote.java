package tasks_Day23CustomMethods;

public class EligibleToVote {
    public static void main(String[] args) {

        eligiblityVoting(23,"UsA");
    }


    public static void eligiblityVoting(int age,String citizenship){
        if(age>=21&&citizenship.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote!");
        }else{
            System.err.println("You are not eligible to vote!");
        }
    }
}
