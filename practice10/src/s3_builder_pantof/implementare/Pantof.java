package s3_builder_pantof.implementare;

import java.util.List;

public class Pantof {
    private float marime;
    private int dimensiuneToc;
    private TipPantof tipPantof;
    private String materialBaza;

    private List<String> materialeSecundare;
    private List<String> mesaje;

    private Pantof(float marime, int dimensiuneToc, TipPantof tipPantof, String materialBaza, List<String> materialeSecundare, List<String> mesaje) {
        this.marime = marime;
        this.dimensiuneToc = dimensiuneToc;
        this.tipPantof = tipPantof;
        this.materialBaza = materialBaza;
        this.materialeSecundare = materialeSecundare;
        this.mesaje = mesaje;
    }


    public static PantofBuilder getBuilder(float marime, int dimensiuneToc, TipPantof tipPantof, String materialBaza){
        return new PantofBuilder(marime,dimensiuneToc,tipPantof,materialBaza);
    }

    public static class PantofBuilder implements IBuilder{
        private float marime;
        private int dimensiuneToc;
        private TipPantof tipPantof;
        private String materialBaza;

        private List<String> materialeSecundare;
        private List<String> mesaje;

        public PantofBuilder() {
        }

        public PantofBuilder(float marime, int dimensiuneToc, TipPantof tipPantof, String materialBaza) {
            this.marime = marime;
            this.dimensiuneToc = dimensiuneToc;
            this.tipPantof = tipPantof;
            this.materialBaza = materialBaza;
        }

        public PantofBuilder setMaterialeSecundare(List<String> materialeSecundare) {
            this.materialeSecundare = materialeSecundare;
            return this;
        }

        public PantofBuilder setMesaje(List<String> mesaje) {
            this.mesaje = mesaje;
            return this;
        }

        @Override
        public Pantof build() {
            if(marime<30){
                throw new ExceptieMarime("marime gresita");
            }
            Pantof nou=new Pantof(marime,dimensiuneToc,tipPantof,materialBaza,materialeSecundare,mesaje);
            this.materialeSecundare=null;
            this.mesaje=null;
            return nou;
        }
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "marime=" + marime +
                ", dimensiuneToc=" + dimensiuneToc +
                ", tipPantof=" + tipPantof +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialeSecundare=" + materialeSecundare +
                ", mesaje=" + mesaje +
                '}';
    }
}
