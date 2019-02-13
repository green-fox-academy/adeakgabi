package aircraftcarrier;

public class F35 extends Aircraft {

    public F35(int maxAmmo, int baseDamage, boolean isPriority){
        super.maxAmmo = maxAmmo;
        super.baseDamage = baseDamage;
        super.isPriority = isPriority;
    }

    public F35(int ammo){
        super.ammo = ammo;
        super.maxAmmo = 12;
        super.baseDamage = 50;
        super.isPriority = true;
    }
}
