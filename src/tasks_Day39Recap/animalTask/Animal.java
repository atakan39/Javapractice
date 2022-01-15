package tasks_Day39Recap.animalTask;

public class Animal {

    private String name,breed,color,size;
    private char gender;
    private int age;
    private boolean isWild,isFriendly,isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

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

    public Animal(String name, String breed, String color, String size, char gender, int age,boolean isWild,boolean isFriendly,boolean isPlayable) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setGender(gender);
        setAge(age);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void move(){
        System.out.println(name+" is moving");
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
                ", is wild='" + isWild + '\'' +
                ", is friendly=" + isFriendly +
                ", is playable =" + isPlayable +
                '}';
    }

}
/*
1. Create a class named Animal:
                        variables:
                   ///             name, breed, gender, age, size, color

                   ///       Encapsulate all the fields

                 ////       Add a constructor to set all the fields

                   ///                     Conditions:
                                                1. name, breed and color can not be null (if obj == null means it's error)
                                                2. name, breed and color can not be empty or can not be blank
                                                3. gender should only be set to either 'M' or 'F'
                                                4. age can not be set to negative

                        Methods:
                                eat()
                                drink()
                                sleep()
                                move()
                                toString()
 */