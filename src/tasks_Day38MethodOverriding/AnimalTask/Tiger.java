package tasks_Day38MethodOverriding.AnimalTask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is eating deer");
    }
}
