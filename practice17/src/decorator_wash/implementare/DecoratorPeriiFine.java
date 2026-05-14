package decorator_wash.implementare;

public class DecoratorPeriiFine extends AbstractDecorator{

    public DecoratorPeriiFine(ISpalatorie spalatorie) {
        super(spalatorie);
    }

    @Override
    public void spala() {
        spalatorie.spala();
        System.out.println("spala cu perii fine");
    }
}
