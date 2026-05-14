package flyweight_mesaj.implementare;

public class Notificare implements INotificare{
    String grad;


    public Notificare(String grad) {
        this.grad = grad;
    }

    @Override
    public void trimite(Mesaj mesaj) {
        System.out.println(grad
        );
        System.out.println(mesaj);
    }
}
