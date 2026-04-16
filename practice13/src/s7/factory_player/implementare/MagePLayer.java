package s7.factory_player.implementare;

public class MagePLayer implements  IGamePlayer
{

    private TipMagicieni tip;

    public MagePLayer() {
        this.tip = TipMagicieni.MAGE;
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
