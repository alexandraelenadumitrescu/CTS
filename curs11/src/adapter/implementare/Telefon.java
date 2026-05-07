package adapter.implementare;

public class Telefon {
    private String model;
    private int nivelBaterie;

    public Telefon(String model, int nivelBaterie) {
        this.model = model;
        this.nivelBaterie = nivelBaterie;
    }

    public void chargeUSBC(IUSBcIncarcator incarcator){
        System.out.println("se initiaza proces incarcare telefon");
        incarcator.incarcarePrinUsbC();// nu detinem incarcatorul dar avem adapter care va arata ca el
    }
}
