import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner (System.in);

        System.out.println("Insert a number!");
        int userInput = scanner.nextInt();

        int j = userInput;
        for (int i = 0; i < j; i++) {
            for (int k = 0; k <= i; k++ ) {
                System.out.print(userInput);
            }
            System.out.println();
        }
        }
    }

