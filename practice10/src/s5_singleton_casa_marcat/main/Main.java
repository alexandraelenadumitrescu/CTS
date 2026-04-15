package s5_singleton_casa_marcat.main;

import s5_singleton_casa_marcat.implementare.CasaDeMarcat;

public class Main {
    public static void main(String[] args) {
        CasaDeMarcat casa=CasaDeMarcat.getInstance();
        CasaDeMarcat casa2=CasaDeMarcat.getInstance();
        System.out.println(casa.equals(casa2));

    }
}
