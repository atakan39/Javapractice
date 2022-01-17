package tasks_Day40.studentTask;

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

        if(name.isEmpty()){
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        String specialChars = ""; // to get all special chars other than space

        for (char each : name.toCharArray()) {
            if(!Character.isLetterOrDigit(each) && each != ' '){  // getting all special character except for space
                specialChars += each;
            }
        }

        if(specialChars.length() > 0){ // if contains special characters other than space
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        if(!Character.isLetter(name.charAt(0))){ // if name does not start with letter
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        this.name = name;
   /*     int specialChars=0;
        char [] chars=name.toCharArray();
        for (char aChar : chars) {
            if(!(Character.isLetterOrDigit(aChar)) && aChar!=' '){
                specialChars++;
            }
        }

        if(name.isEmpty() || specialChars>0){
            System.err.println("invalid name"+name);
            System.exit(1);
        }

        this.name = name; */
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

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
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
