public class WithdrawTransaction extends Transaction{
    private double WithdrawalAmount;

    public WithdrawTransaction(Account acc,double amount){
         super(acc);

         this.WithdrawalAmount =amount;
    }
    @Override
    public void execute() {
        account.withdraw(this.WithdrawalAmount);

    }
}
