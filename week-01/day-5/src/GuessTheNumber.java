import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

     Scanner scanner = new Scanner(System.in);

        int a = 8;
        System.out.println("Insert a number!");
        int userInput = scanner.nextInt();


        while (userInput != a) {
            if (userInput < a) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stored number is lower");
            }
            System.out.println("Insert a number!");
            userInput = scanner.nextInt();
        }

        if (userInput == a) {
            System.out.println("You found the number: 8");
        }




    }

}
