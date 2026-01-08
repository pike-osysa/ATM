public class DepositTransaction extends Transaction{
    private double DepositAmount;

    public DepositTransaction(Account account,double amount){
         super(account);
         this.DepositAmount=amount;
    }

    @Override
    public void execute(){
         account.deposit(this.DepositAmount);
    }
}


