package tasks_Day23CustomMethods;

public class KgToLbs {
    public static void main(String[] args) {
        calculateKgToLbs(0.8);
    }

    public static void calculateKgToLbs(double kg){
        if(kg>0){
            System.out.println(kg+" kg = "+kg*2.2+" lbs");
        }else{
            System.err.println("Invalid Entry!");
        }
    }
}
/*
@@@	11. create a method that can convert kg to lb
 */