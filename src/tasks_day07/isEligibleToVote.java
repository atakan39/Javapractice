package tasks_day07;

public class isEligibleToVote {
    public static void main(String[] args) {

            int age = 16;
            String result;
            boolean isEligible = age >= 18;

            if(isEligible){
                result = "Can Vote!";
            }
            else{
                result = "CAN NOT Vote!";
            }
            System.out.println(result);


        }
}
