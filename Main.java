public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account acc1 = new Account("Bijay Bholon", 1055531, "Kapan");
        Account acc2 = new Account("Aarush Lho", 1055532, "Kapan");
        Account acc3 = new Account("Abinash Rumba", 1055533, "Sano Bharyang");

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);


        for(Account account : bank.showAccount()){
            System.out.println(account);
        }

    }
}
