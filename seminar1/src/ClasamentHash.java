import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ClasamentHash {
    public static void main(String[] args) {
        try {
            Map<Integer, Integer> frecventeScoruri = new HashMap<>();
            
            // Citim datele si obtinem scorul cautat (x)
            int x = citireDate("src/input.txt", frecventeScoruri);

            // Calculam pozitia folosind HashMap-ul
            int pozitie = calculeazaPozitie(frecventeScoruri, x);

            // Scriem rezultatul
            scriereRezultat("output_hash.txt", pozitie);
            
            System.out.println("Calculul a fost finalizat cu succes folosind HashMap.");
            System.out.println("Rezultatul se afla in output_hash.txt");

        } catch (ScoreNotFoundException e) {
            System.err.println("Eroare de business: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Eroare la manipularea fisierelor: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("O eroare neasteptata a aparut: " + e.getMessage());
        }
    }

    public static int citireDate(String caleFisier, Map<Integer, Integer> frecvente) throws IOException {
        File fisier = new File(caleFisier);
        if (!fisier.exists()) {
            throw new IOException("Fisierul " + caleFisier + " nu a fost gasit.");
        }

        List<Integer> toateNumerele = new ArrayList<>();
        try (Scanner scanner = new Scanner(fisier)) {
            while (scanner.hasNextInt()) {
                toateNumerele.add(scanner.nextInt());
            }
        }

        if (toateNumerele.isEmpty()) {
            throw new IOException("Fisierul de intrare este gol.");
        }

        // Ultimul numar din fisier este scorul X conform logicii initiale
        int x = toateNumerele.remove(toateNumerele.size() - 1);

        // Populam HashMap-ul cu restul numerelor (scorurile din clasament)
        for (int scor : toateNumerele) {
            frecvente.put(scor, frecvente.getOrDefault(scor, 0) + 1);
        }

        return x;
    }

    public static int calculeazaPozitie(Map<Integer, Integer> frecvente, int x) throws ScoreNotFoundException {
        if (!frecvente.containsKey(x)) {
            throw new ScoreNotFoundException("Scorul " + x + " nu exista in clasament.");
        }

        int scoruriMaiMari = 0;
        
        // Iteram prin cheile map-ului pentru a numara cate scoruri sunt strict mai mari
        for (Map.Entry<Integer, Integer> entry : frecvente.entrySet()) {
            if (entry.getKey() > x) {
                scoruriMaiMari += entry.getValue();
            }
        }

        // Pozitia este numarul de scoruri mai mari + 1
        return scoruriMaiMari + 1;
    }

    public static void scriereRezultat(String caleFisier, int pozitie) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(caleFisier))) {
            writer.println("Pozitia in clasament (calculata cu HashMap) este: " + pozitie);
        }
    }
}
