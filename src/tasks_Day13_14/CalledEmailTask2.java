package tasks_Day13_14;

public class CalledEmailTask2 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".")); // if email doesnt end with com !!


         // with using subs
        String firstName1=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastName2 = lastName.substring(0,1).toUpperCase() +   lastName.substring(1).toLowerCase();

        String output2="First name: "+firstName1+"\nLast name: "+lastName2+"\nDomain: "+domain;

        // with usinf replace first

        firstName=firstName.replace(firstName.charAt(0), firstName.toUpperCase().charAt(0));
        lastName=lastName.replace(lastName.charAt(0), lastName.toUpperCase().charAt(0));

        String output="First name: "+firstName+"\nLast name: "+lastName+"\nDomain: "+domain;





        System.out.println("with using substring to make first char uppercase:\n\n"+output+"\n--------");
        System.out.println("with using replaceFirst to make first char uppercase:\n\n"+output2);


    }
}
/*
14. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */
