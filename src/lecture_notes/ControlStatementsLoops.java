package lecture_notes;

public class ControlStatementsLoops {

    public static void main(String[] args) {
//        ------------ Boolean Expressions ------------------
//        System.out.println(10 > 5);
//        System.out.println(5 == 5);
//        System.out.println(true == false);
//        System.out.println();
//        System.out.println(2 <= 2);

//        ----- Logical Operators ---------
//        boolean isLoggedIn = true;
//        boolean isAdmin = false;
//
//        if(isLoggedIn && isAdmin) {
//            System.out.println("admin page");
//        }
//
//        System.out.println((true == true) || true == false);


//        ------ String Comparison -------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//        sc.close();
//
//        String firstName = "John";
//        System.out.println(firstName);
//
//        firstName = firstName + "Hello";
////        String lastName = "John";
//
//        System.out.println(firstName);

//        ------- Control Structure --------

        boolean lectureTime = true;

        if(lectureTime) {
            System.out.println("learning something");
        } else {
            System.out.println("this will always run");
        }


        boolean learningJava = true;
        boolean learningJavaScript = true;
        boolean learningHTML = true;

        if(learningJava && learningJavaScript && learningHTML) {
            System.out.println("Learning JAVA, JavaScript, HTML");
        } else if(learningJavaScript) {
            System.out.println("learning JavaScript");
        } else if(learningHTML) {
            System.out.println("learning html");
        } else if(learningJava) {
            System.out.println("Learning JAVA");
        } else {
            System.out.println("Learning something else");
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Type 1,2,3 ");
//        int userInput = sc.nextInt();

//        switch (userInput) {
//            case 1 -> System.out.println("Case 1");
//            case 2 -> System.out.println("Case 2");
//            default -> System.out.println("Default case");
//        }

//        int i = 11;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i < 10);


//        for loop
        for(int i = 0; i < 20; i++) {

            if(i == 7) {
                System.out.println("Who - that's a lucky number");
                continue;
            }

            if(i == 9) {
                System.out.println("break the loop");
                break;
            }

            System.out.println("i = " + i );
        }
    }
}