package tasks_Day12Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner inPut= new Scanner(System.in);

        System.out.println("AREA CALCULATOR \nPlease enter the radius of the circle");

        double radius=inPut.nextDouble();

        double area= radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

                String result = "Radius given : "+radius+ "cm \nArea : "+area+"\nPerimeter :"+perimeter;
        System.out.println(result);

        inPut.close();
    }
    }

