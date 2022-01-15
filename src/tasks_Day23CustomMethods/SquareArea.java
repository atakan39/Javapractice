package tasks_Day23CustomMethods;

public class SquareArea {
    public static void main(String[] args) {

        calculateSquareArea(5);
    }

    public static void calculateSquareArea(double side){

        if(side>0){
            double area = side*side;
            System.out.println("Area of square: "+area);
        }else{
            System.err.println("Enter valid radius!");
        }
    }
}
/*
7. create a method that can calculate the area of a square
 */
