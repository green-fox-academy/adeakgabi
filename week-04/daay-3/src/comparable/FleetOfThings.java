package comparable;

import java.util.Collections;

public class FleetOfThings {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstackes = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eat = new Thing("Eat lunch");

        standUp.complete();
        eat.complete();

        fleet.add(milk);
        fleet.add(obstackes);
        fleet.add(standUp);
        fleet.add(eat);

        Collections.sort(fleet.things);
        System.out.println(fleet);
    }

}
