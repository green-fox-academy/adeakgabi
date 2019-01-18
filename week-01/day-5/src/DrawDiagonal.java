import java.util.Scanner;
public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner (System.in);

        System.out.println("Insert a number!");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput; i++) {
            for (int k = 0; k < userInput; k++) {
                if (i == 0 || i == userInput -1){
                    System.out.print("%");

                } else if (k == 0 || k == userInput -1){
                    System.out.print("%");
                } else if (i == k) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }



    }
}
