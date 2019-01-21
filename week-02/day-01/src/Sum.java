public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

     int anyNumber = 31;
     int result = sum (anyNumber);
        System.out.println(result);


    }
    public static int sum (int anotherNumber){
        int result = 0;
        for (int i = 0; i < anotherNumber; i++){
            result += i;
        }
        return result;
    }
}
