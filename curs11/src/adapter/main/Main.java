package adapter.main;

import adapter.implementare.*;

public class Main {
    public static void main(String[] args) {
        Telefon telefon1=new Telefon("huawei p20",10);
        IMicroUSBIncarcator incarcatorVechi=new MicroUSB();
        telefon1.chargeUSBC(new Adaptor(incarcatorVechi));//primeste un adaptor, tre sa arate ca nevoia pe care o avem adica ca un incarcator usb c si sa faca trecerea catre micro usb adica catre ce dispunem noi
    }
}
