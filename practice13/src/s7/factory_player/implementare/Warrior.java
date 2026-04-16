package s7.factory_player.implementare;

public class Warrior implements IGamePlayer{
    private TipNonMagicieni tip;

    public Warrior() {
        this.tip = TipNonMagicieni.WARRIOR;
    }

    @Override
    public void startGame() {

    }

    @Override
    public void finishGame(int score) throws Exception {

    }

    @Override
    public void useSpecialAbility() {

    }

    @Override
    public String getPlayerType() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public int getMaxPower() {
        return 0;
    }
}
