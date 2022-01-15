package tasks_Day37Inheritance.restaurantTask;

public class Server extends Employee{
    public Server(String name, String jobTitle, int employeeID, double hourlyRate, boolean fullTime) {
        super(name, jobTitle, employeeID, hourlyRate, fullTime);
    }

    public void takeOrder(){
        System.out.println(jobTitle+" "+name+" is taking order");
    }

    public void cleanTable(){
        System.out.println(jobTitle+" "+name+" is cleaning table");
    }
}
