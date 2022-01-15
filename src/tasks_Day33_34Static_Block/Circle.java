package tasks_Day33_34Static_Block;

public class Circle {

    public double radius;
    public double diameter;

    public static double pi=3.14;

    public Circle(double radius) {
        this.diameter=radius*2;
        this.radius = radius;
    }

    public double calcArea(){
       double area=radius*radius*pi;
        return area;
    }

    public double calcPerimeter(){
        double perimeter=2*radius*pi;
        return perimeter;
    }

    public void printPi(){
        System.out.println(Circle.pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(5.5);

        System.out.println(circle1.diameter);

        System.out.println(circle1.pi);

        System.out.println(Circle.pi);

        circle1.printPi();

        System.out.println(circle1.calcArea());

        System.out.println(circle1.calcPerimeter());

        System.out.println(circle1);
    }
}
