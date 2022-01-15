package tasks_Day23CustomMethods;

public class PrintFullNameMethod {
    public static void main(String[] args) {

      printNameRegFormat("ATAkan","TAskin");
    }

    public static void printNameRegFormat(String firstName, String lastName){
        firstName=(firstName.charAt(0)+"").toUpperCase() + firstName.substring(1).toLowerCase();
        lastName=(lastName.charAt(0)+"").toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);
    }
}
/*
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"

 */