package tasks_Day40.studentTask;

import java.util.Collections;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        int specialChars=0;
        char [] chars=name.toCharArray();
        for (char aChar : chars) {
            if(!(Character.isLetterOrDigit(aChar)) && aChar!=' '){
                specialChars++;
            }
        }

        if(name.isEmpty() || specialChars>0 || name==null){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        boolean isValid=gender=='F' || gender=='M';
        if(!isValid){
            System.err.println("invalid gender");
            System.exit(1);
        }

        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
