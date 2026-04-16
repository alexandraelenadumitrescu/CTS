package s7.singleton_game_manager.implementare;

public interface IGamePlayer {
    void startGame();
    void finishGame(int score) throws Exception;
    void useSpecialAbility();
    String getPlayerType();
    String getUsername();
    int getMaxPower();
}