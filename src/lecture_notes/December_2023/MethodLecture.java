package lecture_notes.December_2023;

import java.util.Scanner;

public class MethodLecture {
    public static void main(String[] args) {
        System.out.println(startingApplication());
        System.out.println(sayHello());
        System.out.println(sayHello("hello", "bob"));
        System.out.println(sayHello("bob"));
        System.out.println(addingNums(3, 2));
        System.out.println(birthday("Bob", 5));
        String changeMe = "hello codeup!";
        changeString(changeMe);
        System.out.println(changeMe);
        count(10);
        int base = 2;
        int exponent = 3;
        long result = getPower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
        iSpy("chair", "sit on it");
    }

    //    Defining Methods
//    - Methods are similar to functions, meaning it is built to perform a specific task
//    - Similar to functions in JS, methods accept parameters and produce an output
//    Basic Syntax:
//    public static returnType methodName([param1[, param2[, ...]]) {
    // the statements of the method
    // a return statement, if a return type is declared
//    }
//        * public: is the visibility modified
//            - shows that this method can be accessed by code outside of the class
//        * static:
//            - When declared it states the method belongs to the class rather than a specific instance.
//            - Meaning it can be called without creating an instance of the class.
//            - Allows a method, to be called before an object of the class is created,
//            - Static Methods can: access static data directly & call other static methods only
//
//        * returnType:
//            - THis is the return type of the method
//            - All methods must define the type of the value they will return
//            - If there is no return, use the special keyword 'void'
//        * methodName
//            - The name of the function/method
//        * param1:
//             Parameters the method accepts
//            - A method can have no parameters, one parameters, or multiple parameters.
//            - Must include the type that specifies each parameter.
//            * Everything inside the curly braces is the body of the method.
//
//        - When building methods, they will need to be on the outside of the main method.
    //    Example:
//     Example of no parameter
    public static String startingApplication() {
        return "Starting my application";
    }

    //    example with 2 parameter
//    public static String sayHello(String greeter, String name) {
//        return greeter + " " + name;
//    }
    //   You do: Create a method that takes in two numbers and return the sum of the numbers. Name the method addingNums
    public static int addingNums(int a, int b) {
        return a + b;
    }

    // You do: Create a method that takes in two parameters, the first one is a name and the second parameter is the age. It should return name + age. Name the method birthday.
    public static String birthday(String name, int age) {
        return String.format("Happy birthday %s! You're %d years old!", name, age);
    }

    // Method Overloading
// Example
    public static String sayHello() {
        return "Hello Hello";
    }

    public static String sayHello(String greeter, String name) {
        return greeter + " " + name;
    }

    public static String sayHello(String name) {
        return name;
    }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }

    //    Recursion
//    - A concept that aims to solve a problem by dividing it into smaller chunks.
//    - The core idea is to create a method that calls itself, with different parameters than originally passed.
//    - It is important to have a 'base case' or a 'stop condition' so that the method does not call itself over and over indefinitely.
    public static void count(int n) {
//        the if condition is going to be our base case
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    //    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    //    ispy
    public static void iSpy(String objectToFind, String hint) {
        System.out.println("Player1: I spy with my little eyes something " + hint.concat("!"));
        Scanner spyaneer = new Scanner(System.in);
        String guess = spyaneer.nextLine();
        System.out.println("Player2: I spy, with my little eyes " + guess);
        if (guess.equalsIgnoreCase(objectToFind)) {
            System.out.println("you won!");
            return;
        }
        System.out.println("keep guessing!");
        iSpy(objectToFind, hint);
    }
}