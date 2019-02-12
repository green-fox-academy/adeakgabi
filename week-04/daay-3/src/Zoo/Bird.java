package Zoo;

public class Bird extends Animal {
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
}
