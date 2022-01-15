package tasks_Day40Recap.deviceTask;

public class Computer extends Device{

    private double GPU;
    private boolean hasHdmlPort;

    public Computer(String brand, String model, double price, boolean hasBattery, double GPU,boolean hasHdmlPort) {
        super(brand, model, price, hasBattery);
        setGPU(GPU);
        setHasHdmlPort(hasHdmlPort);

    }

    public double getGPU() {
        return GPU;
    }

    public void setGPU(double GPU) {
        if(GPU<=0){
            System.err.println("invalid GPU");
            System.exit(1);
        }
        this.GPU = GPU;
    }

    public boolean isHasHdmlPort() {
        return hasHdmlPort;
    }

    public void setHasHdmlPort(boolean hasHdmlPort) {
        this.hasHdmlPort = hasHdmlPort;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton" + isHasPowerButton() +
                "GPU=" + GPU +
                ", hasHdmlPort=" + hasHdmlPort +
                '}';
    }
}
