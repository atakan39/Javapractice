package tasks_day07;

public class IsEligible_alcohol {
    public static void main(String[] args) {

        int age = 15;
        String eligibilty;
        
        if (age >= 18) {
            eligibilty ="Eligible to buy alcohol";
        } else {
            eligibilty ="NOT Eligible to buy alcohol ";
        }
        System.out.println(eligibilty);
        
    }
}

