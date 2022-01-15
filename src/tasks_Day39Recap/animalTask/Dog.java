package tasks_Day39Recap.animalTask;

public class Dog extends FriendlyAnimal{



    public Dog(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void Dog() {
        System.out.println(getName()+"is barking");
    }
}
