package newgardenapp;

public class Flower extends Plant {

    public Flower (String color){
        super(color);
        super.name = "Flower";
    }

    @Override
    public void getWater(int water){
        currentWaterAmount += water * 0.75;
        if(currentWaterAmount > 5){
            needsWater = false;
        }
    }
}
