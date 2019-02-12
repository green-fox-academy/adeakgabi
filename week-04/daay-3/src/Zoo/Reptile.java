package Zoo;

public class Reptile extends Animal {
    String favoriteFood;
    Boolean isCute;

    public Reptile(String name){
        super(name);
        isCute = false;
    }

    public Reptile(String name, String gender, String favoriteFood) {
        super(name);
        super.gender = gender;
        super.favoriteFood = favoriteFood;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
