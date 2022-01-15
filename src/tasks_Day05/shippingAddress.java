package tasks_Day05;

public class shippingAddress {
    public static void main(String[] args) {
        String name = "atakan taskin",
                buidingNumber = "123A",
                streetName = "Berkshire st.",
                city = "Providence",
                state = "RI",
                zipCode= "02908";

        String address = name + "\n" + buidingNumber + " " + streetName +"\n" + city +", "+ state +" " + zipCode;

        System.out.println(address);


    }

}
