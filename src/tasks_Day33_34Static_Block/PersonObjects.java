package tasks_Day33_34Static_Block;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1=new Person("atakan",30,'M');


        person1.drink("coke");

        System.out.println(person1.name);

        System.out.println(person1.isHuman);

        System.out.println(Person.hasWings);


    }
}
