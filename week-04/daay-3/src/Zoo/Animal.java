package Zoo;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String favoriteFood;
    int numberOfLegs;

    public Animal(String name){
        this.name = name;
    }

    public Animal(int age, int numberOfLegs){
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName(){
        return this.name;
    }

    public abstract String breed();

    public void play(){
        System.out.println("Your " + this.name +" is happy now!");
    }

}
