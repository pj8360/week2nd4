import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        boolean isEven;
        boolean isPrime = true;
        int i;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        isEven = number % 2 == 0;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        if (isEven) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}