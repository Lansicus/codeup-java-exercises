package December_2023;

import java.util.Scanner;

public class Bob {


//Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//Bob answers 'Bet.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, dude. Go gather some chill.' if you yell at him. (the input ends with an exclamation mark)
//He says '... Don dokodokodoko' if you address him without actually saying anything. (empty input)
//He answers 'Probs.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueTalking;

        do {
            System.out.print("Speak to Bob? [y/n]: ");
            String initiate = scanner.nextLine();

            if (initiate.toLowerCase().startsWith("y")) {
                System.out.print("What would you like to talk about? ");
                String userInput = scanner.nextLine();
                respondToUserInput(userInput);
            } else {
                break;
            }

            System.out.print("Keep talking? [y/n]: ");
            String ynInput = scanner.nextLine();
            continueTalking = ynInput.equalsIgnoreCase("y");

        } while (continueTalking);

        System.out.println("Goodbye! Have a great day.");
        scanner.close();
    }


    private static void respondToUserInput(String userInput) {
        if (userInput.endsWith(".")) {
            System.out.println("Didn't know you were chill like that.");
        } else if (userInput.endsWith("?")) {
            System.out.println("Did you read the documentation?");
        } else if (userInput.endsWith("!")) {
            System.out.println("Brother, thou needest to chill");
        } else if (userInput.trim().isEmpty()) {
            System.out.println("Wow, much impress. So conversation. Very talk.");
        } else {
            System.out.println("... ... Don dokodokodoko");
        }
    }



}
