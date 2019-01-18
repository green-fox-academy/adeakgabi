import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

        Scanner scanner = new Scanner (System.in);

        System.out.println("Insert a number!");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput; j++){
                if (i == 0 || i == (userInput -1)) {
                    System.out.print("%");
                } else if (j == 0 || j == (userInput -1)){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }

}
