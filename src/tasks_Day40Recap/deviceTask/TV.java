package tasks_Day40Recap.deviceTask;

public class TV extends Device{

    private double monitorSize;
    private boolean isSmartTv;

    private static boolean hasRemote=true;

    public TV(String brand, String model, double price, boolean hasBattery, double monitorSize, boolean isSmartTv) {
        super(brand, model, price, hasBattery);
        setMonitorSize(monitorSize);
        setSmartTv(isSmartTv);
    }

    public double getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        if(monitorSize<=0){
            System.err.println("invalid price");
            System.exit(1);
        }

        this.monitorSize = monitorSize;
    }

    public boolean isSmartTv() {
        return isSmartTv;
    }

    public void setSmartTv(boolean smartTv) {
        isSmartTv = smartTv;
    }

    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" ");
    }

    public static boolean isHasRemote() {
        return hasRemote;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton" + isHasPowerButton() +
                " monitorSize=" + monitorSize +
                ", isSmartTv=" + isSmartTv +
                ", has remote=" + hasRemote +
                '}';
    }
}
