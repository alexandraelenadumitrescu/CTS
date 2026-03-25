package clase_builder;

public class BuilderMagazin implements IBuilder{

    private String denumire;
    private int suprafata;
    private int nrIntrari;

    private TipPodea tipPodea;
    private MaterialDecoratiuni materialDecoratiuni;

    public BuilderMagazin() {
        this.denumire = "default";
        this.suprafata = 50;
        this.nrIntrari = 1;
        this.tipPodea = TipPodea.RIGIDA;
        this.materialDecoratiuni = MaterialDecoratiuni.HARTIE;
    }

    public void setDenumire(String denumire) {
        if(denumire.length()>2){
            this.denumire = denumire;
        }

    }

    public void setSuprafata(int suprafata) {
        if(suprafata>0){
            this.suprafata = suprafata;
        }

    }

    public void setNrIntrari(int nrIntrari) {
        if(suprafata/100<nrIntrari){
            throw new RuntimeException();
        }
        this.nrIntrari = nrIntrari;
    }

    public void setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
    }

    public void setMaterialDecoratiuni(MaterialDecoratiuni materialDecoratiuni) {
        this.materialDecoratiuni = materialDecoratiuni;
    }

    @Override
    public Magazin build() {
        return new Magazin(denumire,suprafata,nrIntrari,tipPodea,materialDecoratiuni);
    }
}
