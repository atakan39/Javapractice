package tasks_Day37Inheritance.restaurantTask;

public class Chef extends Employee {

    public Chef(String name, String jobTitle, int employeeID, double hourlyRate, boolean fullTime) {
        super(name, jobTitle, employeeID, hourlyRate, fullTime);
    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }

    public void washDishes(){
        System.out.println(jobTitle+" "+name+" is washing dishes");
    }








}
