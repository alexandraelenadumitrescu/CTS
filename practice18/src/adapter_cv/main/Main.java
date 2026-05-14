package adapter_cv.main;

import adapter_cv.implementare.*;

public class Main {
    public static void main(String[] args) {
//        O platformă de recrutare primește CV-uri în formate diferite de la mai mulți furnizori externi.
//Aplicația internă poate procesa doar candidați într-un format standard, cu metode pentru
//obținerea numelui, experienței și competențelor. Se cere integrarea unui CV extern într-un flux
//deja existent de evaluare, fără modificarea clasei externe și fără schimbarea codului care
//procesează candidații interni. Pentru implementare se va folosi interfața
//AbstractCandidatPlatforma.
//1.5p. Să se testeze soluția prin:
//• procesarea unui candidat intern;
//• procesarea unui candidat provenit dintr-un sistem extern;
//• folosirea aceluiași evaluator pentru ambele cazuri;
//•evidențierea clasei externe care este integrată în formatul platformei.
        String [] array={"hai","hai"};
        AbstractCandidatPlatforma candidatVechi=new CandidatPlatforma("nume",10,array);
        ICandidatExtern candidatNou=new CandidatExtern("nume",10,array);

        Platforma platforma=new Platforma();
        platforma.procesare(candidatVechi);
        AbstractCandidatPlatforma adapter=new Adapter(candidatNou);
        platforma.procesare(adapter);



    }
}
