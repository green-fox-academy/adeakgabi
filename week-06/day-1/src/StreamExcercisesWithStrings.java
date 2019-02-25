import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExcercisesWithStrings {

    public static void main(String[] args) {

        //Write a Stream Expression to find the uppercase characters in a string!
        String uppercaseLetters = "AppLe";
        List<Character> uppercaseChars = uppercaseLetters.chars()
                        .mapToObj(i -> (char)i)
                        .filter(Character::isUpperCase).collect(Collectors.toList());

        System.out.println(uppercaseChars);

        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        char wordsStartWith = 'A';
        cities.stream()
              .filter(c -> c.charAt(0) == wordsStartWith)
              .forEach(System.out::println);

        System.out.println("--------------");

        //Write a Stream Expression to concatenate a Character list to a string!
        List<Character> charList = Arrays.asList ('a', 'p', 'p', 'l', 'e');
        String stringOfChars = charList.stream()
                .map(String :: valueOf)
                .collect(Collectors.joining());

        System.out.println(stringOfChars);

        System.out.println("--------------");

        //Write a Stream Expression to find the frequency of characters in a given string!
        String findFrequencyHere = "Count the letters heeeere";
        Map<Character, Integer> frequencies = findFrequencyHere.chars().boxed()
                .collect(Collectors.toMap(
                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting
        System.out.println("Frequencies:\n" + frequencies);




    }
}
