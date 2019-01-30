package counter;

public class Counter {
    int counter1;
    int counterCopy = counter1;

    public Counter(){
        this.counter1 = 0;
        counterCopy = counter1;     //beírni mindkét konstruktorba, h mindig igaz legyen
    }

    public Counter(int counter1){
        this.counter1 = counter1;
        counterCopy = counter1;     //ide is
    }

    public void add(int number){
        counter1 = counter1 + number;
    }

    public void add(){
        counter1 +=1;
    }

    public int get() {
        return counter1;
    }

    public void reset(){
        counter1 = counterCopy;
    }



}
