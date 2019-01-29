import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number under 10!");
        int userInput = scanner.nextInt();

        try {
            int result = 10 / userInput;
            System.out.println(result);
        }catch (ArithmeticException ex) {
            System.out.println("fail");
        }


    }

}
