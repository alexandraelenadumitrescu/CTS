package s8.game_weapon_builder.implementare;

public class GameWeapon implements InterfaceGameWeapon{
    private String weaponName;
    private String weaponType;
    private int baseDamage;

    private String elementType;
    private int range;
    private String specialEffect;
    private String skin;
    private int durabilityBonus;

    private GameWeapon(String weaponName, String weaponType, int baseDamage, String elementType, int range, String specialEffect, String skin, int durabilityBonus) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.baseDamage = baseDamage;
        this.elementType = elementType;
        this.range = range;
        this.specialEffect = specialEffect;
        this.skin = skin;
        this.durabilityBonus = durabilityBonus;
    }

    @Override
    public String getWeaponName() {
        return "";
    }

    @Override
    public String getWeaponType() {
        return "";
    }

    @Override
    public int getBaseDamage() {
        return 0;
    }

    @Override
    public String getElementType() {
        return "";
    }

    @Override
    public int getRange() {
        return 0;
    }

    @Override
    public String getSpecialEffect() {
        return "";
    }

    @Override
    public String getSkin() {
        return "";
    }

    @Override
    public int getDurabilityBonus() {
        return 0;
    }

    @Override
    public void displayWeaponInfo() {

    }

    //STATIC GETbUILDER

    public static GameWeaponBuilder getBuilder(String weaponName, String weaponType, int baseDamage){
        return new GameWeaponBuilder(weaponName,weaponType,baseDamage);
    }


    public static class GameWeaponBuilder implements IBuilder{
        private String weaponName;
        private String weaponType;
        private int baseDamage;

        private String elementType;
        private int range;
        private String specialEffect;
        private String skin;
        private int durabilityBonus;

        private GameWeaponBuilder(String weaponName, String weaponType, int baseDamage) {
            this.weaponName = weaponName;
            this.weaponType = weaponType;
            this.baseDamage = baseDamage;
        }

        public GameWeaponBuilder setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }

        public GameWeaponBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public GameWeaponBuilder setSpecialEffect(String specialEffect) {
            this.specialEffect = specialEffect;
            return this;
        }

        public GameWeaponBuilder setSkin(String skin) {
            this.skin = skin;
            return this;
        }

        public GameWeaponBuilder setDurabilityBonus(int durabilityBonus) {
            this.durabilityBonus = durabilityBonus;
            return this;
        }

        @Override
        public GameWeapon build() {
            return new GameWeapon(weaponName,weaponType,baseDamage,elementType,range,specialEffect,skin,durabilityBonus);
        }
    }
}
