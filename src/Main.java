//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Bank bank=new Bank();


        Card card_mueni = new Card("1234M", "0000");
        Account account = new Account("ACC001", 10000);
        User Mueni = new User("Mueni", card_mueni, account);

        bank.AddUser(Mueni);


        Card card_brendah = new Card("1234B", "2567");
        Account account_brendah = new Account("ACC001", 10000);
        User brendah = new User("Mueni", card_brendah, account);

        bank.AddUser(brendah);


        ATM atm=new ATM(bank);

         atm.start();
    }
}