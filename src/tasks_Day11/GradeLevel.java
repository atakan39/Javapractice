package tasks_Day11;

public class GradeLevel {
    public static void main(String[] args) {
        byte level =5;
        String school="";
        boolean validLevel = 1<=level && level<=18;
        if (validLevel){
            switch (level){
                case 6: case 7: case 8:
                  school="Middle School";
                  break;
                case 9: case 10: case 11: case 12:
                    school="High School";
                    break;
                case 13: case 14: case 15: case 16:
                    school="College";
                    break;
                case 17: case 18:
                    school="Grad School";
                    break;
                default:
                    school="Elementary School";
            }
        }else{
            school="Invalid grade level given";
        }
        System.out.println(school);
    }
}
