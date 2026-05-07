package observer.main;

import observer.implementare.AObservabil;
import observer.implementare.Client;
import observer.implementare.IObserver;
import observer.implementare.ServiciuMeteo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //clientii de aboneaza la serviciul meteo
        //se doreste notificarea clientilor atunci cand
        //temperatura inregistrata de senzor se modifica

        //observatori si observati
        //principiul hollywood don't call us we'll call you
        //colectie de observatori
        //interfata
        //metode add si remove
        //metoda notify all anunatam observatorii de declansarea unui eveniment
        //obs concret contine starea

        //DIRECTIE UN CLIENT SA NU SE POATA ABONA DE MAI MULTE ORI LA UN SERVICIU

        IObserver client1=new Client("nume client 1", List.of("Galati"));
        IObserver client2=new Client("nume client 2",List.of("Galati"));
        IObserver client3=new Client("nume client 3",List.of("Braila"));
        IObserver client4=new Client("nume client 4",List.of("Galati"));
        IObserver client5=new Client("nume client 5",List.of("Galati"));


        ServiciuMeteo serviciuMeteo=new ServiciuMeteo("serviciu meteo");
        serviciuMeteo.setTemperatura("Galati",21," s a modificat temperatura in galati la 21 de grade");
        serviciuMeteo.setTemperatura("Braila",21," s a modificat temperatura in braila la 21 de grade");


        serviciuMeteo.add(client1);
        serviciuMeteo.add(client2);
        serviciuMeteo.add(client3);
        serviciuMeteo.add(client4);
        serviciuMeteo.add(client5);
        serviciuMeteo.setTemperatura("Galati",25," s a modificat temperatura in galati la 21 de grade");
        serviciuMeteo.setTemperatura("Constanta",25," s a modificat temperatura in galati la 21 de grade");
        serviciuMeteo.setTemperatura("Braila",27," s a modificat temperatura in braila la 21 de grade");



        //to do mai multi observeri concreti pentru fiecare oras,
        // un serviciu meteo pentru fiecare oras in parte, astfel clientii se aboneaza la servicii concrete pentru orasele de interes

    }
}
