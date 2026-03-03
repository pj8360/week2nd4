import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int unitsConsumed;
        double billAmount = 0.0;
        double surcharge;
        double finalAmount;
        boolean isHighUsage;

        System.out.print("Enter units consumed: ");
        unitsConsumed = input.nextInt();

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 1.5) + (unitsConsumed - 100) * 2.5;
        } else {
            billAmount = (100 * 1.5) + (200 * 2.5) + (unitsConsumed - 300) * 4.0;
        }

        isHighUsage = unitsConsumed > 500;

        if (isHighUsage) {
            surcharge = billAmount * 0.1;
        } else {
            surcharge = 0.0;
        }

        finalAmount = billAmount + surcharge;

        System.out.println("Base Bill: " + billAmount);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill Amount: " + finalAmount);
    }
}