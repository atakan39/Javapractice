package tasks_Day35Encapsulation;

public class Rectangle {

    private double witdh;
    private double length;

    public Rectangle(double witdh, double length) {
        setWitdh(witdh);
        setLength(length);
    }  // constrctor

    public double getWitdh() {
        return witdh;
    }  // getter 1

    public void setWitdh(double witdh) {
       if(witdh<=0){
           System.err.println("invalid");
           System.exit(0);
       }

        this.witdh = witdh;
    }

    public double getLength() {
        return length;
    }  // getter 2

    public void setLength(double length) {
        if(length<=0){
            System.err.println("invalid");
            System.exit(0);
        }

        this.length = length;
    }

    public double calcArea(){
        return witdh*length;
    }

    public double calcPerimeter(){
        return (witdh+length)*2;
    }


    public String toString() {
        return "Rectangle{" +
                "witdh=" + witdh +
                ", length=" + length +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }


}

/*
2. Rectangle Task:
        2.1 Create a class named Rectangle:
                Private variables:
                    width, length

                Encapsulate all the fields
                        Conditions:
                            width of the rectangle should not be negative
                            length of the rectangle should not be negative

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Methods:
                    calcArea(): returns the area of rectangle
                    calcPerimeter(): returns the perimeter of rectangle
                    toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */