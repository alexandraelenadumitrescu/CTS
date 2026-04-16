package s7.factory_player.implementare;

public class Healer implements  IGamePlayer{
    private TipMagicieni tip;

    public Healer() {
        this.tip=TipMagicieni.HEALER;
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

    @Override
    public String toString() {
        return "Healer{" +
                "tip=" + tip +
                '}';
    }
}
