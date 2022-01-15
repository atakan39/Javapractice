package tasks_Day23CustomMethods;

public class CalculatorMethod {

    public static void main(String[] args) {


        calculator(5,4,'-');

    }

    public static void calculator(int n1,int n2,char operator){

        if(operator=='/'|| operator=='*'|| operator=='+'|| operator=='-'){
            String result =" ";
            switch (operator){
                case '*':
                    result=""+(n1*n2);
                    break;
                case '/':
                    result=""+(n1/n2);
                    break;
                case '+':
                    result=""+(n1+n2);
                    break;
                case '-':
                    result=""+(n1-n2);
                    break;


            }

            System.out.println("result = "+result);

        }else{
            System.err.println("Invalid operator");
        }
    }
}
