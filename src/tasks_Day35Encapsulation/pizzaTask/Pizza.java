package tasks_Day35Encapsulation.pizzaTask;

public class Pizza {

    private String size;
    private int numberOfCheeseToppings, NumberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int getNumberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(getNumberOfPepperoniToppings);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return NumberOfPepperoniToppings;
    }

    public void setSize(String size) {

        if(!(size.equals("small") || size.equals("medium") || size.equals("large"))){
            System.err.println(" size must be small,medium or large only");
            System.exit(0);
        }

        this.size = size;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if(size.equals("small") && !(numberOfCheeseToppings>=0 && numberOfCheeseToppings<=3)){
            System.err.println("chees toppings ranges for small pizza 0-3");
            System.exit(0);
        }
        if(size.equals("medium") && !(numberOfCheeseToppings>=0 && numberOfCheeseToppings<=4)){
            System.err.println("chees toppings ranges for med pizza 0-4");
            System.exit(0);
        }
        if(size.equals("large") && !(numberOfCheeseToppings>=0 && numberOfCheeseToppings<=5)){
            System.err.println("chees toppings ranges for small pizza 0-5");
            System.exit(0);
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public void setNumberOfPepperoniToppings(int getNumberOfPepperoniToppings) {
        if(size.equals("small") && !(numberOfCheeseToppings>=0 && numberOfCheeseToppings<=4)){
            System.err.println(" pep toppings ranges for small pizza 0-4");
            System.exit(0);
        }
        if(size.equals("medium") && !(numberOfCheeseToppings>=0 && numberOfCheeseToppings<=5)){
            System.err.println("pep toppings ranges for med pizza 0-5");
            System.exit(0);
        }
        if(size.equals("large") && !(numberOfCheeseToppings>=0 && numberOfCheeseToppings<=6)){
            System.err.println("pep toppings ranges for small pizza 0-6");
            System.exit(0);
        }


        this.NumberOfPepperoniToppings = getNumberOfPepperoniToppings;
    }

    public double calcCost(){
        double startingPrice=(size.equals("small"))?10:(size.equals("medium"))?12:14;

        double totalPrice= startingPrice+(NumberOfPepperoniToppings+numberOfCheeseToppings)*2;

        return totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", getNumberOfPepperoniToppings=" + NumberOfPepperoniToppings +
                ", total price= $" + calcCost() +
                '}';
    }
}
/*
 5. Pizza Task:
        5.1 Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */