package s7.singleton_game_manager.implementare;

import s8.game_weapon_builder.implementare.GameWeapon;

import java.util.*;

public class GameScoreManager implements IGameScoreManager{
    //date piv
    //inst priv stat
    //get inst public static
    private String numeJucator;
    private int scor;

    private Map<String, Integer> leaderboard;
    private static final int nrMaxJucatori=10;

    private static GameScoreManager instance=new GameScoreManager();

    public static GameScoreManager getInstance(){
        return instance;

    }

    private GameScoreManager() {

        this.leaderboard=new HashMap<>();
    }

    @Override
    public void submitScore(String username, int score) throws Exception {
        if(!leaderboard.containsKey(username)&&leaderboard.size()==nrMaxJucatori){
            throw new Exception("nr maxim de jucatori inreg");
        }
        if(leaderboard.containsKey(username)){
            if(leaderboard.get(username)<score){
                leaderboard.put(username,score);
            }
        }else if(!leaderboard.containsKey(username)){
            leaderboard.put(username,score);
        }
    }

    @Override
    public int getMaxScore(String username) throws Exception {
        return leaderboard.get(username);
    }

    @Override
    public void  displayLeaderboard() {
        System.out.println(leaderboard);
    }
}
