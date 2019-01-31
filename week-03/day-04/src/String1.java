 public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        String wordWithX = "xooxooooox";
        int n = wordWithX.length();
        char from = 'x';
        char to = 'y';
        System.out.println(changeXtoY(wordWithX,from,to));
    }

    public static String changeXtoY (String wordWithX, char from, char to){
        if( wordWithX.length() < 1){
            return wordWithX;
        }else {
            char first = from == wordWithX.charAt(0) ? to : wordWithX.charAt(0);
            return first + changeXtoY(wordWithX.substring(1), from, to);
        }

    }
}
