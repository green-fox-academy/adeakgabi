package newgardenapp;

public class Tree extends Plant{

    public Tree (String color){
        super(color);
        super.name = "Tree";
        super.needsWater = true;
        super.currentWaterAmount = 0;
    }

    public Tree(int currentWaterAmount, int waterAbsorb, boolean needsWater){
        super(currentWaterAmount, waterAbsorb, needsWater);
    }

    public boolean checkingIfThirsty(){
        if(currentWaterAmount > 10){
            needsWater = false;
        }
        return needsWater;
    }

}
