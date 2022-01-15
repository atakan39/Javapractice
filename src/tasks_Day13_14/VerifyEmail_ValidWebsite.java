package tasks_Day13_14;

import java.util.Scanner;

public class VerifyEmail_ValidWebsite {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter your email:");
        String userInput=inPut.next();

        if(userInput.endsWith("@gmail.com")){
            System.out.println("valid");
        }else{
            System.out.println("Please check your email you entered");
        }

        System.out.println("Enter an website please:");
        String website=inPut.next();

        boolean validWebsite=website.startsWith("www.") && website.endsWith(".gov")||website.endsWith(".com")|| website.endsWith(".edu");

        if(!validWebsite){
            System.out.println("This is not a valid website address.");

        }
        inPut.close();
    }
}
/*   15. write a program to verify if the gmail is valid
        requirements:
        a valid gmail account should end with @gmail.com

    16. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

 */