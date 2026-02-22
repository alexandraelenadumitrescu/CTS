//Cerințe Test Final:
//
//        1. Interfața `Borrowable`
//        - Metode: void borrowItem() throws ItemNotAvailableException și void returnItem().
//
//
//        2. Excepția Custom `ItemNotAvailableException`
//        - Să fie o excepție checked (extinde Exception).
//
//
//        3. Clasa Abstractă `LibraryItem`
//        - Câmpuri: String id, String title, boolean isBorrowed (implicit false).
//        - Să implementeze Comparable<LibraryItem> (sortare după titlu).
//        - Metoda concretă toString() care să returneze ID-ul și Titlul.
//
//
//  4. Clase Concretă `Book` și `Magazine`
//        - Ambele extind LibraryItem.
//   - Doar clasa Book implementează interfața Borrowable.
//        - În borrowItem(): Dacă isBorrowed este true, aruncă ItemNotAvailableException. Altfel, setează isBorrowed = true.
//        - În returnItem(): Setează isBorrowed = false.
//
//
//  5. Clasa `Main` - Logica de Gestiune
//   - Creează o listă List<LibraryItem> care să conțină 2 cărți și 1 revistă.
//   - Creează un Map<String, LibraryItem> pentru căutare rapidă după id.
//        - Acțiune 1: Sorteză lista alfabetic după titlu și afișeaz-o.
//   - Acțiune 2 (Try-Catch): Încearcă să împrumuți aceeași carte de două ori consecutiv pentru a declanșa excepția. Prinde excepția și
//afișează mesajul ei.
//   - Acțiune 3 (Polimorfism): Parcurge lista și, pentru obiectele care sunt Borrowable, apelează returnItem().
//
//
//        6. Comparator Custom (Bonus)
//   - Creează un IdComparator care să sorteze lista după id în loc de titlu.
//
//  ---
//Regulă: Scrie totul de la zero (fără copy-paste din exercițiile anterioare dacă se poate, pentru a-ți fixa sintaxa).
//


import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        List<LibraryItem> libraryItems=new ArrayList<>();
        Book book1=new Book();
        book1.setTitle("abc");
        book1.setId(String.valueOf(101));
        Book book2=new Book();
        book2.setTitle("bac");
        book2.setId(String.valueOf(130));
        Magazine magazine=new Magazine();
        magazine.setTitle("aab");
        magazine.setId(String.valueOf(180));
        Map<String,LibraryItem> myMap=new HashMap<>();
        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(magazine);
        System.out.println(libraryItems);
        Collections.sort(libraryItems);
        System.out.println(libraryItems);
        try{
            book1.borrowItem();
        }catch(ItemNotAvailableException ex){
            System.out.println(ex.getMessage());
        }
        try{
            book1.borrowItem();
        }catch(ItemNotAvailableException ex){
            System.out.println(ex.getMessage());
        }

        for(LibraryItem li:libraryItems){
            if(li instanceof Borrowable){
                ((Borrowable) li).returnItem();
            }

        }
        IdComparator idComparator=new IdComparator();
        libraryItems.sort(Comparator.comparing(LibraryItem::getId));
        System.out.println(libraryItems);
    }
}