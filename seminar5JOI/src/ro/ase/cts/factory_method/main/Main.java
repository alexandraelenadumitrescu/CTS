package ro.ase.cts.factory_method.main;

import ro.ase.cts.factory_method.clase.FelDeMancare;
import ro.ase.cts.factory_method.clase.Supa;
import ro.ase.cts.factory_method.fabrici.*;

public class Main{
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica=new SupaFabrica();
        FelDeMancare supaCrema=fabrica.getFelDeMancare(TipSupa.SUPA_CREMA,100,"ciuperci",70);
        FelDeMancare ciorba=fabrica.getFelDeMancare(TipSupa.CIORBA,200,"legume",100);
        FelDeMancareFabrica fabricaDesert=new DesertFabrica();
        FelDeMancare papanasi=fabricaDesert.getFelDeMancare(TipDesert.PAPANASI,200,"cu visine");
        FelDeMancare clatite=fabricaDesert.getFelDeMancare(TipDesert.CLATITE,150,"cu visine");
        clatite.afiseaza();
        ciorba.afiseaza();
    }
}