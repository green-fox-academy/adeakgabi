package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        F16 f16 = new F16(5);
        F35 f35 = new F35(5);
        System.out.println(f16.refill(300));
        System.out.println(f16.getType());
        System.out.println(f16.getStatus());
        System.out.println(f16.isPriority);
        System.out.println(f35.isPriority);

        AircraftCarrier aircraftStore = new AircraftCarrier(new ArrayList<Aircraft>());
        aircraftStore.add(f16);
        aircraftStore.add(f35);
        System.out.println(aircraftStore.toString());
        System.out.println(aircraftStore.checkHowMuchAmmoTheAircraftsNeed());


        AircraftCarrier aircraftCarrier = new AircraftCarrier(10,10);
        aircraftStore.fill();
        System.out.println(aircraftCarrier.storeOfAmmo);
        System.out.println(f16.ammo);
        System.out.println(f35.ammo);
        System.out.println(aircraftCarrier.storeOfAmmo);


    }
}
