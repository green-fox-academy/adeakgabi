package thegardenapplication;

public class Plants {
    int waterLevel;
    int amountOfWater;
    String name;
    String color;


    public Plants(String name, String color, int waterLevel, int amountOfWater){
        this.waterLevel = waterLevel;
        this.amountOfWater = amountOfWater;
        this.name = name;
        this.color = color;
    }

    public void printPlants(){
        if(waterLevel<amountOfWater){
            System.out.println("The " + color + " " + name + " needs water");
        } else {
            System.out.println("The " + color + " " + name + " doesn't need water");
        }
    }



}
