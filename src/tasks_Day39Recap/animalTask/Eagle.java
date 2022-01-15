package tasks_Day39Recap.animalTask;

public class Eagle extends WildAnimal{

    public Eagle(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a rabbit");
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }
}
