package tasks_Day35Encapsulation.bankAccontTask;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        if(accountHolder.isEmpty() || accountHolder.isBlank()){
            System.out.println("enter an account holder");
            System.exit(0);

        }

        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        if(accountNumber<=0){
            System.err.println("Account number needed");
            System.exit(0);
        }
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if(balance<0){
            System.err.println("balance can not be negative");
            System.exit(0);
        }
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.err.println("insufficiant balance for withdraw $"+amount+" your balance is $"+balance);
            return;
        }

        if(amount<=0){
            System.err.println("amount to withdraw must bigger than \"0\" $");
            return;
        }

        balance-=amount;
        System.out.println("your new balance is $"+balance);

    }

    public void deposit(double amount){
        if(amount<=0){
            System.err.println("amount to deposit must bigger than \"0\" $");
            return;
        }else {
            balance += amount;
            System.out.println("your new balance is $" + balance);
        }
    }

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void checkBalance(){
        System.out.println("dear "+accountHolder+", Your available balance is $"+balance+" on the account of "+accountNumber);
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
 */
