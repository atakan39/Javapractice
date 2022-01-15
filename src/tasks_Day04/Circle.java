package tasks_Day04;

public class Circle {
    public static void main(String[] args) {

        double radius = 8.5;
        double PI = 3.14;

        double Diameter = radius * 2;
        double Area = radius * radius * PI;
        double Perimeter =2 * radius * PI;

        System.out.println("Radius = "+radius);
        System.out.println("diameter = " + Diameter);
        System.out.println("Perimeter = "+Perimeter);
        System.out.println("Area = "+Area);

    }
}
