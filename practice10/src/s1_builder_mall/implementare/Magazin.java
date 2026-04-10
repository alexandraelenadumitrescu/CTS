package s1_builder_mall.implementare;

import java.util.List;

public class Magazin {
    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", tipPodea=" + tipPodea +
                ", decoratiuni=" + decoratiuni +
                '}';
    }

    private String denumire;
    private float suprafata;
    private int nrIntrari;
    //facult
    private TipPodea tipPodea;
    private List<String> decoratiuni;

    private Magazin(String denumire, float suprafata, int nrIntrari, TipPodea tipPodea, List<String> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.tipPodea = tipPodea;
        this.decoratiuni = decoratiuni;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public int getNrIntrari() {
        return nrIntrari;
    }

    public TipPodea getTipPodea() {
        return tipPodea;
    }

    public List<String> getDecoratiuni() {
        return decoratiuni;
    }

    public int getGradIncendiu(){
        return Integer.valueOf((int) (nrIntrari/suprafata + decoratiuni.size()));
    }

    public static MagazinBuilder getBuilder(String denumire, float suprafata, int nrIntrari){
        return new MagazinBuilder(denumire,suprafata,nrIntrari);
    }

    public static class MagazinBuilder implements IBuilder{
        private Magazin magazin;
        private String denumire;
        private float suprafata;
        private int nrIntrari;
        //facult
        private TipPodea tipPodea;
        private List<String> decoratiuni;


        public MagazinBuilder(String denumire, float suprafata, int nrIntrari) {
            this.denumire=denumire;
            this.suprafata=suprafata;
            this.nrIntrari=nrIntrari;
        }

        public MagazinBuilder setTipPodea(TipPodea tipPodea) {
            this.tipPodea = tipPodea;
            return this;
        }

        public MagazinBuilder setDecoratiuni(List<String> decoratiuni) {
            this.decoratiuni = decoratiuni;
            return this;
        }

        @Override
        public Magazin build() {
            if(suprafata/nrIntrari>100){
                throw new ExceptieIntrari("prea putine intrari pentru suprafata");
            }
            if(tipPodea==TipPodea.TIP1&&decoratiuni.contains("sticla")){
                throw new ExceptiePodea("podeaua nu are duritatea necesara pentru tipul de decoratiune");
            }
            Magazin nou=new Magazin(denumire,suprafata,nrIntrari,tipPodea,decoratiuni);
            nou.decoratiuni=null;
            nou.tipPodea=null;
            return nou;
        }
    }



}
