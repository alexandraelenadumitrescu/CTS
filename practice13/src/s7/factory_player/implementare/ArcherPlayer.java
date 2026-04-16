package s7.factory_player.implementare;

public class ArcherPlayer implements IGamePlayer{

    private TipNonMagicieni tip;

    public ArcherPlayer() {
        this.tip = TipNonMagicieni.ARCHER;
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
