package tasks_Day23CustomMethods;

public class CurrencyCalculator {
    public static void main(String[] args) {

        System.out.println("\t\t-Currency Calculator-");
        convertDollarToEuro(5);
        convertDollarToLiras(9000);
    }

    public static void convertDollarToEuro(double dollars){

        if(dollars>0){
            System.out.println("$"+dollars+" dollars = "+0.89*dollars+" euros");
        }else{
            System.err.println("invalid entry");
        }
    }
    public static void convertDollarToLiras(double dollars){

        if(dollars>0){
            System.out.println("$"+dollars+" dollars = "+13.8*dollars+" Liras");
        }else{
            System.err.println("invalid entry");
        }
    }

}
/*
     9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira
 */
