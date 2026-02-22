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

//
//Challenge 3: Colecții Custom și Mosterniri (List & Map)
//
//
//Acum haide să transformăm Smart Home-ul într-un sistem
// care gestionează mai multe dispozitive folosind Colecții.
//
//Obiective Challenge 3:
//
//
//        1. Colecție de dispozitive (List)
//   - În clasa Main, în loc de un singur SmartTV,
//   creează o listă (List<ElectronicDevice>) numită myDevices.
//        - Adaugă în listă cel puțin 3 obiecte:
//        - Două instanțe de SmartTV.
//        - O instanță de SmartConsole (va trebui să o creezi, să moștenească tot ElectronicDevice).
//
//
//        2. Polimorfism în acțiune
//   - Parcurge lista myDevices cu un for-each.
//   - Pentru fiecare dispozitiv, apelează showBattery().
//        - Provocare: Pentru dispozitivele care
//        implementează RemoteControllable (folosește instanceof),
//        apelează pressButton() (atenție la
//     try-catch și casting).
//
//
//        3. Evidența dispozitivelor (Map)
//   - Creează un Map<String, ElectronicDevice> unde cheia
//   (String) este un nume unic (ex: "LivingRoomTV", "BedroomTV", "ConsoleX") și
//valoarea este obiectul respectiv.
//        - Afișează toate cheile (numele dispozitivelor) folosind myMap.keySet().
//
//
//        4. Interfață suplimentară: `Chargable`
//        - Creează o interfață Chargable cu metoda void charge(int amount).
//        - Fă clasa abstractă ElectronicDevice să implementeze
//        Chargable. Implementează metoda charge în clasa abstractă
//        (astfel încât toate
//        dispozitivele să se poată încărca).
//
//





//Challenge 4: Generice și Colectii Custom (Sortare & Comparator)
//
//
//        Acesta este ultimul pas mare pentru a ajunge la acel "nivel satisfăcător" despre care vorbeai. Vom învăța cum să sortăm obiectele
//        noastre.
//
//        Obiective Challenge 4:
//
//
//        1. Implementează `Comparable`
//        - Modifică clasa abstractă ElectronicDevice să implementeze interfața standard Java Comparable<ElectronicDevice>.
//        - Implementează metoda compareTo(ElectronicDevice other).
//        - Regulă de sortare: Dispozitivele să fie sortate în funcție de batteryLevel (de la cel mai descărcat la cel mai încărcat).
//
//
//        2. Sortarea listei
//        - În Main, după ce ai adăugat dispozitivele în listă, folosește Collections.sort(myDevices).
//        - Afișează lista înainte și după sortare pentru a vedea diferența (va trebui să suprascrii metoda toString() în SmartTV și
//        SmartConsole sau direct în ElectronicDevice pentru a vedea ceva frumos la consolă, ex: return "Dispozitiv cu baterie: " +
//        batteryLevel;).
//
//
//        3. Comparator Custom (Bonus/Alternative)
//        - Creează o clasă separată DeviceNameComparator care implementează Comparator<String> (sau poți folosi o expresie Lambda dacă știi)
//        pentru a sorta cheile din Map (numele dispozitivelor) în ordine invers alfabetică.
//
//
//        4. Finalizare Logica `charge`
//        - Completează metoda charge în ElectronicDevice astfel încât să crească batteryLevel dar să nu depășească 100.










import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<ElectronicDevice> mydevices=new ArrayList<>();

        SmartTV smartTV=new SmartTV();
        SmartTV smartTVOLED=new SmartTV();
        SmartConsole smartConsole=new SmartConsole();

        mydevices.add(smartTV);
        mydevices.add(smartTVOLED);
        mydevices.add(smartConsole);
        for (ElectronicDevice dev :mydevices){
            dev.showBattery();
            if(dev instanceof RemoteControllable){
                try{((RemoteControllable) dev).pressButton();}catch (BatteryEmptyException be){
                    System.out.printf(be.getMessage());
                }
            }
        }
        try{smartTVOLED.pressButton();
        smartTVOLED.pressButton();}catch (BatteryEmptyException be){
            System.out.println(be.getMessage());
        }

        System.out.printf(mydevices.toString());
        Collections.sort(mydevices);
        System.out.println(mydevices.toString());
        System.out.println("----------");
        Map<String, ElectronicDevice> myMap=new HashMap<>();
        myMap.put("Living Room TV",smartTV);
        myMap.put("Bedroom TV",smartTVOLED);
        myMap.put("Console",smartConsole);
        System.out.println(myMap.keySet());
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
        myMap.entrySet().stream().sorted(Map.Entry.comparingByKey(new DeviceNameComparator())).forEach(entry-> System.out.println(entry.getKey()+entry.getValue()));




    }
}