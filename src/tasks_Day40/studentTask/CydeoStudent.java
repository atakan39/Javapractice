package tasks_Day40.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber,groupNumber;
    private static String programmingLanguage="Java";

    public int getBatchNumber() {
        return batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setBatchNumber(int batchNumber) {

        if(batchNumber<=0){
            System.err.println("invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage==null){
            System.err.println("programming language can not set to null");
            System.exit(1);
        }
        if(programmingLanguage.isEmpty()){
            System.err.println("programming language can not be empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println(getName()+"ate and study"+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+"sleep and study"+programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"sleep and study"+programmingLanguage);
    }
}
