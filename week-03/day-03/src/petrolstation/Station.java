package petrolstation;

public class Station {
    int gasAmount;

public static void refill (Car car, Station station){
   station.gasAmount -= car.capacity;
    System.out.println("Station capacity: " +station.gasAmount);
   car.capacity += car.capacity;
    System.out.println("Car capacity: " + car.capacity);



}

}

