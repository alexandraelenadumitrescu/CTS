package decorator.implementare;

public abstract class CarteDecorator implements ICarte {
    protected ICarte carte;
    public CarteDecorator(ICarte carte) {
        this.carte=carte;
    }

}
