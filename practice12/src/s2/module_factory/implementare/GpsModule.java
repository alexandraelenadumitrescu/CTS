package s2.module_factory.implementare;

public class GpsModule extends AbstractModule{
    protected  TipModul tip;
    protected int range;

    GpsModule(TipModul tip, int range, String name,String description,float price) {
        this.name=name;
        this.description=description;
        this.price=price;
        this.tip = tip;
        this.range = range;
    }


    @Override
    public String toString() {
        return "GpsModule{" +
                "tip=" + tip +
                ", range=" + range +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
