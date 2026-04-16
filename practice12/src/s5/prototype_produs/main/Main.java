package s5.prototype_produs.main;

import s5.prototype_produs.implementare.Item;

public class Main {
    public static void main(String[] args) {
        try {
            Item item=new Item("nume","1000","label","tip");
            item.displayInfo();
            try {
                Item item2=item.clone();
                item2.displayInfo();
            } catch (CloneNotSupportedException e) {
                System.out.println(e.getMessage());

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
