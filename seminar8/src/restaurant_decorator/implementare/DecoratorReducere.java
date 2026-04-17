package restaurant_decorator.implementare;

public class DecoratorReducere extends AbstractDecorator implements IBon{


    public DecoratorReducere(IBon bon) {
        super(bon);
    }

    @Override
    public Double getTotal() {
        if(bon.getPersoana().getGen().equals("feminin")){
            System.out.println("s a aplicat o reducere de 10%");
            return bon.getTotal()*0.9;
        }
        return bon.getTotal();
    }

    @Override
    public Persoana getPersoana() {
        return bon.getPersoana();
    }

    @Override
    public void afiseazaTotal() {
        System.out.println(bon.getPersoana()+" total: "+ getTotal());

    }

    @Override
    public void adaugaItem(Double d) {
        bon.adaugaItem(d);
    }

}
