package newgardenapp;

public class Tree extends Plant{

    public Tree (String color){
        super(color);
        super.name = "Tree";
    }

    @Override
    public void getWater(int water){
        currentWaterAmount += water * 0.4;
        if(currentWaterAmount > 10){
            needsWater = false;
        }
    }
}
