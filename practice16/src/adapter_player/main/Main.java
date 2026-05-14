package adapter_player.main;

import adapter_player.implementare.Adaptor;
import adapter_player.implementare.Aplicatie;
import adapter_player.implementare.IPlayerModern;
import adapter_player.implementare.PlayerVechi;

public class Main {
//    Cerința:
//O aplicație de muzică românească folosește un sistem vechi de redare
// audio (PlayerVechi) care expune metoda redaFisierMp3(String numeFisier).
// Noua aplicație lucrează doar cu interfața IPlayerModern care expune metoda
// play(String titlu, String artist). Se dorește integrarea playerului vechi în
// noua aplicație fără modificarea acestuia.
//


    public static void main(String[] args) {
        Aplicatie aplicatie=new Aplicatie();
        IPlayerModern adaptor=new Adaptor(new PlayerVechi());
        aplicatie.foloseste(adaptor,"titlu1","artist1");
    }

}
