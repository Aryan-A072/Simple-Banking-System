import java.util.HashMap;
import java.util.Map;

public class Bank{
    private Map<String, Accounts> accounts;
    
    //constructor
    public Bank(){
        accounts = new HashMap<>();
    }
    //create new account
    public void createAccount(String accountNo, String accountHolderName){
        if(!accounts.containsKey(accountNo)){
            Accounts newAccount = new Accounts(accountNo, accountHolderName);
            accounts.put(accountNo, newAccount);
            System.out.println("Account created successfully.");
        }
        else{
            System.out.println("Account number already exist.");
        }
    }
    //get an account by account number
    public Accounts getAccount(String accountNo){
        return accounts.get(accountNo);
    }
}