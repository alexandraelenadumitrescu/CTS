package decorator.implementare;

public class DecoratorAmbalaj extends CarteDecorator{

    public DecoratorAmbalaj(ICarte carte) {
        super(carte);
    }

    @Override
    public String getNume() {
        return carte.getNume()+"cu ambalaj";
    }
}
