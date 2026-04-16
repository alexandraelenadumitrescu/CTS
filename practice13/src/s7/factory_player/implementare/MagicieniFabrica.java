package s7.factory_player.implementare;

public class MagicieniFabrica implements IFabrica{
    @Override
    public IGamePlayer create(ITipPlayer tipPlayer) {
        switch (tipPlayer){
            case TipMagicieni.MAGE -> {
                return new MagePLayer();
            }
            case TipMagicieni.HEALER -> {
                return new Healer();
            }
            default -> throw new IllegalStateException("Unexpected value: " + tipPlayer);
        }
    }
}
