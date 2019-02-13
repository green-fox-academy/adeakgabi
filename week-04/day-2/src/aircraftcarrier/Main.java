package aircraftcarrier;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        F16 f16 = new F16(320);
        F35 f35 = new F35();
        System.out.println(f16.refill(300));
        System.out.println(f16.getType());
        System.out.println(f16.getStatus());
        System.out.println(f16.isPriority);
        System.out.println(f35.isPriority);

        AircraftCarrier aircraftCarrier = new AircraftCarrier(10,10);
        aircraftCarrier.add(f16);
        aircraftCarrier.add(f35);

        System.out.println(aircraftCarrier.checkHowMuchAmmoTheAircraftsNeed());



    }
}
