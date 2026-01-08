public class BalanceInquiryTransaction extends  Transaction{


    private double accountBalance;

    public BalanceInquiryTransaction(Account acc) {
        super(acc);
    }

    @Override
    public void execute() {

        this.accountBalance=account.getAccountBalance();

        System.out.println("Your account balance is "+this.accountBalance);

    }
}
