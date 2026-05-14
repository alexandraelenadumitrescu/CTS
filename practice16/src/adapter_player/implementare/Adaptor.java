package adapter_player.implementare;

import java.sql.SQLOutput;

public class Adaptor implements IPlayerModern{

    private IPlayerVechi referinta;

    @Override
    public void play(String titlu, String artist) {
        System.out.println("se aplica adaptor...");
        referinta.redaFisier(titlu+ " "+ artist);
    }

    public Adaptor(IPlayerVechi referinta) {
        this.referinta = referinta;
    }
}
