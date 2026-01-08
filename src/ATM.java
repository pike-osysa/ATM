import java.util.Scanner;

public class ATM {
    private Scanner scanner=new Scanner(System.in);

    private Bank bank;

    public ATM(Bank bank){
        this.bank=bank;
    }

    public void start(){



        System.out.print("Please Enter Your Card number: ");
        String CardNumber=scanner.nextLine();
        System.out.print("Please Enter Your Account Pin: ");
        String AccountPin=scanner.nextLine();
        User user=bank.AuthenticateUser(CardNumber,AccountPin);

        if(user==null){
            System.out.println("Authentication Failed ,Either the card number or the pin were wrong");
            return;
        }

        while(true){
            System.out.println("\n\n 1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Account Balance");
            System.out.println("4.Exit");

            System.out.println("Enter your choice");
            int choice=scanner.nextInt();

            if(choice==4) break;

            Transaction transaction=TransactionFactory.createTransaction(choice,user.getUserAccount(),scanner);

            if(transaction !=null){
                try{
                    transaction.execute();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
