package s8.prototip_game_character.main;

import s8.prototip_game_character.implementare.GameCharacter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<String> arme=new ArrayList<>();
        arme.add("hai");
        GameCharacter init=new GameCharacter("hai",100,100,100,arme,arme,"haide");
        try {
            GameCharacter nou=init.clone();
            nou.attackCharacter(init);
            System.out.println(nou.toString());
            System.out.println(init.toString());

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}