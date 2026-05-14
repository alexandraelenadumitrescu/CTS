package adapter_cv.implementare;

public class Adapter implements IAdapter,AbstractCandidatPlatforma{
    private ICandidatExtern candidatExtern;

    @Override
    public String obtineNume() {
        return candidatExtern.obtineNumele();
    }

    @Override
    public int obtineAniExperienta() {
        return candidatExtern.obtineAniExperientaActuala();
    }

    @Override
    public String[] obtineCompetente() {
        return candidatExtern.obtineCompetentele();
    }


    @Override
    public void proceseaza(ICandidatExtern candidatExtern) {
        System.out.println("se aplica adaptorul");

    }

    public Adapter(ICandidatExtern candidatExtern) {
        this.candidatExtern = candidatExtern;
    }
}
