package aircraftcarrier;

public class Aircraft {
    int ammo;
    int baseDamage;
    int maxAmmo;

    public Aircraft(){
        this.ammo = 0;
    }

    public Aircraft(int ammo, int baseDamage, int maxAmmo){
        this.ammo = ammo;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
    }

    public int fight(){
        int allDamage = this.ammo * this.baseDamage;
        this.ammo = 0;
        System.out.println("All damage is: " + allDamage);
        return allDamage;
    }

    public int refill(int numberOfAmmo){          //this function is still not working!!
        int currentNumberOfRefill = this.ammo;
        int remainingAmo = numberOfAmmo;
        if(this.ammo < numberOfAmmo){
            for (int i = 0; i < numberOfAmmo ; i++) {
                if(this.ammo < numberOfAmmo && this.ammo < this.maxAmmo){
                    currentNumberOfRefill += 1;
                    remainingAmo -= 1;
                }
            }
        }
        this.ammo = currentNumberOfRefill;
        return remainingAmo;
    }



}
