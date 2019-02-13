package aircraftcarrier;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.List;

public class AircraftCarrier {
    List<Aircraft> aircraftStore;
    int storeOfAmmo;
    int healthPoint;

    public AircraftCarrier(int storeOfAmmo, int healthPoint){
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
    }

    public void add(Aircraft aircraft){    //not working
        aircraftStore.add(aircraft);
    }

    public int checkHowMuchAmmoTheAircraftsNeed(){
        int neededAmmo = 0;
        for (Aircraft aircraft1 : aircraftStore) {
            neededAmmo += (aircraft1.maxAmmo - aircraft1.ammo);
        }
        return neededAmmo;
    }

  /*  public void fill(){
        try{
            if(storeOfAmmo > 0){

            }


        }catch (Exception e){
            System.out.println("Your strorage is empty, can't refill aircrafts!");
        }
    } */


}
