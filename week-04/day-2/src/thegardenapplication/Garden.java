package thegardenapplication;

import java.util.ArrayList;

public class Garden {
    ArrayList<Tree> trees = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();
    int waterAmount;

    public void watering(Plants plant){
        boolean needsWater = true;
        int waterAmountPerPlant = 0;
        ArrayList<Plants> plantsToWater = new ArrayList<>();
        for (int i = 0; i < trees.size(); i++) {
            if(trees.get(i).needsWater){
                plantsToWater.add(trees.get(i));
            }
            if(flowers.get(i).needsWater){
                plantsToWater.add(flowers.get(i));
            }
        }
        waterAmountPerPlant = waterAmount/plantsToWater.size();
        for (int i = 0; i < plantsToWater.size(); i++) {
            plantsToWater.get(i).waterLevel += waterAmountPerPlant;
        }
    }



}
