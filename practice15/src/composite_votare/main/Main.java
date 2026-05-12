package composite_votare.main;

import composite_votare.implementare.ANod;
import composite_votare.implementare.NodFrunza;
import composite_votare.implementare.NodParinte;

public class Main {
    public static void main(String[] args) {
//        Cerința:
//        Realizați o aplicație care are rolul de a agrega rezultatele
//        în urma procesului de votare în cadrul unui referendum. Voturile sunt
//        înregistrate la nivel de secții de votare, iar secțiile de votare sunt
//        încadrate în județele de care aparțin. La nivel de fiecare entitate trebuie
//        să se specifice dacă referendumul a fost aprobat sau nu prin majoritate.
//
//        Must-uri Composite:
//
//        ANod abstract cu metodele de bază (getDenumire, valoarea agregată) + adaugaNod,
//        eliminaNod, getNod care aruncă UnsupportedOperationException by default
//        Frunza (SecțieVotare) — NU suprascrie adaugaNod/eliminaNod/getNod, moștenește excepția
//        Composite (Județ) — suprascrie adaugaNod/eliminaNod/getNod + are List<ANod> copii
//        Metoda de agregare (ex: esteAprobat()) în Composite iterează recursiv peste copii
//        În Main — construiești arborele: județe conțin secții, poți pune județ în județ
//        Programezi pe ANod, nu pe clase concrete

        NodParinte Judet=new NodParinte();
        Judet.addChild(new NodFrunza(100,20));
        Judet.addChild(new NodFrunza(100,20));
        Judet.addChild(new NodFrunza(150,200));
        Judet.addChild(new NodFrunza(100,20));

        System.out.println(Judet.esteAprobat());
        Judet.addChild(new NodFrunza(100,200));
        Judet.addChild(new NodFrunza(100,200));
        Judet.addChild(new NodFrunza(100,200));
        Judet.addChild(new NodFrunza(100,200));
        Judet.addChild(new NodFrunza(100,200));
        System.out.println(Judet.esteAprobat());

        ANod frunza=new NodFrunza(9,20);
        Judet.addChild(frunza);
        System.out.println(Judet.getChild(2));
        Judet.remove(frunza);


    }
}
