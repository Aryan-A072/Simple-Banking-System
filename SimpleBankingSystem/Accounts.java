public class Accounts{
    private String accountNo;
    private String accountHolderName;
    private double balance;
    public Accounts(String accountNo,String accountHolderName){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    public String getAccNo(){
        return accountNo;
    }
    public String getAccHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    //deposit amount
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Successfully deposited : $"+amount);
            // System.out.println("Total balance : $"+balance);
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
    //withdraw method
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully withdrew: $"+amount);
            // System.out.println("Total balance : $"+balance);
        }
    }
    //display account info
    public void displayAccountInfo(){
        System.out.println("Account No : "+accountNo);
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Balance : $"+balance);
    }
}