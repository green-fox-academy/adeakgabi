package newgardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {
        Plant plants = new Plant("");
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree ("purple");
        Tree orangeTree = new Tree ("orange");

        plants.add(yellowFlower);
        plants.add(blueFlower);
        plants.add(purpleTree);
        plants.add(orangeTree);

        plants.printPlants();

        System.out.println("Watering with 40");
        plants.watering(40);
        plants.printPlants();

        System.out.println("Watering with 70");
        plants.watering(70);
        plants.printPlants();







    }








}
