public class Refactorio {
    public static void main(String[] args) {
        // Create a recursive function called `refactorio`
        // that returns it's input's factorial

        System.out.println(refactorio(5));
    }

    public static int refactorio (int n){
        if (n < 1){
            return 1;
        } else {
            return refactorio(n-1) * n;
        }
    }

}
