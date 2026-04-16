package s7.factory_player.implementare;

public class NonMagicieniFabrica implements IFabrica{



    @Override
    public IGamePlayer create(ITipPlayer tipPlayer) {
        switch (tipPlayer){
            case TipNonMagicieni.ARCHER -> {
                return new ArcherPlayer();
            }
            case TipNonMagicieni.WARRIOR -> {
                return new Warrior();
            }
            default -> throw new IllegalStateException("Unexpected value: " + tipPlayer);
        }
    }
}
