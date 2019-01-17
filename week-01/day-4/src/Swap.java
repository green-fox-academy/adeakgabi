public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        //     a = a + b;
        //        b = a - b;
        //        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
