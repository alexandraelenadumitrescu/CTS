package strategy_restaurant.implementare;

public class PlataCard implements ModalitatePlata
{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println(numeClient+ " a platit cu cardul suma "+suma);
    }
}
