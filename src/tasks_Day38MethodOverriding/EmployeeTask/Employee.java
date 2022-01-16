package tasks_Day38MethodOverriding.EmployeeTask;

public class Employee {

    private String name, jobTitle,companyNAme;
    private char gender;
    private int age, id;
    private double salary;

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyNAme() {
        return companyNAme;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompanyNAme(String companyNAme) {
        this.companyNAme = companyNAme;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, String companyNAme, char gender, int age, int id, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setCompanyNAme(companyNAme);
        setGender(gender);
        setAge(age);
        setId(id);
        setSalary(salary);
    }

    public void work(){
        System.out.println(name+" "+jobTitle+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyNAme='" + companyNAme + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee Task:
        1. Create a class named Employee
                        Variables:
                                name, age, gender, id, jobTitle, salaryName, comapnyName

                        Add a constructor to set all the fields

                        Methods:
                                work()
                                toString()


        2. Create ethe following subclasses and override the work method in each subclass:

                        1. Tester
                        2. Developer
                        3. ProductOwner
                        4. BusinessAnalyst
                        5. ScrumMaster
                        6. Teacher
                        7. Driver
                        9. Pilot

                if any adidtional field or methods needed, please add them
 */