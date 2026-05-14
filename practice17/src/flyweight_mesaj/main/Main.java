package flyweight_mesaj.main;

import flyweight_mesaj.implementare.FlyWeightFactory;
import flyweight_mesaj.implementare.Mesaj;

public class Main {
    public static void main(String[] args) {
//        O platformă de livrări trimite notificări către curieri. Există mai multe
//        tipuri de notificări (URGENTA, INFORMATIVA, PROMOTIONALA), fiecare cu un
//        template de mesaj și o prioritate predefinită — acestea se reutilizează
//        (sunt costisitoare de creat și identice pentru același tip).
//Fiecare notificare concretă trimisă unui curier conține informații specifice:
// numele curierului și adresa de livrare — acestea variază de la apel la apel.

        Mesaj mesaj=new Mesaj("nume ","adresa");
        FlyWeightFactory.getNotificare("URGENT").trimite(mesaj);


    }
}
