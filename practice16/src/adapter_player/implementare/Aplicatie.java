package adapter_player.implementare;

public class Aplicatie {

    public void foloseste(IPlayerModern player,String titlu, String artist){
        player.play(titlu,artist);
    }
}
