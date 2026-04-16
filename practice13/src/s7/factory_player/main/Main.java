package s7.factory_player.main;

import s7.factory_player.implementare.IGamePlayer;
import s7.factory_player.implementare.MagicieniFabrica;
import s7.factory_player.implementare.TipMagicieni;

public class Main {
    public static void main(String[] args) {
        MagicieniFabrica fabricaMagicieni=new MagicieniFabrica();
        IGamePlayer healer=fabricaMagicieni.create(TipMagicieni.HEALER);
        System.out.println(healer.toString());
    }
}
