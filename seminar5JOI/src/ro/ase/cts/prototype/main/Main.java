package ro.ase.cts.prototype.main;
//RESTAURANT B4

import ro.ase.cts.prototype.clase.Rezervare;
import ro.ase.cts.prototype.clase.RezervarePrototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("nume",12,4,"0000000000000000");
        Rezervare rezervareNoua= (Rezervare) rezervare.copiaza();// incalcam dip
        RezervarePrototype rez=rezervare.copiaza();
        //ne facem setteri pentru modificarea orei rezervarii
        //cel putin 2 obiecte clonate
        System.out.println(rezervareNoua.toString());
        rezervareNoua.setOra(20);
        System.out.println(rezervareNoua.toString());
        System.out.println(rez.toString());

    }
}
