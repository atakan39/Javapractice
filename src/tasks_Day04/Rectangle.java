package tasks_Day04;

public class Rectangle {

    public static void main(String[] args) {

        double witdh = 6;
        // rectangle witdh
        double length = 60;
        // rectangle length

        double Area = witdh * length;
        double Perimeter = 2 * (witdh + length);

        System.out.println("Rectangle length = "+length);
        System.out.println("Rectangle width = "+witdh);
        System.out.println("Rectangle Perimeter = "+Perimeter);
        System.out.println("Rectangle Area = "+Area);
    }
}
