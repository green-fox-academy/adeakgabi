package aircraftcarrier;

public class F16 extends Aircraft{

    public F16(int maxAmmo, int baseDamage, boolean isPriority){
        super.maxAmmo = maxAmmo;
        super.baseDamage = baseDamage;
        super.isPriority = isPriority;
    }

    public F16(int ammo){
        super.ammo = ammo;
        baseDamage = 30;
        maxAmmo = 8;
        isPriority = false;
    }
}
