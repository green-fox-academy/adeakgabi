package thegardenapplication;

import java.util.ArrayList;

public class Garden {
    ArrayList<Plants> plants;

    public Garden(){
        plants = new ArrayList<>();
    }

    public void add(Plants plant){
        plants.add(plant);
    }


}
