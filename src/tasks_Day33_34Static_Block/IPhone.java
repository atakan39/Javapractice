package tasks_Day33_34Static_Block;

public class IPhone {

    public String model;
    public double price;
    public String color;
    public double size;

    public static String brand;
    public static String OS;
    public static String madeIn;

    public IPhone(String model, double price, String color, double size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    static{
        brand="Iphone";
        OS="IOS";
        madeIn="China";
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+" is facetiming with "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println((model+" is sending email to "+email));
    }


    public void call(long phoneNumber){
        System.out.println(model+" is calling to "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }


    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
