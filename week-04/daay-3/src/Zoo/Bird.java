package Zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
    Boolean ableToFly;

    public Bird(String name){
        super(name);
        ableToFly = true;
    }

    public Bird(String name, String gender, String favoriteFood) {
        super(name);
        super.gender = gender;
        super.favoriteFood = favoriteFood;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    public void fly(){
        System.out.println("Yaaay I'm flying!");
    }

    public void land(){
        System.out.println("Heey dude, I'm landing here!");
    }

    public void takeOff(){
        System.out.println("I'm gonna find you and poop on your head");
    }
}
