package Zoo;

public class Mammal extends Animal {
    int age;
    int numberOfLegs;
    int expectedLifeLength;

    public Mammal(String name){
        super(name);
    }

    public Mammal(String name, String gender, String favoriteFood) {
        super(name);
        super.gender = gender;
        super.favoriteFood = favoriteFood;
    }

    @Override
    public String breed(){
        return " pushing miniature versions out.";
    }
}
