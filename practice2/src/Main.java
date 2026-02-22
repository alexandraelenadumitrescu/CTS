//Since we just covered the theory, I’ve prepared a scenario
// for you. You are designing a system for a Smart Home.
// You have two types of objects: Electronic Devices (like a TV)
// and Appliances (like a Toaster).
//
//The Challenge
//I want you to write the Java code for this scenario
// using both an Abstract Class and an Interface.
//
//The Interface: Create an interface called RemoteControllable.
// It should have a method void pressPowerButton().
// (Many different things can be remote-controlled, even if they aren't related).
//
//The Abstract Class: Create an abstract class
// called ElectronicDevice. It should have a protected
// variable int batteryLevel and a concrete method void
// showBattery() that prints the level.
//
//The Concrete Class: Create a class SmartTV that
// extends the abstract class and implements the interface.
//


//
//Challenge 2: Tratarea erorilor (Try-Catch) și Exceptii Custom
//
//
//Acum că avem structura, hai să o facem mai "profesionistă".
// În Java, în loc să folosim doar System.out.println pentru a anunța că
//bateria e goală, e mai bine să aruncăm o Excepție.
//
//Obiective Challenge 2:
//
//
//        1. Excepție Custom: Creează o clasă BatteryEmptyException care să extindă Exception.
//        2. Modifică `SmartTV`:
//        - Metoda pressButton() trebuie acum să arunce (throws)
//        BatteryEmptyException dacă batteryLevel este 0 (sau mai mic).
//        - Nu mai afișa mesajul cu printf în interiorul if-ului de
//        baterie, ci folosește throw new BatteryEmptyException("Mesaj
//                                                                                                                        personalizat aici").
//                                                                                                                                3. Modifică Interfața: Deoarece SmartTV acum aruncă o excepție verificată (checked exception), va trebui să actualizezi și
//semnătura metodei în interfața RemoteControllable (adaugă throws BatteryEmptyException).
//        4. Actualizează `Main`:
//        - Înconjoară apelurile smartTV.pressButton() cu un bloc `try-catch`.
//        - În blocul catch, afișează mesajul excepției.
//       - Adaugă un bloc `finally` care să afișeze "Sesiune de utilizare încheiată".


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SmartTV smartTV=new SmartTV();
        for(int i=0;i<50;i++){
            try{
                smartTV.pressButton();
            } catch (BatteryEmptyException be) {
                System.out.println(be.getMessage());
            } finally{
                System.out.println("sesiune de utilizare incheiata");
            }

            smartTV.showBattery();
        }

























    }
}