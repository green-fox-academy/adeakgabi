 public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        String wordWithX = "xooxooooox";
        System.out.println(changeXtoY(wordWithX));
    }

    public static String changeXtoY (String wordWithX){
        if( wordWithX.length() < 1){
            return wordWithX;
        }else {
            char check = wordWithX.charAt(0);
            if(check == 'x'){
                return "y" + changeXtoY(wordWithX.substring(1));
            } else {
                return check + changeXtoY(wordWithX.substring(1));
            }
        }
    }
}
