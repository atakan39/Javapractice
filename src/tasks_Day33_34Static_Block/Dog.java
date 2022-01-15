package tasks_Day33_34Static_Block;

public class Dog {

    public static String breed,color;
    public char size,gender;
    public int age;

    public static int numberOfLegs, numberOfEyes,numberOfWings;
    public static boolean isFriendly;

    public Dog(char size, char gender, int age) {
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
        isFriendly=true;
    }

    public void eat(){
        System.out.println(breed+" is eating");
    }

    public void sleep(){
        System.out.println(breed+" is sleeping");
    }

    public void play(){
        System.out.println(breed+" is playing");
    }


    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
