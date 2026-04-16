package s8.game_weapon_builder.implementare;

public interface InterfaceGameWeapon {
    String getWeaponName();
    String getWeaponType();
    int getBaseDamage();
    String getElementType();
    int getRange();
    String getSpecialEffect();
    String getSkin();
    int getDurabilityBonus();
    void displayWeaponInfo();
}