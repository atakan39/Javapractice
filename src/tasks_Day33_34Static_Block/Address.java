package tasks_Day33_34Static_Block;

public class Address {

    public String street,city,state,zipCode;

    public static String country,planet;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    static{
        country="USA";
        planet="EARTH";
    }

    public void setStreet(String street){
        this.street=street;
    }

    public void setCity(String city){
        this.city=city;
    }

    public void setState(String state){
        this.state=state;
    }

    public void setZipCode(String zipCode){
        this.zipCode=zipCode;
    }

    @Override
    public String toString() {
        return street+ "\n" + city +
                " " + state + ", " + zipCode;
    }


    public static void main(String[] args) {

        Address add1=new Address("52 berkshire st.","Providence","RI","02908");
        Address add2=new Address("418 Pilot hill rd.","Block Island","RI","02807");

        System.out.println(add1);
        System.out.println(Address.country+", "+Address.planet);

        System.out.println();

        System.out.println(add2);
        System.out.println(Address.country+", "+Address.planet);




    }
}
