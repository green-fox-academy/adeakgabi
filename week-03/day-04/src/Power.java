public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
        System.out.println(power(8));
    }

    public static int power (int n){
        int base = 2;
        if (n == 0){
            return 1;
        }
        return power(n-1)*base;
    }
}
