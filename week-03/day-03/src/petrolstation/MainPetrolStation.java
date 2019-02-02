package petrolstation;

import static petrolstation.Station.refill;

public class MainPetrolStation {
    public static void main(String[] args) {

        Car car1 = new Car();
        Station station1 = new Station();

        refill(car1, station1);

    }
}
