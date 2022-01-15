package tasks_Day33_34Static_Block;

public class Car {

      public String make,model,color;
      public int year;
      public double price;

      public static int numberOfWheels;

      public static boolean hasSeats,hasBattery;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    static {
        numberOfWheels=4;
        hasSeats=true;
        hasBattery=true;
    }

    public void drive(){
        System.out.println(make+" "+model+" is running");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
