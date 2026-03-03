import java.util.Scanner;

public class BankLoanEligibilitySystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;
        double monthlyIncome;
        int creditScore;
        double existingLoanAmount;
        boolean ageEligible;
        boolean incomeEligible;
        boolean creditEligible;
        boolean loanEligible;
        String loanStatus;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your monthly income: ");
        monthlyIncome = input.nextDouble();

        System.out.print("Enter your credit score: ");
        creditScore = input.nextInt();

        System.out.print("Enter your existing loan amount: ");
        existingLoanAmount = input.nextDouble();

        ageEligible = age >= 21 && age <= 60;
        incomeEligible = monthlyIncome >= 25000;
        creditEligible = creditScore >= 650;
        loanEligible = existingLoanAmount < 500000;

        if (ageEligible && incomeEligible && creditEligible && loanEligible) {
            loanStatus = "Loan Approved";
        } else if (!ageEligible) {
            loanStatus = "Rejected due to Age Criteria";
        } else if (!incomeEligible) {
            loanStatus = "Rejected due to Low Income";
        } else if (!creditEligible) {
            loanStatus = "Rejected due to Low Credit Score";
        } else {
            loanStatus = "Rejected due to High Existing Loan";
        }

        System.out.println("Loan Status: " + loanStatus);
    }
}