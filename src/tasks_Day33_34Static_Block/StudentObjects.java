package tasks_Day33_34Static_Block;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student("atakan",'M',30);
        Student student2=new Student("sidar",002,'B');
                Student student3=new Student("emre",003,'A');


        System.out.println(student1==student2);

        Student [] students={student1,student2,student3};

        System.out.println(Arrays.toString(students));
    }
}
