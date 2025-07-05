import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void depositAmount(Account account, double amount){
        account.deposit(amount);
    }

    public void withdrawAmount(Account account, double amount){
        account.withdraw(amount);
    }

   public ArrayList<Account> showAccount(){
        return accounts;
   }

}