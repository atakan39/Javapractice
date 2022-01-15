package tasks_Day13_14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter an account number:");
        String userAccount = inPut.next();
        // userAccount.startsWith("2")...
        boolean validAccount = userAccount.charAt(0) == '2' && userAccount.length() == 7 ||
                               userAccount.charAt(0) == '5' && userAccount.length() == 10;


        if (!validAccount) {
            System.out.println("Invalid account number");
        }else{
            System.out.println("valid");
        }

        inPut.close();

    }

}
/*
12. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */