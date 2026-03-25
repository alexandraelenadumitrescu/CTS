package clase_builder;

public class PackageBuilder implements IBuilder{
    private TipTransport tip;
    private String cazare;
    private String extra;

    public PackageBuilder() {
        this.tip=TipTransport.AUTOCAR;
        this.cazare="none";
        this.extra="none";
    }


    @Override
    public Package build() {
        return new Package(tip,cazare,extra);
    }

    public PackageBuilder setTip(TipTransport tip) {
        this.tip = tip;
        return this;
    }

    public PackageBuilder setCazare(String cazare) {
        this.cazare = cazare;
        return this;
    }

    public PackageBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }
}
