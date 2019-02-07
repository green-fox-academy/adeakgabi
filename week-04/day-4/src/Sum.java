import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> numbers;

    public Sum (){
        numbers = new ArrayList<>();
    }

    public int getSum (ArrayList<Integer> numbers){
       int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


}
