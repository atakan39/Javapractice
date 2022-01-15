package tasks_Day40Recap.animalTask;

public class Dolphin extends FriendlyAnimal{


    public Dolphin(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void swim() {
        System.out.println(getName()+" is  swimming");
    }

}
