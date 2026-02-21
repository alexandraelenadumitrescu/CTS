//🔹 EXERCIȚIUL 1 – VALIDATOR DE SERII NUMERICE (Simple Factory + Exception Handling)
//Cerință
//
//Se primește un set de numere întregi.
//Se cere o metodă care returnează:
//
//suma numerelor prime aflate între prima și ultima valoare negativă.
//
//Exemplu:
//
//Set: 5 7 -3 11 13 4 -2 8
//Rezultat: 11 + 13 + 4


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

import static java.lang.Math.sqrt;

public class Main {
    List<Integer> lista=List.of(5 ,7 ,-3, 11, 13, 4, -2, 8);








    public static void main(String[] args) {
         int[] v={5 ,7 ,-3, 11, 13, 4, -2, 8};
         int sum=0;
        Pereche pereche=gasestePozMaxime.aplica(v);
        Verifica verifica=new Verifica();
        System.out.println(pereche);
        for(int i=pereche.getAtr1()+1;i<pereche.getAtr2();i++){
            try{
                if(verifica.isPrime(v[i])){
                    sum+=v[i];
                }
            }catch (exceptieNull e){
                System.out.println(e.getMessage());
            }




        }
        System.out.println(sum);
    }
}