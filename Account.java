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
            System.out.println("\nYou cannot deposit amount equal or less than Rs.0");
            System.out.println(this.name + "'s current balance is Rs." + balance);
        }
        else{
            balance += amount;
            System.out.println("\nRs." + amount + " deposited in "+ this.name + "'s account");
            System.out.println(this.name + "'s current balance is Rs." + balance);
        }
    }

    public void withdraw(double amount){

        if(balance < amount){
            System.out.println("\nInsufficient balance! ");
            System.out.println(this.name + "'s current balance is Rs." + balance);
        }
        else{
            balance -= amount;
            System.out.println("\nRs." + amount + " withdrawn from "+ this.name + "'s account");
            System.out.println(this.name + "'s current balance is Rs." + balance);
        }
    }

    public void showAccountInfo(){
        System.out.println("\nAccount Details: ");
        System.out.println("Name : " + name);
        System.out.println("Bank ID : " + bankId);
        System.out.println("Location : " + location);
        System.out.println(this.name + "'s current balance is Rs." + balance + "\n");
    }

}
