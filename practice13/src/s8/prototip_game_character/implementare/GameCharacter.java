package s8.prototip_game_character.implementare;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter implements IGameCharacter,Cloneable

{
    private String clasaJoc;
    private int puncteViata;
    private int nivelDeAtac;
    private int nivelDeAparare;
    private List<String> echipamentInitial;
    private List<String> setDeArmeSpeciale;
    private String characterName;

    public GameCharacter(String clasaJoc, int puncteViata, int nivelDeAtac, int nivelDeAparare, List<String> echipamentInitial, List<String> setDeArmeSpeciale, String characterName) {
        this.clasaJoc = clasaJoc;
        this.puncteViata = puncteViata;
        this.nivelDeAtac = nivelDeAtac;
        this.nivelDeAparare = nivelDeAparare;
        this.echipamentInitial = new ArrayList<>();
        this.setDeArmeSpeciale = new ArrayList<>();
        this.characterName = characterName;
        System.out.println("apel ctr consumator de timp");
    }

    @Override
    public GameCharacter clone() throws CloneNotSupportedException {
        GameCharacter nou= (GameCharacter) super.clone();
        nou.setDeArmeSpeciale=new ArrayList<>(this.setDeArmeSpeciale);
        nou.echipamentInitial=new ArrayList<>(this.echipamentInitial);
        return nou;
    }

    @Override
    public String getCharacterName() {
        return this.characterName;
    }

    @Override
    public String getWeaponType(int index) {
        return this.setDeArmeSpeciale.get(index);
    }

    @Override
    public int getPowerLevel() {
        return this.nivelDeAtac+this.nivelDeAparare;
    }

    @Override
    public void setPowerLevel() {
        this.nivelDeAparare++;
    }

    @Override
    public void setCharacterName(String name) {
        this.characterName=name;
    }

    @Override
    public void addWeapon(String weaponType) {
        this.setDeArmeSpeciale.add(weaponType);
    }


    public int getPuncteViata() {
        return puncteViata;
    }

    public GameCharacter setPuncteViata(int puncteViata) {
        this.puncteViata = puncteViata;
        return this;
    }

    @Override
    public void attackCharacter(IGameCharacter target) {
        GameCharacter tinta= (GameCharacter) target;
        tinta.setPuncteViata(tinta.getPuncteViata()-this.nivelDeAtac);
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "clasaJoc='" + clasaJoc + '\'' +
                ", puncteViata=" + puncteViata +
                ", nivelDeAtac=" + nivelDeAtac +
                ", nivelDeAparare=" + nivelDeAparare +
                ", echipamentInitial=" + echipamentInitial +
                ", setDeArmeSpeciale=" + setDeArmeSpeciale +
                ", characterName='" + characterName + '\'' +
                '}';
    }
}
