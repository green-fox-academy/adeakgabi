import java.util.Scanner;
public class AvarageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number!");
        int userInput1 = scanner.nextInt();

        System.out.println("Insert a number!");
        int userInput2 = scanner.nextInt();

        System.out.println("Insert a number!");
        int userInput3 = scanner.nextInt();

        System.out.println("Insert a number!");
        int userInput4 = scanner.nextInt();

        System.out.println("Insert a number!");
        int userInput5 = scanner.nextInt();

        int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        double average = sum/5;

        System.out.println("Sum = " + sum + ", Average: " + average);


    }


}
