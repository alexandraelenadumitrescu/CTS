package composite_transport.main;

import composite_transport.implementare.AbstractElementTransport;
import composite_transport.implementare.Nod;
import composite_transport.implementare.StatieSimpla;

public class Main {
    public static void main(String[] args) {
//        În aplicație, stațiile și grupurile de stații trebuie
//        reprezentate uniform. O stație simplă are un
//număr zilnic de pasageri, iar un nod de transport poate conține
// stații simple, peroane sau alte
//noduri. Se dorește calcularea recursivă a numărului total de pasageri
// și validarea faptului că un
//nod nu depășește capacitatea maximă admisă. Pentru implementare se va
// folosi interfața
//AbstractElementTransport.
//1.5p. Să se testeze soluția prin:
//• crearea unor stații simple;
//• agregarea lor în noduri de transport;
//• calcularea numărului total de pasageri;
//• verificarea capacității pentru un nod complex.
        StatieSimpla statie1=new StatieSimpla(20);
        Nod statie2=new Nod(200);
        statie2.add(statie1);
        System.out.println(statie1.calculeazaNumarPasageri());
        System.out.println(statie1.verificaCapacitate(10));
        System.out.println(statie2.calculeazaNumarPasageri());
        System.out.println(statie2.verificaCapacitate(100));
    }
}
