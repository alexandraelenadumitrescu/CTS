package cor_pacient.main;

import cor_pacient.implementare.*;

//Cerința:
//În cadrul unui spital, când un pacient sosește la urgențe,
// cererea sa trece prin mai mulți verificatori: mai întâi se
// verifică dacă are asigurare medicală, apoi dacă are bilet de
// trimitere de la medicul de familie, iar în final se verifică
// disponibilitatea unui medic specialist. Dacă oricare dintre
// verificări eșuează, pacientul este redirecționat corespunzător.
// Dacă toate sunt trecute, pacientul este preluat.
public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient(true,true);
        IHandler handlerAsigurare=new HandlerAsigurare();
        IHandler handlerBilet=new HandlerBilet();
        HandlerMedic handlerMedic=new HandlerMedic();
        handlerMedic.adaugaMedic("medic 1");

        handlerAsigurare.setNextHandler(handlerBilet);
        handlerBilet.setNextHandler(handlerMedic);
        System.out.println(handlerAsigurare.procesare(pacient));
        System.out.println(handlerAsigurare.procesare(pacient));


    }
}
