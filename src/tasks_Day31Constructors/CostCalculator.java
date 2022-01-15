package tasks_Day31Constructors;

public class CostCalculator {
    public static void main(String[] args) {

        Item itm1=new Item("wood",42,200);
        Item itm2=new Item("Sheet Rock",50,40);

        System.out.println(itm1.name+" : $"+itm1.calcCost());
        System.out.println(itm2.name+" : $"+itm2.calcCost());



    }
}
