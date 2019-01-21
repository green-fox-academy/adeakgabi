import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};
        String carryFirst = abc [0];
        abc[0] = abc [2];
        abc[2] = carryFirst;

        System.out.println(Arrays.asList(abc));

    }
}
