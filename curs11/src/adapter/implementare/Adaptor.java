package adapter.implementare;

public class Adaptor implements IUSBcIncarcator{
    private IMicroUSBIncarcator referinta;

    public Adaptor(IMicroUSBIncarcator referinta) {
        this.referinta = referinta;
    }

    @Override
    public void incarcarePrinUsbC() {
        System.out.println("se aplica adaptor... ");
        referinta.incarcaPrinMicroUSB();
    }
}
