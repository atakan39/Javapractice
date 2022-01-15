package tasks_Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (Integer score : scores) {
            if (score >= 0 && score <= 100) {
                if (score >= 90) {
                    gradeOfA.add(score);
                    countA++;
                } else if (score >= 80) {
                    gradeOfB.add(score);
                    countB++;
                } else if (score >= 70) {
                    gradeOfC.add(score);
                    countC++;
                } else if (score >= 60) {
                    gradeOfD.add(score);
                    countD++;
                } else {
                    gradeOfF.add(score);
                    countF++;
                }
            } else {
                System.out.println("invalid score");
            }
        }
        System.out.println("total number of grade A :  "+countA+
                           "\ntotal number of grade B :  "+countB+
                           "\ntotal number of grade C :  "+countC+
                           "\ntotal number of grade D :  "+countD+
                           "\ntotal number of grade F :  "+countF);
    }
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F

        */