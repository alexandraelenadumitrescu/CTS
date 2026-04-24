package cor_credit.main;

import cor_credit.implementare.*;

public class Main {
    public static void main(String[] args) {
        AHandlerCredit handlerBlacklist  = new HandlerBlacklist();
        AHandlerCredit handlerVarsta     = new HandlerVarsta();
        AHandlerCredit handlerBunPlatnic = new HandlerBunPlatnic();
        AHandlerCredit handlerSalariu    = new HandlerSalariu();
        AHandlerCredit handlerNrCopii    = new HandlerNrCopii();

        handlerBlacklist
            .setNextHandler(handlerVarsta)
            .setNextHandler(handlerBunPlatnic)
            .setNextHandler(handlerSalariu)
            .setNextHandler(handlerNrCopii);

        CerereCredit cerere1 = new CerereCredit("Ion Popescu", 5000, 1, true, true, 50000, 35);
        CerereCredit cerere2 = new CerereCredit("Maria Ionescu", 2000, 0, true, false, 200000, 28);
        CerereCredit cerere3 = new CerereCredit("Andrei Popa", 7000, 2, true, false, 80000, 40);

        System.out.println("===== CERERE 1 =====");
        handlerBlacklist.proceseazaCerere(cerere1);

        System.out.println("\n===== CERERE 2 =====");
        handlerBlacklist.proceseazaCerere(cerere2);

        System.out.println("\n===== CERERE 3 =====");
        handlerBlacklist.proceseazaCerere(cerere3);
    }
}
