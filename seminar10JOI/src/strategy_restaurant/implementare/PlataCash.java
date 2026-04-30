package strategy_restaurant.implementare;

public class PlataCash implements  ModalitatePlata
{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println(numeClient+"  a platit cash  "+suma);
    }
}
