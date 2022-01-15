package tasks_Day39Recap.deviceTask;

public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery;

    private static boolean hasPowerButton;

    static {
        hasPowerButton = true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()||brand.isBlank()||brand==null){
            System.err.println("invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if(model.isEmpty()||model.isBlank()||model==null){
            System.err.println("invalid model");
            System.exit(1);
        }
        this.model = model;
    }

    public void setPrice(double price) {
       if(price<=0){
           System.err.println("invalid price");
           System.exit(1);
       }
        this.price = price;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public Device(String brand, String model, double price, boolean hasBattery) {
       setBrand(brand);
       setModel(model);
       setPrice(price);
       setHasBattery(hasBattery);
    }

    public void turnOn(){
        System.out.println(brand+" "+model+" turned on");
    }

    public void turnOff(){
        System.out.println(brand+" "+model+" turned off");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}


/*
 1. Create a class named Device:
                        Variables:
                                        brand, model, price, hasBattery, hasPowerButton

                        Encapsulate all the fields

                        Add a constructor to set all the fields

                                                Condition:
                                                        1. brand, model can not be null (if obj == null means it's error)
                                                        2. brand, model can not be empty or can not be blank
                                                        3. price can not be set to negative or zero

                        Methods:
                                turnOn(), turnOff(), toString()
 */