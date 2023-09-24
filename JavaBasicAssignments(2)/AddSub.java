import java.util.Scanner;

public class AddSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 'y';

        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.print("Enter your choice (1/2): ");

            int option = scanner.nextInt();

            if (option != 1 && option != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue;
            }
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            if (option == 1) {
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            } else if (option == 2) {
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y'|| choice=='Y');

        System.out.println("Program terminated.");
        scanner.close();
    }
}
