import java.util.Scanner;

public class AdvancedLoginSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "java123";
        String enteredUsername;
        String enteredPassword;

        int attempts = 3;
        int currentAttempt = 1;

        boolean loginSuccess = false;

        while (currentAttempt <= attempts) {

            System.out.print("Enter Username: ");
            enteredUsername = input.next();

            System.out.print("Enter Password: ");
            enteredPassword = input.next();
			
            loginSuccess = enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword);

            if (loginSuccess) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid Credentials");
            }

            currentAttempt++;
        }

        if (!loginSuccess) {
            System.out.println("Account Locked");
        }
    }
}