package tasks_Day23CustomMethods;

public class NumberPosNegZero {

    public static void main(String[] args) {

        posNegOrZero(-100);
    }

    public static void posNegOrZero(int number){
        if(number>0){
            System.out.print("number is Positive ");
            if(number%2==0){
                System.out.println("and even");
            }else{
                System.out.println("and odd");
            }

        }else if(number<0){
            System.out.print("number is Negative ");
            if(number%2==0){
                System.out.println("and even");
            }else{
                System.out.println("and odd");
            }
        }else{
            System.out.println("number is Zero");
        }
    }
}
/*
12. create a method that can if the given integer is positive, negative or zero
 */