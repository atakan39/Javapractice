package tasks_Day40Recap.animalTask;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void hunt() {
        System.out.println(getName()+" is hunting a deer");
    }

}
