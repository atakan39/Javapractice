package tasks_Day40Recap.animalTask;

public class Zoo {
    public static void main(String[] args) {

     Cat cat=new Cat("tekir","street cat","orange","small",'F',2,false,true,true);

     Parrot parrot =new Parrot("rainbow","amazonian","mix","small",'M',1,false,true,false);

     Dog dog=new Dog("ocean","pitbull","white","medium",'F',5,false,true,true);

     Lion lion=new Lion("simba","african","yellow","large",'M',3,true,true,true);

     Eagle eagle=new Eagle("white head","american","black","medium", 'F',3,true,false,false);


        System.out.println(eagle);

        eagle.hunt();

        lion.hunt();

        System.out.println(lion);

        System.out.println(lion.getName());
        System.out.println(eagle.getName());
        System.out.println(dog.getName());

        lion.setColor("brown");

        System.out.println(lion.getColor());

        System.out.println(lion);







    }
}
