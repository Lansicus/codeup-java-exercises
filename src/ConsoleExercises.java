import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = 0.0; // Declare area at the beginning


        /* 1. Write some Java code that uses the variable pi to output the following:
             "The value of pi is approximately 3.14." */
        double pi = 3.14159;
        System.out.print("Exercise 1: ");
        try {
            System.out.format("The value of pi is approximately %.2f.%n", pi);
        } catch (Exception e) {
            System.out.println("An error occurred during Exercise 1.");
        }


        /* 2. Prompt a user to enter an integer and store that value in an int variable using the nextInt method. */
        System.out.print("Exercise 2: ");
        boolean intInput = false;

        while (!intInput) {
            try {
                System.out.print("Please enter an integer: ");
                int userInt = scanner.nextInt();
                System.out.println("You entered: " + userInt);
                intInput = true; // Set flag to exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Your input must be a number.");
                scanner.nextLine(); // Clear the buffer
            }
        }


        /* 3. Prompt a user to enter 3 words. if the user gives 3 strings then display them back in the console, each
         on a newline. if the user inputs more than 3 strings "throw new InputMismatchException("Only type three words.
          No more. No less.");" */
        System.out.print("Exercise 3: ");
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter three words: ");
                String word1 = scanner.next();
                String word2 = scanner.next();
                String word3 = scanner.next();

                // Check if any of the inputs contain only digits (using the regex \\d+).
                if (word1.matches("\\d+") || word2.matches("\\d+") || word3.matches("\\d+")) {
                    throw new InputMismatchException();
                } else {
                    System.out.println("You entered:\n" + word1 + "\n" + word2 + "\n" + word3);
                    validInput = true; // Set flag to exit the loop
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage()); // Display the error message
                scanner.nextLine(); // Clear the buffer
            }
        }



        /* 4. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
         Then, display that sentence back to the user.*/
        System.out.print("Exercise 4: ");
        int stringCount = 0;

        try {
            scanner.nextLine(); // Consume the remaining newline character
            System.out.print("Enter a sentence: ");
            String sentence = scanner.next();
            System.out.println("You entered: " + sentence);

            // Increment the counter for each string input
            if (!sentence.matches("\\d+")) {
                stringCount++;
            }

        } catch (Exception e) {
            System.out.println("An error occurred during Exercise 4.");
        } finally {
            // Execute the finally block only if at least two strings are input
            if (stringCount >= 2) {
                scanner.nextLine(); // Clear the buffer
            }
        }

        /* 4. ALTERNATIVE Rewrite the above example using the nextLine method. */
        System.out.print("Exercise 4 (alternative): ");
        try {
            scanner.nextLine(); // Consume the remaining newline character
            System.out.print("Enter a sentence: ");
            String sentenceAlt = scanner.nextLine();
            System.out.println("You entered: " + sentenceAlt);
        } catch (Exception e) {
            System.out.println("An error occurred during Exercise 4 (alternative).");
        } finally {
            scanner.nextLine(); // Clear the buffer
        }



        /* 5. Prompt the user to enter values of length and width of a classroom at Codeup.*/
        System.out.print("Exercise 5: ");
        try {
            System.out.print("Enter the length of the classroom: ");
            double length = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the width of the classroom: ");
            double width = Double.parseDouble(scanner.nextLine());

            /*Display the area and perimeter of that classroom.*/
            area = length * width; // Assign the calculated area
            double perimeter = 2 * (length + width);

            System.out.format("The area of the classroom is %.2f square units.%n", area);
            System.out.format("The perimeter of the classroom is %.2f units.%n", perimeter);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("An error occurred during Exercise 5.");
        } finally {
            scanner.nextLine(); // Clear the buffer
        }


        // Bonus: Accept decimal entries and calculate volume
        System.out.print("Bonus Exercise: ");
        try {
            System.out.print("Enter the height of the classroom: ");
            double height = Double.parseDouble(scanner.nextLine());

            double volume = area * height;
            System.out.format("The volume of the classroom is %.2f cubic units.%n", volume);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("An error occurred during the bonus exercise.");
        } finally {
            scanner.nextLine(); // Clear the buffer
        }

        // Bonus: useDelimiter method
        System.out.print("Bonus Exercise (useDelimiter): ");
        try {
            scanner.useDelimiter("\n"); // Set the delimiter to newline character
            System.out.print("Enter a line of text: ");
            String userText = scanner.next();
            System.out.println("You entered: " + userText);
        } catch (Exception e) {
            System.out.println("An error occurred during the bonus exercise (useDelimiter).");
        } finally {
            scanner.close(); // Close the scanner in the 'finally block'
        }
    }

}
