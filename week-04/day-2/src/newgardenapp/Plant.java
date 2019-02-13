package newgardenapp;

import java.util.ArrayList;
import java.util.List;

public class Plant {
    String color;
    String name;
    double currentWaterAmount;
    boolean needsWater = true;

    List<Plant> plants = new ArrayList<>();

    public Plant(String color){
        this.color = color;
    }

    public void add(Plant plant){
        plants.add(plant);
    }

    public void getWater(int water){
    }

    public void watering(int waterAmount){
        int plantsToBeWatered = 0;
        int waterPerPlant;
        for (Plant plant : plants) {
            if(plant.needsWater){
                plantsToBeWatered += 1;
            }
        }
        waterPerPlant = waterAmount/plantsToBeWatered;
        for (Plant plant : plants) {
            plant.getWater(waterPerPlant);
        }
    }

    public void printPlants(){
        for (Plant plant : plants) {
            if(plant.needsWater){
                System.out.println("The " + plant.color + " " + plant.name +  " needs water!");
            } else {
                System.out.println("The " + plant.color + " " + plant.name + " doesn't need water!");
            }
        }
    }
}
