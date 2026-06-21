import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        System.out.println("=== Java Calculator App ===");
        while (keepRunning) {
            System.out.print("\nEnter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }
            double num1 = scanner.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
                continue;
            }
            double num2 = scanner.nextDouble();
            double result = 0;
            boolean validOperation = true;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator chosen.");
                    validOperation = false;
            }
            if (validOperation) {
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes") && !choice.equals("y")) {
                keepRunning = false;
                System.out.println("Thank you for using the Calculator!");
            }
        }
        scanner.close();
    }
}
