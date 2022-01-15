package tasks_Day40Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone(String model, double price) {
        super("Iphone", model, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+""+getModel()+" is face timing ("+phoneNumber+")");
    }
}
