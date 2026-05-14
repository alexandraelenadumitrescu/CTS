package chain_candidati.main;

import chain_candidati.implementare.*;

public class Main {
    public static void main(String[] args) {
//         În procesul de recrutare, aplicația trebuie să filtreze succesiv candidații după mai
//         multe criterii:
//experiență minimă, existența unor competențe obligatorii, disponibilitate pentru interviu și
//compatibilitate salarială. Fiecare filtru decide dacă un candidat este respins sau transmis către
//următorul filtru. Ordinea filtrelor trebuie să poată fi schimbată ușor. Pentru implementare se va
//folosi interfața AbstractFiltruCandidat.
//1.5p. Să se testeze soluția prin:
//• definirea a cel puțin 3 filtre succesive;
//• testarea unor candidați acceptați și respinși;
//• schimbarea ordinii filtrelor;
//• afișarea filtrului la care candidatul este respins
        Candidat candidat1=new Candidat(5,true,true,true);
        Candidat candidat2=new Candidat(11,false,true,true);
        Candidat candidat3=new Candidat(15,true,false,true);
        Candidat candidat4=new Candidat(25,true,true,false);

        AbstractFiltruCandidat filtruSalariu=new FiltruSalariu();
        AbstractFiltruCandidat filtruDisp=new FiltruDisponibilitate();
        AbstractFiltruCandidat filtruExp=new FiltruExperienta();
        AbstractFiltruCandidat filtruComp=new FiltruCompetente();

        filtruSalariu.seteazaUrmator(filtruDisp);
        filtruDisp.seteazaUrmator(filtruExp);
        filtruExp.seteazaUrmator(filtruComp);

        filtruSalariu.proceseaza(candidat1);
        filtruSalariu.proceseaza(candidat2);
        filtruSalariu.proceseaza(candidat3);
        filtruSalariu.proceseaza(candidat4);
    }
}
