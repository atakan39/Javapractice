package tasks_Day39Recap.animalTask;

public class WildAnimal extends Animal{

    public WildAnimal(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }
}
