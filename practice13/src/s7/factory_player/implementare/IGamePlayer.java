package s7.factory_player.implementare;

public interface IGamePlayer {
    void startGame();
    void finishGame(int score) throws Exception;
    void useSpecialAbility();
    String getPlayerType();
    String getUsername();
    int getMaxPower();
}