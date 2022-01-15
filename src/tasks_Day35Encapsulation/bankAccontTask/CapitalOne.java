package tasks_Day35Encapsulation.bankAccontTask;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1=new BankAccount("atakan taskin",7575647,0);

        System.out.println(account1);

        account1.checkBalance();


        account1.withdraw(100);

        account1.deposit(1000);

        account1.withdraw(1001);

        account1.deposit(500);











    }
}
