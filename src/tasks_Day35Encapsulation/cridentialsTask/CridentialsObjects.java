package tasks_Day35Encapsulation.cridentialsTask;

public class CridentialsObjects {
    public static void main(String[] args) {

        Cridentials user1= new Cridentials("Atakan39","Ata kannn39@");
        System.out.println(user1);

        System.out.println(user1.isStrongPassWord());
    }
}
