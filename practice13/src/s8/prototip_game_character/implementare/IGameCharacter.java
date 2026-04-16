package s8.prototip_game_character.implementare;

public interface IGameCharacter {
    String getCharacterName();
    String getWeaponType(int index);
    int getPowerLevel();
    void setPowerLevel();
    void setCharacterName(String name);
    void addWeapon (String weaponType);
    void attackCharacter(IGameCharacter target);
}