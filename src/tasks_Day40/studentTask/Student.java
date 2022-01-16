package tasks_Day40.studentTask;

public class Student extends Person{

    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public int getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isEmpty() || fieldOfStudy==null){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setGrade(char grade) {
        if(grade!='A' && grade!='B' && grade!='C' && grade!='D' && grade!='F'){
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName.isEmpty() || schoolName==null){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
