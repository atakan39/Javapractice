package tasks_Day33_34Static_Block;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String proggrammingLanguage;

    static {
       schoolName="Cydeo";
       proggrammingLanguage="Java";
    }

    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studing");
    }

    public void attendClass(){
        System.out.println(name+" is studing");
    }

    public void printSchoolName(){
        System.out.println("School name is "+schoolName);
    }
    public void proggrammingLanguage(){
        System.out.println("Proggramming Language : "+proggrammingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", School name=" + schoolName +
                ", Proggraming Language=" + proggrammingLanguage +
                '}';
    }

    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("atakan",30,'M',39,25,13);

        System.out.println(student1);
        System.out.println(CydeoStudent.schoolName);
        System.out.println(student1.schoolName);
        student1.printSchoolName();
        student1.proggrammingLanguage();



    }
}
