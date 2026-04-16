package prot_fact.implementare;

public class Mage implements IPrototype,Cloneable {
    private String tip;

     Mage(String tip) {
        this.tip = tip;
        System.out.println("consumtoa");

    }

    @Override
    public IPrototype clone(){
        try {
            return (Mage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
     }

    Mage() {
    }
}
