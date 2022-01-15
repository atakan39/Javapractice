package tasks_Day08_09;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 50;
        String warning;

        if(level<=50){
            warning="Be careful now you at at 50%";
        }else if (level<=60){
            warning="Start to head back";
        }else if (level<=70){
            warning="Don't go too far.";
        }else if (level<=80){
            warning="Still okay";
        }else{
            warning="Your tank is full";
        }
        System.out.println(warning);
    }
}
/*
Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don\''t go too far.
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
