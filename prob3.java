import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        double balance = 10000.0;
        double depositAmount;
        double withdrawAmount;
        boolean continueTransaction = true;

        while (continueTransaction) {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    depositAmount = input.nextDouble();
                    balance = balance + depositAmount;
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    withdrawAmount = input.nextDouble();

                    if (withdrawAmount <= balance && withdrawAmount > 0) {
                        balance = balance - withdrawAmount;
                        System.out.println("Updated Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance or Invalid Amount");
                    }
                    break;

                case 4:
                    continueTransaction = false;
                    System.out.println("Thank You for Using ATM");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}