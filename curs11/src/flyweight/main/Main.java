package flyweight.main;

import flyweight.implementare.FabricaRecomandari;
import flyweight.implementare.Reteta;

import java.util.List;

public class Main
{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Reteta reteta=new Reteta(10+i,"otita", List.of("paracetamol","picaturi"));
            FabricaRecomandari.getRecomandare("apa").printare(reteta);
        }

    }
}
