package tasks_Day10;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade=10;
        String schoolType;
        if(grade>=1 && grade <=18)
        {
            if (grade <= 5) {
                schoolType = "Elementary School";
            } else if (grade <= 8) {
                schoolType = "Middle School";
            } else if (grade <= 12) {
                schoolType = "High School";
            } else if (grade <= 16) {
                schoolType = "Collage";
            } else {
                schoolType = "Grad School";
            }
        }
        else
        {
                schoolType="Invalid grade level given";
        }
            System.out.println(schoolType);
        }
    }
    /*
    Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

