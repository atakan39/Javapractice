package tasks_Day37Inheritance.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void teaching(){
        System.out.println(jobTitle+" "+name+" is teaching");
    }
}
