
public class Account {

    String name;
    int bankId;
    String location;
    double balance = 0;

    Account(String name, int bankId, String location){
        this.name = name;
        this.bankId = bankId;
        this.location = location;

    }

    public void deposit(double amount){

        if(amount <= 0){
            System.out.println("Amount cannot be 0 or less than 0");
        }
        else{
            balance += amount;
            System.out.println("Rs." + amount + " deposited in your account");
            System.out.println("Your current balance is Rs." + balance);
        }
    }

    public void withdraw(double amount){

        if(balance < amount){
            System.out.println("Insufficient balance! ");
        }
        else{
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn from your account");
            System.out.println("Your current balance is Rs." + balance);
        }
    }

    public void showAccountInfo(){
        System.out.println("Account Details: ");
        System.out.println("\nName : " + name);
        System.out.println("\nBand ID : " + bankId);
        System.out.println("\nLocation : " + location);
        System.out.println("Your current balance is Rs." + balance + "\n");
    }

}