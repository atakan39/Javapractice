package tasks_Day30;

public class Employee {

    public String name;
    public String jobTitle;
    public int iD;
    public char gender;
    public boolean isFullTime;
    public double salary;

    public void setInfo(String name, String jobTitle, int iD, char gender, boolean isFullTime, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.iD = iD;
        this.gender = gender;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", iD=" + iD +
                ", gender=" + gender +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }

    public void eat(){
        System.out.println(jobTitle+" "+name+" is working");
    }

}
/*
Attributes:
            name, id, gender, jobTitle, salary, isFullTime(boolean)

        Actions:
            toString(): to be bale to print each employee object
            setInfo(): to be able to set all the attributes
            work()...

CapitalOne Class:

    1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary'
    5. what's the maximum salary'





 */