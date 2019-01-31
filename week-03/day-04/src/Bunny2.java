import javax.sound.midi.Soundbank;

public class Bunny2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        int numberOfBunnies = 10;
        int thirdEar = numberOfBunnies/2;
        System.out.println((thirdEar + countTheEars(numberOfBunnies)));
    }

    public static int countTheEars (int n) {
        if (n == 0) {
            return 0;
        }
        int numberWithTwoEars = countTheEars(n - 1) +2;
           return numberWithTwoEars;
    }
}
