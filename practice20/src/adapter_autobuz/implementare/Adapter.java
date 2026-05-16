package adapter_autobuz.implementare;

public class Adapter implements IModPlataVechi {
    private IModPlataNou modPlataNou;

    public Adapter(IModPlataNou modPlataNou) {
        this.modPlataNou = modPlataNou;
    }

    @Override
    public void platesteSuprateran() {
        modPlataNou.platesteSubteran();
    }
}
