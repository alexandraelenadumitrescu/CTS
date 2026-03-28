package spitalA1.implementare;

public class Pacient {
    private boolean esteRabatabilPatul;
    private boolean esteMicDejunulInclus;
    private boolean arePapuci;
    private boolean areHalat;


   private Pacient(boolean esteRabatabilPatul, boolean esteMicDejunulInclus, boolean arePapuci, boolean areHalat) {
        this.esteRabatabilPatul = esteRabatabilPatul;
        this.esteMicDejunulInclus = esteMicDejunulInclus;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }



    public static class PacientBuilder implements IBuilder{
        private boolean esteRabatabilPatul;
        private boolean esteMicDejunulInclus;
        private boolean arePapuci;
        private boolean areHalat;

        public PacientBuilder(boolean esteRabatabilPatul, boolean esteMicDejunulInclus, boolean arePapuci, boolean areHalat) {
            this.esteRabatabilPatul = esteRabatabilPatul;
            this.esteMicDejunulInclus = esteMicDejunulInclus;
            this.arePapuci = arePapuci;
            this.areHalat = areHalat;
        }

        @Override
        public Pacient build() {
            return new Pacient(this.esteRabatabilPatul,this.esteMicDejunulInclus,this.arePapuci,this.areHalat);
        }
    }

    public static PacientBuilder getBuilder(boolean esteRabatabilPatul, boolean esteMicDejunulInclus, boolean arePapuci, boolean areHalat){
       return new PacientBuilder(esteRabatabilPatul,esteMicDejunulInclus,arePapuci,areHalat);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "esteRabatabilPatul=" + esteRabatabilPatul +
                ", esteMicDejunulInclus=" + esteMicDejunulInclus +
                ", arePapuci=" + arePapuci +
                ", areHalat=" + areHalat +
                '}';
    }
}
