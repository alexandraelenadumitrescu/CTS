package flyweight.implementare;

public class Recomandare implements IRecomandare{
    private final String textRecomandare;// se reutilizeaza

    public Recomandare(String textRecomandare) {
        this.textRecomandare = textRecomandare;
    }

    @Override
    public void printare(Reteta reteta) {
        System.out.println("se printeaza reteta "+ reteta.toString());
        System.out.println("***se recomanda: "+textRecomandare+" ***");
    }
}
