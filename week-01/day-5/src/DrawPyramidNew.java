import java.util.Scanner;
public class DrawPyramidNew {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number!");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput; i++) {
            for (int j = userInput - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            for (int j = userInput - 1; j > 1; j++){
                System.out.print(" ");
            }
            for (int j =0; j <=i; j--){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}

