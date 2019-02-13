package aircraftcarrier;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
    List<Aircraft> aircraftStore;
    int storeOfAmmo;
    int healthPoint;

    public AircraftCarrier(int storeOfAmmo, int healthPoint){
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
    }

    public AircraftCarrier(List<Aircraft> aircraftStore){
        this.aircraftStore = aircraftStore;
    }

    public List<Aircraft> add(Aircraft aircraft){    //not working
        aircraftStore.add(aircraft);
        return aircraftStore;
    }

    public int checkHowMuchAmmoTheAircraftsNeed(){
        int neededAmmo = 0;
        for (Aircraft aircraft1 : aircraftStore) {
            neededAmmo += (aircraft1.maxAmmo - aircraft1.ammo);
        }
        return neededAmmo;
    }

    public void fill(){               //not working
        AircraftCarrier aircraftCarrier = new AircraftCarrier(new ArrayList<Aircraft>());
        int remainingAmmo = 0;
        try{
            if(aircraftCarrier.checkHowMuchAmmoTheAircraftsNeed() < aircraftCarrier.storeOfAmmo){
                for (int i = 0; i < aircraftStore.size(); i++) {
                    if (aircraftStore.get(i).isPriority){
                        remainingAmmo = aircraftStore.get(i).refill(storeOfAmmo);
                        remainingAmmo = storeOfAmmo;
                    }
                }
            } else {
                for (int i = 0; i < aircraftStore.size(); i++) {
                    remainingAmmo = aircraftStore.get(i).refill(storeOfAmmo);
                    remainingAmmo = storeOfAmmo;
                }
            }
        } catch (Exception e){
            System.out.println("Your strorage is empty, can't refill aircrafts!");
        }
    }






    @Override
    public String toString() {
        String output = "";
        for (Aircraft aircraft : aircraftStore) {
            output += aircraft.getType() + "\t";
        }
        return output;
    }

}
