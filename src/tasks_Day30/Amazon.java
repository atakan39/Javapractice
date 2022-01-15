package tasks_Day30;

public class Amazon {
    public static void main(String[] args) {

        Employee emp1=new Employee();
        emp1.setInfo("Atakan","Manager",39,'M',true,80000);

        Employee emp2=new Employee();
        emp2.setInfo("Emre","P.A",40,'M',true,50000);
        Employee emp3=new Employee();
        emp3.setInfo("Ozgur","stuff",41,'M',false,20000);
        Employee emp4=new Employee();
        emp4.setInfo("Omer","P.A",42,'M',true,45000);
        Employee emp5=new Employee();
        emp5.setInfo("Sidar","stuff",43,'M',false,18000);

        Employee employees []={emp1,emp2,emp3,emp4,emp5};


        int countFullTime=0;
        int countPartTime=0;


        double maxSalary=employees[0].salary;
        double minSalary=employees[0].salary;

        for (Employee employee : employees) {
            if(employee.salary>maxSalary){
                maxSalary=employee.salary;

            }
            if(employee.salary<minSalary){
                minSalary=employee.salary;

            }

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
        }


        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);
        System.out.println(emp1);
        System.out.println("Total fulltime employees : "+countFullTime);
        System.out.println("Total parttime employees : "+countPartTime);

    }
}
