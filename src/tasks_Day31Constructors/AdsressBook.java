package tasks_Day31Constructors;

import java.util.Collections;

public class AdsressBook {
    public static void main(String[] args) {

        Address address1=new Address("52","Berkshire st","Providence","RI","02908");
        Address address2=new Address("408","Pilot hill st","Block Island","RI","02807");

        System.out.println("address1 = " + address1);

        System.out.println("address2 = " + address2);
    }
}
/*
2. Address Task:
    2.1 Create a class named Address
            Attributes:
                 buildingNumber, street, city, state, zipCode;

            Add a constructor to set all the fields

            Actions
                    toString: returns the address
                                EX:
                                    7925 Jones Branch Dr
                                    McLean Va, 22012

 */