package tasks_Day37Inheritance.employeeTask;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public int age, id;
    public double salary;

    public Employee(String name, String jobTitle, char gender, int age, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        setAge(age);
        this.id = id;
        this.salary = salary;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("");
            return;
        }
        this.age = age;
    }

    public void work() {
        System.out.println(jobTitle + name + " is working");
    }


    public String toString() {
        if (age == 0) {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", gender=" + gender +
                    ", age= invalid "+
                    ", id=" + id +
                    ", salary=" + salary +
                    '}';
        }
        else {

            return "Employee{" +
                    "name='" + name + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", id=" + id +
                    ", salary=" + salary +
                    '}';
        }
    }
}
