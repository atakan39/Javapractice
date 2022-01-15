package tasks_Day23CustomMethods;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        eligiblityToBuyAlcohol(22);
    }

    public static void eligiblityToBuyAlcohol(int age){
        if(age>0&&age<140){
            if(age>=21){
                System.out.println("eligible to buy");
            }else{
                System.err.println("NOT eligible to buy");
            }
        }else{
            System.err.println("Enter a valid age!");
        }

    }
}
