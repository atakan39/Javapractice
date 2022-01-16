package tasks_Day38MethodOverriding.AnimalTask;

public class Animal {
    private String name,breed,color,size;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name==null){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()||breed.isBlank()||breed==null){
            System.err.println("invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.isBlank()||color==null){
            System.err.println("invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(name.isEmpty()||name.isBlank()||name==null){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='F' && gender!='M'){
            System.err.println("invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String color, String size, char gender, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setGender(gender);
        setAge(age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println(name+"is eating");
    }
}
/*
@@@ Animal Task:
        1. Create a class named Animal:
                        Variables:
                                name, breed, age, gender, size, color

                        Add a constructor to set all the fields

                        methods:
                                eat()
                                toString()

        2. Create the followin sub classes of Animal and override the eat method:
                        1. Cat
                                        eat(): eats cat food

                        2. Dog
                                        eat(): eats dog food

                        3. Tiger
                                        eat(): eats deer

                        4. Eagle
                                        eat(): eats snake

 */