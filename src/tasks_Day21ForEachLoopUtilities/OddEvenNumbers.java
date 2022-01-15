package tasks_Day21ForEachLoopUtilities;

public class OddEvenNumbers {
    public static void main(String[] args) {

        int numbers[]={3,6,91,45,60};

        for (int each:numbers) {
            if(each%2==0){
                System.out.println(each+"= even");
            }else{
                System.out.println(each+"= odd");
            }

        }
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */
