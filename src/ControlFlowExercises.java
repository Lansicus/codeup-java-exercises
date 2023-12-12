import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //While loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }


        //Do While loop to 100 incremented by 100
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i +=2;
//        }while(i <= 100);


        // count backwards from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while (i >= - 10);


        //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Follow each number with a new line.
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i <= 1_000_000);


        //Alter your loop to count backwards by 5's from 100 to -10.
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }


        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is
        // less than 1,000,000. Output should equal:
//        for(long i = 2; i <= 1_000_000; i *= i) {
//            System.out.println(i);
//        }


        //fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz: " + i);
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz: " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz: " + i);
//            }
//        }


        //Display a table of powers.
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        Scanner  scanner = new Scanner(System.in);
        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table.");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int i = 1; i <= userInt; i++){
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cubed);
//            }
//            System.out.println("Continue? [Y/N]");
//            confirm = scanner.next().equalsIgnoreCase("Y");
//        }while (confirm);
//        System.out.println("Cool. See you next time.");



        //Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //
        //Display the corresponding letter grade.
        //
        //Prompt the user to continue.
        //
        //Assume that the user will enter valid integers for the grades.
        //
        //The application should only continue if the user agrees to.
        //
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0
        do {
            System.out.println("Enter a numerical grade from zero to 100:");
            int userGrade = scanner.nextInt();

            if(userGrade >= 88){
                System.out.println("A");
            }else if(userGrade >= 80) {
                System.out.println("B");
            }else if(userGrade >= 67){
                System.out.println("C");
            }else {
                System.out.println("F");
            }

            System.out.println("Would you like to continue [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while (confirm);
        System.out.println("K thanks bye!");
    }
}


//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        // Exercise 1: While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        // Exercise 2: Do While Loop
//        System.out.println("\nExercise 2: Do While Loop");
//        int countByTwos = 0;
//        do {
//            System.out.println(countByTwos);
//            countByTwos += 2;
//        } while (countByTwos <= 100);
//
//        System.out.println("\nCounting Backwards by 5's");
//        int countBackwards = 100;
//        do {
//            System.out.println(countBackwards);
//            countBackwards -= 5;
//        } while (countBackwards >= -10);
//
//        System.out.println("\nSquared Values");
//        long squareValue = 2;
//        do {
//            System.out.println(squareValue);
//            squareValue *= squareValue;
//        } while (squareValue < 1_000_000);
//
//        // Exercise 3: For Loop
//        System.out.println("\nExercise 3: For Loop");
//        for (int j = 5; j <= 15; j++) {
//            System.out.println(j);
//        }
//
//        // Exercise 4: FizzBuzz
//        System.out.println("\nExercise 4: FizzBuzz");
//        for (int num = 1; num <= 100; num++) {
//            if (num % 3 == 0 && num % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(num);
//            }
//        }
//
//        // Exercise 5: Display Table of Powers
//        System.out.println("\nExercise 5: Display Table of Powers");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userNumber = scanner.nextInt();
//
//        System.out.println("\nHere is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int k = 1; k <= userNumber; k++) {
//            System.out.printf("%-6d | %-7d | %-5d%n", k, k * k, k * k * k);
//        }
//
//        // Exercise 6: Convert Number Grades into Letter Grades
//        System.out.println("\nExercise 6: Convert Number Grades into Letter Grades");
//        char userChoice;
//        do {
//            System.out.print("Enter a numerical grade: ");
//            int numericGrade = scanner.nextInt();
//
//            char letterGrade;
//            if (numericGrade >= 88 && numericGrade <= 100) {
//                letterGrade = 'A';
//            } else if (numericGrade >= 80) {
//                letterGrade = 'B';
//            } else if (numericGrade >= 67) {
//                letterGrade = 'C';
//            } else if (numericGrade >= 60) {
//                letterGrade = 'D';
//            } else {
//                letterGrade = 'F';
//            }
//
//            System.out.println("Letter Grade: " + letterGrade);
//
//            System.out.print("Do you want to continue? (y/n): ");
//            userChoice = scanner.next().charAt(0);
//        } while (userChoice == 'y' || userChoice == 'Y');
//
//        // Bonus: Include pluses and minuses in grade ranges
//        // (ex: 99-100 = A+)
//        // Update the letterGrade variable accordingly in Exercise 6.
//    }
//}

