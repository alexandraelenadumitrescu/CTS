package decorator_wash.implementare;

public abstract class AbstractDecorator implements ISpalatorie{
    ISpalatorie spalatorie;

    public AbstractDecorator(ISpalatorie spalatorie) {
        this.spalatorie = spalatorie;
    }
}
