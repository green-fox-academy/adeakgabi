package pirates;

public class PirateMain {
    public static void main(String[] args) {

        Pirate pirate1 = new Pirate();
        pirate1.drinkSomeRum();
        System.out.println(pirate1.toxicLevel);
        pirate1.howIsItGoingMate();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.howIsItGoingMate();
        pirate1.die();
        pirate1.drinkSomeRum();

    }
}
