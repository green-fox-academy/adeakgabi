import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner (System.in);

        System.out.println( "How long is the marathon in km?");

        int userInput = scanner.nextInt();

        double kmInMiles = 0.621371192;
        System.out.println( userInput * kmInMiles + " in miles");


    }
}