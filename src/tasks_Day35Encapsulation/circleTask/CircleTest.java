package tasks_Day35Encapsulation.circleTask;

import tasks_Day35Encapsulation.circleTask.Circle;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1=new Circle(5);

        Circle circle2=new Circle(8);

        System.out.println(Circle.pi);
        System.out.println();
        System.out.println(circle1.getRadius());
        System.out.println();
        System.out.println(circle2.getRadius());
        System.out.println();
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println();
        circle1.setRadius(10);
        circle2.setRadius(20);
        System.out.println();
        System.out.println(circle1);
        System.out.println(circle2);

        Circle circle3=new Circle(-5);

        System.out.println(circle3);

    }
}
