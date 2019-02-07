import java.util.HashMap;

public class CountLetters {
    String word;

    public CountLetters(){
        word = "ascdaasdasvbenwne";
    }

    public HashMap<Character, Integer> getDictionary(String useThisString) {
        HashMap<Character, Integer> stringDictionary = new HashMap<>();
        for (int i = 0; i < useThisString.length(); i++) {
            if (stringDictionary.containsKey(useThisString.charAt(i))) {
                int temp = stringDictionary.get(useThisString.charAt(i));
                temp += 1;
                stringDictionary.put(useThisString.charAt(i), temp);
            } else {
                stringDictionary.put(useThisString.charAt(i), 1);
            }
        }
        return stringDictionary;
    }
}