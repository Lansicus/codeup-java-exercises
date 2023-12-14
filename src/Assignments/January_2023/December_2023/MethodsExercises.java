package Assignments.January_2023.December_2023;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepCalculating;

        do {
            System.out.print("Open calculator? [y/n]: ");
            String calculate = scanner.next();
            if (calculate.toLowerCase().startsWith("y")) {
                System.out.print("""
                        Choose operation:
                        1. Factorial of one number
                        2. Two-number math
                        [1/2]:\s""");
                String initiate = scanner.next();

                if (initiate.startsWith("2")) {
                    double num1 = getDoubleInput("Enter the first number: ");
                    double num2 = getDoubleInput("Enter the second number: ");
                    char operation = getOperationInput();

                    performOperation(num1, num2, operation);
                } else if (initiate.startsWith("1")) {
                    int num = getIntInput("Input a number between 0-20: ");
                    calculateFactorial(num);
                } else {
                    break;
                }

                System.out.print("Keep calculating? [y/n]: ");
                String ynInput = scanner.next();
                keepCalculating = ynInput.equalsIgnoreCase("y");
            } else {
                keepCalculating = false;
            }
        } while (keepCalculating);

        System.out.println("Goodbye! Have a great day.");
        scanner.close();
    }

    private static double getDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static int getIntInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static char getOperationInput() {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Undefined: Cannot divide by zero.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Remainder: " + (a % b));
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
//Create a method that validates that user input is in a certain range and returns that input as an integer if it is
// within the given range. If not, prompt the user to input their number again until the input is within range.
//
//The method signature should look like this:
//
//public static int getInteger(int min, int max);
//and is used like this:
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!


    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        return userInput;
    }


}