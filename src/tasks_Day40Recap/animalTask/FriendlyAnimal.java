package tasks_Day40Recap.animalTask;

public class FriendlyAnimal extends Animal{

    

    public FriendlyAnimal(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }

    public void pet(){
        System.out.println(getName()+" is a pet");
    }


    }

/*
 2. Create a sub class of Animal named FriendlyAnimal:
                                Variable:
                                        isWild
                                        isFriendly
                                        isPlayable

                                Extra methods:
                                        play()
                                        pet()
 */