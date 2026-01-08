import java.util.Scanner;

public class TransactionFactory {

    public static Transaction createTransaction(int choice, Account acc, Scanner scanner){
        return switch (choice) {
            case 1 -> {
                System.out.print("Enter amount to withdraw: ");
                yield new WithdrawTransaction(acc, scanner.nextDouble());
            }
            case 2 -> {
                System.out.print("Enter Amount to deposit: ");
                yield new DepositTransaction(acc, scanner.nextDouble());
            }
            case 3 -> new BalanceInquiryTransaction(acc);
            default -> null;
        };
    }
}
