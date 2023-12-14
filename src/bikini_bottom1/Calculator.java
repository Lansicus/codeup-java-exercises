package bikini_bottom1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Advanced Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Factorial");
        System.out.println("0. Exit");
        do {

            System.out.print("Choose operation (0-6): ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    performOperation("Addition", "+");
                    break;
                case 2:
                    performOperation("Subtraction", "-");
                    break;
                case 3:
                    performOperation("Multiplication", "*");
                    break;
                case 4:
                    performOperation("Division", "/");
                    break;
                case 5:
                    performOperation("Remainder", "%");
                    break;
                case 6:
                    performFactorial();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6.");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        scanner.close();
    }

    private static void performOperation(String operationName, String operator) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of operands: ");
        int numOperands = scanner.nextInt();

        if (numOperands < 2) {
            System.out.println("Error: At least two operands are required for " + operationName + ".");
            return;
        }

        double result = 0;
        for (int i = 1; i <= numOperands; i++) {
            System.out.print("Enter operand " + i + ": ");
            double operand = scanner.nextDouble();

            if (i == 1) {
                result = operand;
            } else {
                switch (operator) {
                    case "+":
                        result += operand;
                        break;
                    case "-":
                        result -= operand;
                        break;
                    case "*":
                        result *= operand;
                        break;
                    case "/":
                        if (operand != 0) {
                            result /= operand;
                        } else {
                            System.out.println("Error: Division by zero is undefined.");
                            return;
                        }
                        break;
                    case "%":
                        if (operand != 0) {
                            result %= operand;
                        } else {
                            System.out.println("Error: Division by zero is undefined.");
                            return;
                        }
                        break;
                }
            }
        }

        System.out.println("Result: " + result);
    }

    private static void performFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Error: Factorial is defined only for non-negative integers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Result: " + factorial);
        }
    }
}
