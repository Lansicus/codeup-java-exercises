package Assignments.January_2023.December_2023;

import java.util.Scanner;


/*----------------------------------------------------------------------------------------------------------------------  CALCULATOR */
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepCalculating;

        do {
            System.out.print("Engage in simple, 2-parameter math? [y/n]: ");
            String initiate = scanner.nextLine();

            if (initiate.toLowerCase().startsWith("y")) {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Choose operation (+, -, *, /, %, !): ");
                char operation = scanner.next().charAt(0);
                scanner.nextLine(); // Consume the newline character

                performOperation(num1, num2, operation);
            } else {
                break;
            }

            System.out.print("Keep mathing? [y/n]: ");
            String ynInput = scanner.nextLine();
            keepCalculating = ynInput.equalsIgnoreCase("y");

        } while (keepCalculating);

        System.out.println("Goodbye! Have a great day.");
        scanner.close();
    }

    public static void performOperation(double a, double b, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
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
            case '!':
                if (a >= 0 && a == Math.floor(a) && a <= 20) {
                    System.out.println("Factorial of " + (int) a + ": " + calculateFactorial((int) a));
                } else {
                    System.out.println("Invalid input for factorial calculation. Please enter a non-negative integer <= 20.");
                }
                break;

            default:
                System.out.println("Invalid operation.");
        }
    }

    public static double calculateFactorial(int n) {
        if (n < 0 || n > 20) {
            System.out.println("Cannot perform factorial calculation on input > 20.");
            return -1; // Return a special value to indicate an error
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
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