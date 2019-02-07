import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    String word1;
    String word2;

    public Anagram(String word1, String word2){
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean checkIfAnagrams (String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String sortedWord1 = new String(char1);
        String sortedWord2 = new String(char2);
        return sortedWord1.equals(sortedWord2);
    }

}
