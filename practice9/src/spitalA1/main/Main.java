package spitalA1.main;

import spitalA1.implementare.Pacient;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pacient p1=Pacient.getBuilder(true,true,true,true).build();
        System.out.println(p1.toString());
    }
}