package flyweight_linii_autobuz.implementare;

public class LinieAutobuz implements ILinieAutobuz{
    private int linie;
    @Override
    public void printeaza(Autobuz autobuz) {
        System.out.println(autobuz);
        System.out.println(linie);
    }

    public LinieAutobuz(int linie) {
        this.linie = linie;
    }
}
