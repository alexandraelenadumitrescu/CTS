package clase_builder;

public class Magazin {
    private String denumire;
    private int suprafata;
    private int nrIntrari;

    private TipPodea tipPodea;
    private MaterialDecoratiuni materialDecoratiuni;

    public Magazin(String denumire, int suprafata, int nrIntrari, TipPodea tipPodea, MaterialDecoratiuni materialDecoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.tipPodea = tipPodea;
        this.materialDecoratiuni = materialDecoratiuni;
    }
}
