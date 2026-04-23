package adapter.aplicatie_farmacie;

import adapter.aplicatie_spital.MedicamentSpital;

public class AdapterMedicamentSpital extends  MedicamentFarmacie{

    MedicamentSpital medicamentSpital;

    public AdapterMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
       medicamentSpital.achizitioneazaMedicament();
    }
}
