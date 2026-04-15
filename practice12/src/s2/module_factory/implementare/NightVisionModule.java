package s2.module_factory.implementare;

public class NightVisionModule extends AbstractModule {
    protected TipModul tip;
    protected int nivel;

    public NightVisionModule(TipModul tip, int nivel,String name,String description,float price) {
        this.name=name;
        this.description=description;
        this.price=price;
        this.tip = tip;
        this.nivel = nivel;
    }
}
