package clase.builder;

public class Package implements AbstractHolidayPackage{
    private TipTransport tip;
    private String cazare;
    private String extra;

    Package(TipTransport tip, String cazare, String extra) {
        super();//teoretic e implicit nu stiu de ce apare aici?
        this.tip = tip;
        this.cazare = cazare;
        this.extra = extra;
    }

    public TipTransport getTip() {
        return tip;
    }

    void setTip(TipTransport tip) {
        this.tip = tip;
    }

    public String getCazare() {
        return cazare;
    }

    void setCazare(String cazare) {
        this.cazare = cazare;
    }

    public String getExtra() {
        return extra;
    }

    void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Package{" +
                "tip=" + tip +
                ", cazare='" + cazare + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
