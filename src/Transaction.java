public abstract class Transaction {
     public Account account;

     public Transaction(Account acc){
         this.account =acc;
     }

     public abstract void execute();
}
