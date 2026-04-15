package s1_builder_mall.main;

import s1_builder_mall.implementare.Magazin;
import s1_builder_mall.implementare.TipPodea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Magazin mag1=Magazin.getBuilder("magazin 1",100,3).build();
        //
        // Magazin mag2=new Magazin();
        try{
            Magazin mag2=Magazin.getBuilder("magazin 2",220,1).build();
        } catch (RuntimeException e) {
            System.out.printf(e.getMessage());
        }
        List<String> decoratiuni=new ArrayList<>();
        decoratiuni.add("sticla");
        try{
            Magazin mag3=Magazin.getBuilder("magazin 3",100,3).setDecoratiuni(decoratiuni).setTipPodea(TipPodea.TIP1).build();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println(mag1.toString());
    }
}