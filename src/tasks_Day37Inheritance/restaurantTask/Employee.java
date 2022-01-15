package tasks_Day37Inheritance.restaurantTask;

public class Employee {

    public String name,jobTitle;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Employee(String name,String jobTitle, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.jobTitle=jobTitle;
    }

    @Override
    public String toString() {

        if(!fullTime){
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", title=" + jobTitle +
                    ", hourlyRate=$" + hourlyRate +
                    ", hours= part-time"+
                    '}';
        }else {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", title=" + jobTitle +
                    ", hourlyRate=$" + hourlyRate +
                    ", hours= full-time" +
                    '}';
        }
    }
}
