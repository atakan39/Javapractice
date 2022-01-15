package tasks_Day37Inheritance.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Driver driver1=new Driver("atakan","special driver",'M',30,1,25000);

        Teacher teacher1=new Teacher("muhtar","java language",'M',-10,2,50000);

        Tester tester1 = new Tester("Mehmet","QA",'M',34,1,120000);

        Developer developer1 = new Developer("Emre","Developer", 'M',-5,1,175000);

        System.out.println(teacher1);

        System.out.println(tester1);

        System.out.println(developer1);







    }
}
