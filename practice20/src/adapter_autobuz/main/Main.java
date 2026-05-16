package adapter_autobuz.main;

import adapter_autobuz.implementare.Adapter;
import adapter_autobuz.implementare.ModPlataNou;
import adapter_autobuz.implementare.ModPlataVechi;
import adapter_autobuz.implementare.SistemSoftware;

public class Main {
    public static void main(String[] args) {
//        Compania de transport in comun preia si infrastructura de Metrou a orasului si doreste ca
//biletele sau abonamentele achizitionate de catre clienti pentru transportul terestru sa poata fi
//folosite si pentru transportul subteran. Sisteme software ale celor doua moduri de transport sunt
//diferite si se doreste implementarea unui modul care sa permita utilizarea celor doua sisteme fara
//a le modifica. Modulul implementat trebuie sa se ocupe de validarea biletelor sau si a
//abonamentelor.
        //stare veche interfata veche clasa concreta veche
        //stare noua interfata noua clasa concreta noua

        //sistem software(IModPlata vechi)
        //IModPlataVechi si cu concreta
        //IModPlataNou si cu concreta
        //Adapter implementez IModPlata vechi has a IModPlata nou

        SistemSoftware sistemSoftware=new SistemSoftware();
        sistemSoftware.plateste(new ModPlataVechi());
        Adapter adapter=new Adapter(new ModPlataNou());
        sistemSoftware.plateste(adapter);


    }
}
