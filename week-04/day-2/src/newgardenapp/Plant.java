package newgardenapp;

import java.util.ArrayList;
import java.util.List;

public class Plant {
    String color;
    String name;
    int currentWaterAmount;
    int waterAbsorb;
    boolean needsWater;

    List<Plant> plants = new ArrayList<>();
    Plant plant = new Plant("");

    public Plant(String color){
        this.color = color;
    }

    public Plant(int currentWaterAmount, int waterAbsorb, boolean needsWater) {
        this.currentWaterAmount = currentWaterAmount;
        this.waterAbsorb = waterAbsorb;
        this.needsWater = needsWater;
    }

    public void add(Plant plant){
        plants.add(plant);
    }

    public String getName(){
        String plantName;
        plantName = ("The " + this.color + " " + this.name);
        return plantName;
    }

    public boolean checkingIfThirsty(){
        return needsWater;
    }

    public int watering(int waterAmount){
        int waterPerPlant = waterAmount/plants.size();
        for (Plant plant : plants) {
            if(plant.checkingIfThirsty()){
                this.currentWaterAmount += waterPerPlant;
            }
        }
        return currentWaterAmount;
    }


}
