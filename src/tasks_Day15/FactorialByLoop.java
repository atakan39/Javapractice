package tasks_Day15;

public class FactorialByLoop {
    public static void main(String[] args) {
        int input=5;
        int factoarial=1;

        for (int i=input; i>=1; i--){
            factoarial=factoarial*i;
        }

        System.out.println(factoarial+"");
    }
}
/*
23. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
