package tasks_Day38MethodOverriding.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, String jobTitle, String companyNAme, char gender, int age, int id, double salary) {
        super(name, jobTitle, companyNAme, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is creating tickets");
    }


}
