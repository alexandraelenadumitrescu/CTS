package cor_credit.main;

import cor_credit.implementare.*;

public class Main {
    public static void main(String[] args) {
//        Problema 1 – Aprobarea unui credit bancar (decizie
//boolean)
//Context:
//O bancă analizează cererile de credit folosind mai mulți verificatori (responsabili), fiecare
//ocupându-se de un criteriu specific.
//Cerință:
//Să se implementeze un sistem bazat pe Chain of Responsibility care decide dacă o persoană
//este eligibilă pentru un credit.
//Date de intrare:
//• Obiect Persoana (nume, venit lunar, vechime în muncă, scor credit etc.)
//• Suma dorită (double suma)
//• Perioada (int luni)
//Responsabili în chain:
//1. VerificatorBirouCredit
//o Respinge dacă persoana este rău-platnic (ex: scor sub un prag).
//2. VerificatorVechime
//o Respinge dacă vechimea în muncă este sub X luni.
//3. VerificatorGradIndatorare
//o Calculează rata lunară și verifică dacă gradul de îndatorare depășește un
//procent (ex: 40% din venit).
//Comportament:
//• Fiecare responsabil:
//o Dacă regula NU este respectată → returnează false (lanțul se oprește)
//o Dacă regula este respectată → pasează cererea mai departe
//• Dacă toate verificările sunt trecute → returnează true
//Output:
//true (credit aprobat) sau false (respins)

        Client clientGigel=new Client("Gigel",10,1000);
        Client clientDorel=new Client("Dorel",2,1000000);
        Client clientMarian=new Client("Marian",10,200);
        Credit creditRiscMare=new Credit(10000,2);
        Credit creditRiscMic=new Credit(10000,20);

//pentru randomizare cand intru in chain tre sa imi adauge cumva din start in potentiale credite

//        clientGigel.adaugaCredit(creditRiscMare);
//        clientDorel.adaugaCredit(creditRiscMic);
//        handlerBlackList.rezolva(clientGigel);
//        handlerBlackList.rezolva(clientDorel);
//        clientMarian.adaugaCredit(creditRiscMare);
//        handlerBlackList.rezolva(clientMarian);

        //shuffling

        Chain chain=new Chain();
        clientMarian.adaugaCredit(creditRiscMare);
        chain.rezolva(clientMarian);
        chain.shuffle();
        clientMarian.adaugaCredit(creditRiscMare);
        chain.rezolva(clientMarian);



    }
}
