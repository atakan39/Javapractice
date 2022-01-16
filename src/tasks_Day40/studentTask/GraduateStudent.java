package tasks_Day40.studentTask;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+"studying"+getFieldOfStudy());;
    }

}
