package tasks_Day39Recap.animalTask;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void fly(){
        System.out.println(getAge()+" is flying");
    }

    public void sing(){
        System.out.println(getAge()+" is singing");
    }


}
