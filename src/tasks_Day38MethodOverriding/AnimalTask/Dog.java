package tasks_Day38MethodOverriding.AnimalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is eating dog food");
    }
}
