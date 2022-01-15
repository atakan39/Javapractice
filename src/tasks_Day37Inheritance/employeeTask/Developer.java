package tasks_Day37Inheritance.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }


    public void fixingbugs(){
        System.out.println(jobTitle+ " " +name+" is fixing bugs");
    }

    public void coding(){
        System.out.println(jobTitle+ " " + name+ " is coding");
    }
}
