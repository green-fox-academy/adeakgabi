package aircraftcarrier;

public class Aircraft {
    int ammo;
    int baseDamage;
    int maxAmmo;
    int allDamage;
    boolean isPriority;

    public Aircraft(){
        this.ammo = 0;
    }

    public Aircraft(int ammo, int baseDamage, int maxAmmo, int allDamage, boolean isPriority){
        this.ammo = ammo;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.allDamage = allDamage;
        this.isPriority = isPriority;
    }

    public int fight(){
        int allDamage = this.ammo * this.baseDamage;
        this.ammo = 0;
        System.out.println("All damage is: " + allDamage);
        this.allDamage = allDamage;
        return allDamage;
    }

    public int refill(int numberOfAmmo){          //this function is still not working!!
        int remainingAmmo = numberOfAmmo;
            for (int i = 0; i < numberOfAmmo ; i++) {
                if(this.ammo < numberOfAmmo && this.ammo < this.maxAmmo){
                    this.ammo += 1;
                    remainingAmmo -= 1;
                }
            }
        return remainingAmmo;
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }

    public String getStatus(){
        String status = "Type: " + getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + allDamage;
       return status;
    }

    public Boolean isPriority(){
        return this.isPriority;
    }



}
