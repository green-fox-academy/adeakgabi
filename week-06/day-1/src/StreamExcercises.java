import java.util.Arrays;
import java.util.List;

public class StreamExcercises {
    public static void main(String[] args) {

        //Write a Stream Expression to get the even numbers from the following list
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream()
               .filter( x -> x%2 == 0)
               .forEach(System.out::println);

        System.out.println("--------------");

        //Write a Stream Expression to get the squared value of the positive numbers from the following list
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers1.stream()
                .filter( x -> x > 0)
                .mapToInt(x -> (int) Math.pow(x, 2))
                .forEach(System.out::println);

        System.out.println("--------------");

        //Write a Stream Expression to find which number squared value is more then 20 from the following list
        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers3.stream()
                .mapToInt( x -> (int) Math.pow(x, 2))
                .filter( x -> x > 20)
                .forEach(System.out::println);

        System.out.println("--------------");

        //Write a Stream Expression to get the average value of the odd numbers from the following list
        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);









    }
}
