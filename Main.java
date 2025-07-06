public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account acc1 = new Account("Bijay Bholon", 1055531, "Kapan");
        Account acc2 = new Account("Aarush Lho", 1055532, "Kapan");
        Account acc3 = new Account("Abinash Rumba", 1055533, "Sano Bharyang");

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        bank.depositAmount(acc1, 10000);
        
        bank.depositAmount(acc2, 15000);
        bank.withdrawAmount(acc2, 5000);

        bank.depositAmount(acc3, 0);

        bank.showAccount();

    }
}
