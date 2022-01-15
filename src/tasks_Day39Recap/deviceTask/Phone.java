package tasks_Day39Recap.deviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, double price) {
        super(brand, model, price, true);
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+""+getModel()+" is calling ("+phoneNum+")");
    }

    public void text(long phoneNum){
        System.out.println(getBrand()+""+getModel()+" is calling to ("+phoneNum+")");
    }


}
