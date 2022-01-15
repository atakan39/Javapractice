package tasks_Day40Recap.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getName()+" is scratch");
    }

    public void meow(){
        System.out.println(getName()+" is saying meow");
    }


}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
                        1. Dog:
                                        Extra methods:
                                                bark()

                        2. Cat:
                                        Extra methods:
                                                scratch()
                                                meow()

                        3. Dolphin:
                                        Extra methods:
                                                swim()

                        4. Parrot:
                                        Extra methods:
                                                fly()
                                                sing()

 */