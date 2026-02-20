import java.util.Collections;
import java.util.TreeSet;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ClasamentSet {

    public static int calculeazaPozitie(List<Integer> scoruri, int x) throws ScoreNotFoundException {
        TreeSet<Integer> setUnic = new TreeSet<>(Collections.reverseOrder());
        setUnic.addAll(scoruri);

        if (!setUnic.contains(x)) {
            throw new ScoreNotFoundException("Scorul " + x + " nu exista in clasament.");
        }

        return setUnic.headSet(x).size() + 1;
    }

    public static void main(String[] args) {
        File inputFile = new File("src/input.txt");
        File outputFile = new File("src/output.txt");


        try (Scanner sc = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

            List<Integer> date = new ArrayList<>();


            while (sc.hasNextInt()) {
                date.add(sc.nextInt());
            }

            if (date.isEmpty()) {
                writer.println("Fisierul de intrare este gol.");
                return;
            }


            int scorCautat = date.remove(date.size() - 1);

            try {
                int pozitie = calculeazaPozitie(date, scorCautat);
                writer.println("Scorurile procesate: " + date);
                writer.println("Scorul cautat: " + scorCautat);
                writer.println("Pozitia in clasament: " + pozitie);
            } catch (ScoreNotFoundException e) {
                writer.println("Eroare: " + e.getMessage());
            }



        } catch (FileNotFoundException e) {
            System.err.println("Nu s-a putut gasi fisierul: " + e.getMessage());
        }
    }
}