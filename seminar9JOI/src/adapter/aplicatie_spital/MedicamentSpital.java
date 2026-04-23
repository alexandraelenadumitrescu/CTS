package adapter.aplicatie_spital;

public class MedicamentSpital {
    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println(
                this.prezintaReteta()?
                "Medicament achizitionat":"Nu are reteta valida");
    }

     boolean prezintaReteta() {
        return true;
    }
}
