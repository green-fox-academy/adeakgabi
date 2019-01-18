public class DrawChessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        int a = 15;
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a; k++) {
                if (i % 2 == 0 && k % 2 != 0) {
                    System.out.print("%");
                } else if (i % 2 != 0 && k % 2 == 0){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
