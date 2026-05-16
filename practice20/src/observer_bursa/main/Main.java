package observer_bursa.main;

import observer_bursa.implementare.Client;
import observer_bursa.implementare.IObserver;
import observer_bursa.implementare.ISubject;
import observer_bursa.implementare.SubiectConcret;

public class Main {
    public static void main(String[] args) {
//        O aplicație financiară monitorizează prețul acțiunilor la bursă.
//        Mai mulți investitori (persoane fizice, bănci, fonduri de investiții)
//        sunt interesați să primească alerte instantanee imediat ce prețul unei
//        anumite acțiuni se modifică. Investitorii se pot abona sau dezabona de
//        la alertele unei acțiuni în orice moment al zilei.
//1p. Motivați alegerea design pattern-ului prin elementele sale cheie.
//3p. Testați soluția prin modificarea prețului unei acțiuni și notificarea a 3
// investitori diferiți.

        IObserver client=new Client();
        IObserver client2=new Client();
        SubiectConcret subjectConcret=new SubiectConcret();
        subjectConcret.attach(client);
        subjectConcret.setPretActiune(200);
        subjectConcret.attach(client2);
        subjectConcret.setPretActiune(200);
        subjectConcret.setPretActiune(250);

    }
}
