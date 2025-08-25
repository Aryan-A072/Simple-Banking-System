import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Bank bank=new Bank();
        
        int securityPin = 123;
        System.out.println("Enter Security Pin : ");
        int pass = in.nextInt();
        if(pass == securityPin){
        while(true){
            System.out.println("\nWelcome to Simple Banking System : ");
            System.out.println("1 Create Account :");
            System.out.println("2 Deposit : ");
            System.out.println("3 Withdraw : ");
            System.out.println("4 Check Balance : ");
            System.out.println("5 Exit : ");
            System.out.println("Enter your choice : ");
            int choice = in.nextInt();

            switch(choice){
                case 1 : 
                    System.out.println("Enter Account Number : ");
                    String accountNo = in.next();
                    System.out.println("Enter Account Holder Name :");
                    String accountHolderName = in.next();
                    bank.createAccount(accountNo, accountHolderName);
                    break;
                case 2 :
                    System.out.println("Enter Account Number : ");
                    accountNo = in.next();
                    Accounts accounts = bank.getAccount(accountNo);
                    if(accounts != null){
                        System.out.println("Enter amount to deposit : ");
                        double depositAmount = in.nextDouble();
                        accounts.deposit(depositAmount);
                    }
                    else{
                        System.out.println("Account not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the account Number : ");
                    accountNo = in.next();
                    accounts = bank.getAccount(accountNo);
                    if(accounts != null){
                        System.out.println("Enter the amount to withdraw : ");
                        double withdrawAmount = in.nextDouble();
                        accounts.withdraw(withdrawAmount);
                    }
                    else{
                        System.out.println("Account not found");
                    }
                    break;
                case 4 : 
                    System.out.println("Enter the Account Number : ");
                    accountNo = in.next();
                    accounts = bank.getAccount(accountNo);
                    if(accounts != null){
                        accounts.displayAccountInfo();
                    }
                    else{
                        System.out.println("Account not found");
                    }
                    break;
                case 5 : 
                    System.out.println("ThankYou for using the Simple Banking System");
                    in.close();
                    return;
                default :
                    System.out.println("Invalid Choice, Please try Again : ");
            }
        }
    }
        else{
            System.out.println("Incorrect password please try again.");
            in.close();
        }
    }
}