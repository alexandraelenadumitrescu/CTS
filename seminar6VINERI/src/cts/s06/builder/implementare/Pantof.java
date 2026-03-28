package cts.s06.builder.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private int marime;
    private TipPantof tip;
    private double marimeToc;
    private String materialBaza;
    private String materialSeucundar;
    private List<String > mesaje;

    private Pantof(int marime, TipPantof tip, double marimeToc, String materialBaza, String materialSeucundar, List<String> mesaje) {
        this.marime = marime;
        this.tip = tip;
        this.marimeToc = marimeToc;
        this.materialBaza = materialBaza;
        this.materialSeucundar = materialSeucundar;
        this.mesaje = mesaje;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "marime=" + marime +
                ", tip=" + tip +
                ", marimeToc=" + marimeToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialSeucundar='" + materialSeucundar + '\'' +
                ", mesaje=" + mesaje +
                '}';
    }

    public static PantofiBuilder getBuilder(int marime, TipPantof tip, double marimeToc, String materialBaza){
        //acest ctr primeste zona obligatorie
        return new PantofiBuilder(marime, tip,  marimeToc,  materialBaza);
    }

    public static class PantofiBuilder implements  IBuilder{

        //v4 inner class late init

        private int marime;
        private TipPantof tip;
        private double marimeToc;
        private String materialBaza;

        //zona oblig o impl prin ctr
        private String materialSecundar;
        private List<String > mesaje;
        //zona facult prin setteri




        public PantofiBuilder(int marime, TipPantof tip, double marimeToc, String materialBaza) {
            this.marime = marime;
            this.tip = tip;
            this.marimeToc = marimeToc;
            this.materialBaza = materialBaza;
        }

        public PantofiBuilder setMaterialSeucundar(String materialSeucundar) {
            this.materialSecundar = materialSeucundar;
            return this;
        }

        public PantofiBuilder addMesaj(String mesaj) {
            if(this.mesaje==null){
                this.mesaje=new ArrayList<>();
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            //return new Pantof(this.marime,this.tip,this.marimeToc,this.materialBaza,this.materialSecundar,this.mesaje);
            //de resetat macar zona optionala



            if(marime<35|| marime>47){
                throw new RuntimeException("marime gresita");
            }

            int count=0;
            if(mesaje!=null){
                for(String m: mesaje){
                    count+=m.length();
                }
                if(count>marime){
                    throw new RuntimeException("prea multe mesaje");
                }
            }

            Pantof rezultat=new Pantof(this.marime,this.tip,this.marimeToc,this.materialBaza,this.materialSecundar,this.mesaje);
            this.materialBaza=null;
            this.mesaje=null;
            return rezultat;
        }
    }
}


// singleton materiale de piele
//la final cand dam build o regula intre consum material marime pantof si cat consuma 0,4msq ex

