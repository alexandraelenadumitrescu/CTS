package adapter.main;

import adapter.aplicatie_farmacie.AdapterMedicamentSpital;
import adapter.aplicatie_farmacie.MedicamentFarmacie;
import adapter.aplicatie_spital.MedicamentSpital;

public class Main {

    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentSpital paracetamol=new MedicamentSpital();
        MedicamentFarmacie nurofen=new MedicamentFarmacie();


        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
        //realizeazaAchizitie(paracetamol);
        AdapterMedicamentSpital paracetamolAdapter=new AdapterMedicamentSpital(paracetamol);

        realizeazaAchizitie(paracetamolAdapter);
    }}
