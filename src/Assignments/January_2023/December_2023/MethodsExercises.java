package Assignments.January_2023.December_2023;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        /*------------------------------------------------------------------- CALCULATOR SCANNER */
        Scanner scanner = new Scanner(System.in);
        boolean keepCalculating;

        System.out.print("Open calculator? [y/n]: ");
        String calculate = scanner.next().toLowerCase();
        do {
            if (calculate.startsWith("y")) {
                System.out.print("""
                        Choose operation:
                        1. Factorial of one number
                        2. Two-number math
                        [1/2]:\s""");
                String initiate = scanner.next().trim();

                if (initiate.startsWith("2")) {
                    double num1 = getDoubleInput("Enter the first number: ", scanner);
                    double num2 = getDoubleInput("Enter the second number: ", scanner);
                    char operation = getOperationInput(scanner);

                    performOperation(num1, num2, operation);
                } else if (initiate.startsWith("1")) {
                    int num = getIntInput("Input a number between 0-20: ", scanner);
                    calculateFactorial(num);
                }
                else {
                    break;
                }

                System.out.print("Keep calculating? [y/n]: ");
                scanner.nextLine();
                String ynInput = scanner.nextLine();
                keepCalculating = ynInput.equalsIgnoreCase("y");
            }
            else {
                keepCalculating = false;
            }
        } while (keepCalculating);

        System.out.println("Closing calculator. Have a great day!");
        scanner.close();

        /*------------------------------------------------------------------- RANGE SCANNER */
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10, scanner);
//
//        System.out.println("You entered: " + userInput);
//
//        scanner.close();
    }


/*--------------------------------------------------------------------------------------------------------------------*/
    private static double getDoubleInput(String message, Scanner scanner) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static int getIntInput(String message, Scanner scanner) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static char getOperationInput(Scanner scanner) {
        System.out.print("Choose operation (+, -, *, /, %): ");
        String input;
        while (!(input = scanner.next()).matches("[+\\-*/%]")) {
            System.out.print("Invalid input. Choose a valid operation: ");
        }
        return input.charAt(0);
    }

    public static void performOperation(double a, double b, char operation) {
        switch (operation) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, (a + b));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, (a - b));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", a, b, (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, (a / b));
                } else {
                    System.out.println("Undefined: Cannot divide by zero.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.printf("%.2f %% %.2f = %.2f%n", a, b, (a % b));
                } else {
                    System.out.println("Cannot calculate remainder when dividing by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public static void calculateFactorial(int n) {
        if (n < 0 || n > 20) {
            System.out.println("Cannot perform factorial calculation on input < 0, > 20.");
            return;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }



/*----------------------------------------------------------------------------------------------------------------------  RANGER */
//    public static int getInteger(int min, int max, Scanner scannerRange) {
//        System.out.print("Please enter a number between " + min + " and " + max + ": ");
//        try {
//            int input = Integer.parseInt(scannerRange.nextLine());
//
//            // Check if the input is within the specified range
//            if (input >= min && input <= max) {
//                return input;
//            } else {
//                System.out.println("Invalid input. Number must be between " + min + " and " + max + ".");
//                // Recursively call the method to prompt the user again
//                return getInteger(min, max, scannerRange);
//            }
//        } catch (NumberFormatException e) {
//            // Handle non-integer input
//            System.out.println("Invalid input. Please enter a valid number.");
//            // Recursively call the method to prompt the user again
//            return getInteger(min, max, scannerRange);
//        }
//    }


}