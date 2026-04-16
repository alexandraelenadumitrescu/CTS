package s8.game_weapon_builder.main;

import s8.game_weapon_builder.implementare.GameWeapon;

public class Main {
    public static void main(String[] args) {
        GameWeapon gameWeapon= GameWeapon.getBuilder("hai","hai",100).build();
    }
}
