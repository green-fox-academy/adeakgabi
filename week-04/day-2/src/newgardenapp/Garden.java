package newgardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree ("purple");
        Tree orangeTree = new Tree ("orange");

        plants.add(yellowFlower);
        plants.add(blueFlower);
        plants.add(purpleTree);
        plants.add(orangeTree);

        System.out.println(yellowFlower.getName());






    }








}
