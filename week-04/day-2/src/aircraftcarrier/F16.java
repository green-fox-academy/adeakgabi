package aircraftcarrier;

public class F16 extends Aircraft{

    public F16(int maxAmmo, int baseDamage){
        super.maxAmmo = maxAmmo;
        super.baseDamage = baseDamage;
    }

    public F16(int ammo){
        super.ammo = ammo;
        baseDamage = 30;
        maxAmmo = 80;
    }
}
