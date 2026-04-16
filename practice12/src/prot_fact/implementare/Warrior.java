package prot_fact.implementare;

public class Warrior implements IPrototype,Cloneable {
    private String tip;

     Warrior(String tip) {
        this.tip = tip;
        System.out.println("consumator");
    }

    @Override
    public IPrototype clone()  {
        try {
            return (Warrior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }    }

    Warrior() {

    }
}
