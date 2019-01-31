public class Counter {

    public static void main(String[] args) {
        countdown(10);
    }

    public static int countdown (int n){
        if(n <= 0){
            return 0;
        }
        System.out.println(n);
        return countdown(n - 1);
    }
}
