package tasks_Day40Recap.deviceTask;

public class MyDevice {
    public static void main(String[] args) {

    Iphone iphone1=new Iphone("XR",750);

        System.out.println(iphone1.getBrand());

        System.out.println(iphone1.isHasBattery());

        System.out.println(Iphone.isHasPowerButton());

        System.out.println(iphone1);


    }
}
