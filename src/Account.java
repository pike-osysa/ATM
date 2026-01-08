public class Account {
    private final String AccountNo;
    private double AccountBalance;

    Account(String AccountNo,double AccountBalance){
         this.AccountBalance=AccountBalance;
         this.AccountNo=AccountNo;
    }

    public String getAccountNo(){
        return this.AccountNo;
    }

    public double getAccountBalance(){
        return this.AccountBalance;
    }

    public void withdraw(double amount){
         if(amount>this.AccountBalance){
             System.out.println("Insufficient balance. Your account balance is "+this.AccountBalance);
         }else{
             this.AccountBalance-=amount;
             System.out.println(amount+" successfully withdrawn from your account ,new account balance is "+this.AccountBalance);
         }
    }

    public void deposit(double amount){
         if(amount<0){
             throw new IllegalArgumentException("Amount cannot be negative");
         }

         AccountBalance+=amount;
        System.out.println(amount+" deposited successfully into your account ,new account balance is "+this.AccountBalance);
    }
}
