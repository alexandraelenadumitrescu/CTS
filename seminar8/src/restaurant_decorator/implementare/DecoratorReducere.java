package restaurant_decorator.implementare;

public class DecoratorReducere extends AbstractDecorator implements IBon{




    @Override
    public Double getTotal() {
        if(bon.getPersoana().gen.equals("feminin")){
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

    }

    @Override
    public void adaugaItem(Double d) {

    }
}
