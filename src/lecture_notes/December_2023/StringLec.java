package lecture_notes.December_2023;

import java.util.Scanner;

public class StringLec {

    public static void main(String[] args) {

//        String message = "Hello";
//        System.out.println(message);
//        message = message + "World!";
//        System.out.println(message);
//
//
//        String day = "Wednesday";
//        String day2 = new String("Wednesday");
//        System.out.println(day.equals(day2));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

// Don't do this!
//        boolean confirmation = userInput == "y";
//        System.out.println(confirmation);

//  Do this instead
//        boolean confirmation = userInput.equals("y");
//        System.out.println(confirmation);


// DON'T DO THIS
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//        }

//        But in general we cannot rely on that behavior, and should use either the
//`equals` or `equalsIgnoreCase` method on a string object to compare string
//        values.

// Do this instead!
//        if ("I am a string".equals("I am a string")) {
//            System.out.println("Strings are equal");
//        }


        String input = "Codeup Rocks!";

        System.out.println(input.equals("codeup rocks!"));  // false
        System.out.println(input.equals("Codeup Rocks!")); // true

        System.out.println(input.equalsIgnoreCase("codeup rocks!")); // true
        System.out.println(input.equalsIgnoreCase("CODEUP ROCKS!")); // true

        System.out.println(input.startsWith("codeup")); // false
        input.startsWith("Codeup"); // true
//
        input.endsWith("rocks"); // false
        input.endsWith("rocks!"); // false
        System.out.println(input.endsWith("Rocks!")); // true

//    String manipulation methods
        String manipulation = "String to manipulate";
        String trimTest = "     String to manipulate           ";

        System.out.println(manipulation.charAt(4));

        System.out.println(manipulation.indexOf("y"));
        System.out.println(manipulation.indexOf("i"));

        System.out.println(manipulation.lastIndexOf("n"));

        System.out.println(manipulation.length());

        System.out.println(manipulation.replace("manipulate", "change"));

        System.out.println(manipulation.substring(6));
        System.out.println(manipulation.substring(0,6));

        System.out.println(manipulation.toLowerCase());
        System.out.println(manipulation.toUpperCase());

        System.out.println(trimTest.trim());

    }
}