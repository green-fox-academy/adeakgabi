import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SecondTest {

    @Test
    public void getDictionary_ContainsInputChar_ReturnsTrue(){
        CountLetters countLetters = new CountLetters();
        String testString = "baba";
        assertTrue(countLetters.getDictionary(testString).containsKey('b'));
    }

    @Test
    public void getDictionary_Hashmap_Test(){
        CountLetters countLetters = new CountLetters();
        HashMap<Character, Integer> testWithThis = new HashMap<>();
        testWithThis.put('b', 3);
        testWithThis.put('l', 3);
        testWithThis.put('a', 3);
        assertEquals(testWithThis, countLetters.getDictionary("blablabla"));
    }

    @Test
    public void getDictionary_CheckHashmapSize(){
        CountLetters countLetters = new CountLetters();
        HashMap<Character, Integer> testWithThis = new HashMap<>();
        assertEquals(3, countLetters.getDictionary("blablabla").size());
    }

    @Test
    public void getFibonacci_WithInitializedInput_ReturnsFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int number = 8;
        assertEquals(21, fibonacci.getFibonacci(number));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFibonacci_WithNegativeNumber_ReturnsException(){
        Fibonacci fibonacci = new Fibonacci();
        int number = (-2);
        fibonacci.getFibonacci(number);
    }





}
