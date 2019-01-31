public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        System.out.println(countTheEars(10));
    }

    public static int countTheEars (int n){
        if ( n == 0){
            return 0;
        }
        return countTheEars(n-1) + 2;
    }
}
