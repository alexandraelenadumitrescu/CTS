package cts.s06.builder.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private TipPantof tipPantof;
    private int nrPantof;
    private double dimensiuneToc;
    private String materialBaza;

    private String materialOptional;
    private List<String> mesaje;

    //V4 DE BUILDER - INNER CLASS + BUILDER CONTINE CAMPURI OBIECT
    public static PantofiBuilder getBuilder(TipPantof tipPantof, int nrPantof, double dimensiuneToc, String materialBaza){//OBLIGATORIU PUBLICA SI STATICA
        return new PantofiBuilder(tipPantof, nrPantof, dimensiuneToc, materialBaza);
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialOptional='" + materialOptional + '\'' +
                ", mesaje=" + (mesaje != null ? mesaje : "[]") +
                '}';
    }

    private Pantof(TipPantof tipPantof, int nrPantof, double dimensiuneToc, String materialBaza, String materialOptional, List<String> mesaje) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialOptional = materialOptional;
        this.mesaje = mesaje;
    }


    public static class PantofiBuilder implements IBuilder{
        private TipPantof tipPantof;
        private int nrPantof;
        private double dimensiuneToc;
        private String materialBaza;

        private String materialOptional;
        private List<String> mesaje;

        //CTR VA CONTINE DOAR ZONA OBLIGATORIE- VA PRIMI
        private PantofiBuilder(TipPantof tipPantof, int nrPantof, double dimensiuneToc, String materialBaza) {
            this.tipPantof = tipPantof;
            this.nrPantof = nrPantof;
            this.dimensiuneToc = dimensiuneToc;
            this.materialBaza = materialBaza;

        }
        //URMEAZA SETTERI PENTRU ZONA OPTIONALA

        //setter in format Builder - din template cu generate
        public PantofiBuilder setMaterialOptional(String materialOptional) {
            this.materialOptional = materialOptional;
            return this;
        }

        public PantofiBuilder addMesaj(String mesaj){
            if(this.mesaje == null){
                this.mesaje = new ArrayList<>();
            }
            if(mesaj != null) {
                this.mesaje.add(mesaj);
            }
            return this;

        }

        @Override
        public Pantof build() {
            //aici se pot introduce toate restrictiile si validarile
            if(nrPantof<35||nrPantof>45){
                throw new RuntimeException("dimensiune numar pantof gresit");
            }
            if(dimensiuneToc<0.5||dimensiuneToc>12.5){
                throw new RuntimeException("dimensiune toc gresita");
            }
            int contor=0;
            if(this.mesaje!=null){
                for(String m: mesaje){
                    contor+=m.length();
                }
                if(contor>nrPantof){
                    throw new RuntimeException("prea multe mesaje");
                }
            }



            return new Pantof(this.tipPantof,this.nrPantof,this.dimensiuneToc, this.materialBaza,this.materialOptional,this.mesaje);

        }
    }
}
