import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FirstTests {

    @Test
    public void getApple_ReturnsApple(){
        Apples apple = new Apples();
        assertEquals("apple", apple.getApple());
    }

    @Test
    public void getSum_InitializedInput_ReturnsSum(){
        Sum sum1 = new Sum();
        ArrayList<Integer> testNumbers = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        assertEquals(4, sum1.getSum(testNumbers));
    }

    @Test
    public void getSum_WithEmptyList_ReturnsZero(){
        Sum sum1 = new Sum();
        ArrayList<Integer> emptyList = new ArrayList<>();
        assertEquals(0, sum1.getSum(emptyList));
    }

    @Test
    public void getSum_WithOneElementList_ReturnsElement(){
        Sum sum1 = new Sum();
        ArrayList<Integer> listWithOneElement = new ArrayList(Arrays.asList(new Integer[]{3}));
        assertEquals(3, sum1.getSum(listWithOneElement));
    }

    @Test
    public void getSum_WithMultipleElements_ReturnsSum(){
        Sum sum1 = new Sum();
        ArrayList<Integer> listWithMultipleElements = new ArrayList(Arrays.asList(new Integer[]{3, 4, 5, 6, 7,8, 6,4,14,52}));
        assertEquals(109, sum1.getSum(listWithMultipleElements));
    }

    @Test (expected = NullPointerException.class)
    public void getSum_WithNull_ReturnsNullException(){
        Sum sum1 = new Sum();
        ArrayList<Integer> listWithNull = new ArrayList<>(null);
        sum1.getSum(listWithNull);
    }

    @Test
    public void checkIfAnagrams_InitializedInput_ReturnsTrue(){
        Anagram anagram = new Anagram();
        String word1 = "apple";
        String word2 = "paPLe";
        assertTrue(anagram.checkIfAnagrams(word1, word2));
    }

    @Test
    public void checkIfAnagrams_DifferentLengthWords_ReturnsFalse(){
        Anagram anagram = new Anagram();
        String word1 = "appleee";
        String word2 = "apple";
        assertFalse(anagram.checkIfAnagrams(word1, word2));
    }

    @Test
    public void checkIfAnagrams_WithEmptyStrings_ReturnsTrue(){
        Anagram anagram = new Anagram();
        String word1 = "";
        String word2 = "";
        assertTrue(anagram.checkIfAnagrams(word1, word2));
    }





}
