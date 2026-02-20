import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clasament {
    public static void main(String [] args){
        try{
            int[] scores=citireVector("src/input.txt");
            int x=citireX("src/input.txt");

            int poz=calculeazaPozitie(scores,x);

            scriereRezultat("src/output.txt",poz);


        }catch(Exception e){
            System.out.println("Eroare:"+e.getMessage());

        }
    }
    public static int[] citireVector(String fisier)throws IOException {
        Scanner sc=new Scanner(new File(fisier));
        List<Integer> lista=new ArrayList<>();
        while(sc.hasNextInt()){
            lista.add(sc.nextInt());
        }
        sc.close();
        lista.remove(lista.size() - 1);
        int[] v=new int[lista.size()];
        for(int i=0;i<lista.size();i++){
            v[i]=lista.get(i);
        }

        return v;

    }

    public static int citireX(String fisier) throws IOException {
        Scanner sc = new Scanner(new File(fisier));
        int x = 0;
        while (sc.hasNextInt()) {
            x = sc.nextInt();
        }
        sc.close();
        return x;
    }
    public static int calculeazaPozitie(int[] v, int x)
            throws ScoreNotFoundException {

        boolean gasit = false;
        int countMaiMare = 0;

        for (int val : v) {
            if (val == x)
                gasit = true;

            if (val > x)
                countMaiMare++;
        }

        if (!gasit)
            throw new ScoreNotFoundException("Scorul nu exista in clasament.");

        return countMaiMare + 1;
    }
    public static void scriereRezultat(String fisier, int pozitie)
            throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter(fisier));
        pw.println("Pozitia in clasament este: " + pozitie);
        pw.close();
    }

}
