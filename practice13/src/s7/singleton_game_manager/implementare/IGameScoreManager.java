package s7.singleton_game_manager.implementare;

public interface IGameScoreManager {
    void submitScore(String username, int score) throws Exception;
    int getMaxScore(String username) throws Exception;
    void displayLeaderboard();
}
