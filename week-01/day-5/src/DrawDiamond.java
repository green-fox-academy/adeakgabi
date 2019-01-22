import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

      Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number!");
        int userInput = scanner.nextInt();

        for(int i = 0; i < userInput; i++){
            for (j = userInput -i; j > 1; j--){
                System.out.print(" *");
            }
        }

    }


}
