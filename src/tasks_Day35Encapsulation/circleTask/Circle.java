package tasks_Day35Encapsulation.circleTask;

public class Circle {

    private double radius;

    public static double pi=3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
       if(radius<=0){
           return;
       }

        this.radius = radius;
    }

    public double calcArea(){
        return getRadius()*getRadius()*pi;
    }

    public double calcPerimeter(){
        return getRadius()*2*pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area=" + calcArea() +
                "Perimeter=" + getRadius()*2*pi+
                '}';
    }
}
