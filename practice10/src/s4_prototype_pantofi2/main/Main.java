package s4_prototype_pantofi2.main;


import s4_prototype_pantofi2.implementare.Pantof;
import s4_prototype_pantofi2.implementare.TipStilPantof;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mesaje=new ArrayList<>();
        mesaje.add("hai");
        mesaje.add("hai");
        mesaje.add("hai");
        Pantof pantof1=new Pantof(TipStilPantof.POP,100,mesaje);
        Pantof pantof2=pantof1.copiaza();
        pantof2.addMesaj("haihai2232");
        System.out.println(pantof1);
        System.out.println(pantof2);
    }
}
