import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int limit;
        int skipValue;
        int stopValue;
        int i;
        boolean isSkipped;

        System.out.print("Enter number for table: ");
        number = input.nextInt();

        System.out.print("Enter limit: ");
        limit = input.nextInt();

        System.out.print("Enter value to skip: ");
        skipValue = input.nextInt();

        System.out.print("Enter value to stop at: ");
        stopValue = input.nextInt();

        for (i = 1; i <= limit; i++) {

            if (i == stopValue) {
                break;
            }

            isSkipped = i == skipValue;

            if (isSkipped) {
                continue;
            }

            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}