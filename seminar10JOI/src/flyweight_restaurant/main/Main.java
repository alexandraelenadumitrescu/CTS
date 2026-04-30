package flyweight_restaurant.main;

import flyweight_restaurant.implementare.ClientAbstract;
import flyweight_restaurant.implementare.RegistruClienti;
import flyweight_restaurant.implementare.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registruClienti=new RegistruClienti();
        ClientAbstract client1=registruClienti.getClient("nume1","000","adresa1@mail.com");
        ClientAbstract client2=registruClienti.getClient("nume2","001","adresa1@mail.com");
        ClientAbstract client3=registruClienti.getClient("nume1","002","adresa1@mail.com");
        ClientAbstract client4=registruClienti.getClient("nume1","003","adresa1@mail.com");
        ClientAbstract client5=registruClienti.getClient("nume1","001","adresa1@mail.com");
        Rezervare rezervare1=new Rezervare(10,"10",2);
        client2.printeazaRezervare(rezervare1);
        client2.plateste(rezervare1,20);
        registruClienti.getClient("nume","001","adresa@mail.com").plateste(rezervare1,10);

        Rezervare rezervare2=new Rezervare(10,"ora2",4);
        registruClienti.getClient("hai","000","adresam@mail.com").plateste(rezervare2,10);

    }
}
