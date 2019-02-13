package newgardenapp;

public class Flower extends Plant {

    public Flower (String color){
        super(color);
        super.name = "Flower";
        super.needsWater = true;
        super.currentWaterAmount = 0;
    }

    public Flower(int currentWaterAmount, int waterAbsorb, boolean needsWater){
        super(currentWaterAmount, waterAbsorb, needsWater);
    }

    public boolean checkingIfThirsty(){
        if(currentWaterAmount > 5){
            needsWater = false;
        }
        return needsWater;
    }

    public int watering(){
    }



}
