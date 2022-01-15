package tasks_Day23CustomMethods;

public class AreaOfCircle {
    public static void main(String[] args) {

        calculateCircleArea(5);
    }

    public static void calculateCircleArea(double radius){
        if(radius>0){
            double area = radius * radius * 3.14;
            System.out.println("Area of circle: "+area);
        }else{
            System.err.println("Enter valid radius!");
        }

    }
}
/*
6. create a method that can calculate the area of a circle

 */
