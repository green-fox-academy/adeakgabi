package flyable;

public class Helicopter extends Vehicle implements Flyable {

    public void takeOff(){
        System.out.println("The helicopter is taking off, hold your hat!");
    }

    public void fly(){
        System.out.println("The helicopter is flying, uhh that's noisy...");
    }

    public void land(){
        System.out.println("Watch out people the helicopter is going to land!");
    }


}
