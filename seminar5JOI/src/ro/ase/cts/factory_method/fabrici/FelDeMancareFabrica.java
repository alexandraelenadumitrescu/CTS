package ro.ase.cts.factory_method.fabrici;

import ro.ase.cts.factory_method.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);
    FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);

}
