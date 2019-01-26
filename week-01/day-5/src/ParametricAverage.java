import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please insert a number!");
    double userInput = scanner.nextInt();

    int sumOfInputs = 0;

        for (int i = 0; i < userInput ; i++) {
            System.out.println("Please insert a number!");
            int userInput1 = scanner.nextInt();
            int userInput2 = userInput1;
            userInput1 = 0;

            sumOfInputs += userInput2;
        }

       double average = sumOfInputs/userInput;
       System.out.println("Sum: " + sumOfInputs + " , " + "Average: " + average);







    }


}
