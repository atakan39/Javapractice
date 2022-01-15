package tasks_Day35Encapsulation.candyTask;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {

        return price;

    /*    public String getPrice() {
            String s = Double.toString(price);
            s=(price==0)?"free":s;
            return s;
        } */
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("enter a brand");
            System.exit(0);
        }
        this.brand = brand;
    }

    public void setQuantity(int quantity) {

        if(quantity<=0){
            System.err.println("quantity can not be 0 or negative");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("price can not be negative");
            System.exit(0);
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString() {
        if(price==0){

            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price= free" +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }else {

        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
    }
    }

/*
1. CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0
 */