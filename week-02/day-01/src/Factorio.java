public class Factorio {
    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial

       int originalNumber = 5;
       int result = factorio(originalNumber);
        System.out.println(result);


    }
    public static int factorio (int anyNumber){
        int result = 1;
        for (int i = 1; i <= anyNumber; i++){
            result = result * i;
        }
        return result;
    }


}

