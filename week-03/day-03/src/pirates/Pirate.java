package pirates;

public class Pirate {
    int toxicLevel;
    boolean isAlive;


    public Pirate (){
        this.toxicLevel = 0;
        this.isAlive = true;
    }

    public void drinkSomeRum (){
        if(isAlive) {
            toxicLevel += 1;
        } else {
            System.out.println("He is dead");
        }
    }

    public void howIsItGoingMate (){
        if (isAlive) {
            if (toxicLevel < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        } else {
            System.out.println("He is dead");
        }
    }

    public void die(){
        isAlive = false;
    }
}
