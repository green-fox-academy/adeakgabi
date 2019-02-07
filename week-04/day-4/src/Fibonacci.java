public class Fibonacci {

    public int getFibonacci(int n){
        if(n<0){
            throw new IllegalArgumentException();
        }
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
