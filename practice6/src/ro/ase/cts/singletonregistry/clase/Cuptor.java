package ro.ase.cts.singletonregistry.clase;

import java.util.*;

public class Cuptor {
    private int gradeMaxime;
    private List<String> listaDeAsteptare=new ArrayList<>();

    private static Map<String,Cuptor> cuptoare=new HashMap<>();
    static{
        cuptoare.put("Lemne",new Cuptor(200));
        cuptoare.put("Electric",new Cuptor(200));
        cuptoare.put("Gaz",new Cuptor(200));


    }

    private Cuptor(int gradeMaxime) {
        this.gradeMaxime = gradeMaxime;

    }

    public static Cuptor getCuptor(String tip) throws Exception {
        if(cuptoare.containsKey(tip)){
            return cuptoare.get(tip);
        }else{
            throw new Exception("eroare acest tip de cuptor nu exista");
        }

    }

    public void addPreparat(String preparat,int temp) throws Exception {
        if(temp>this.gradeMaxime){
            throw new Exception("temperatura nu este suportata de cuptor");
        }else{
            listaDeAsteptare.add(preparat);
        }
    }

    public static Cuptor getBestCuptor(){
        //am 3 cuptoare intr un map fiecare cu o lista si vreau sa calculez size ul fiecarei liste si sa returnez cuptorul cu size ul cel mai mic
//        Map<Integer, Cuptor> lungime=new HashMap<>();
//        for(Cuptor c:cuptoare.values()){
//            lungime.put(c.listaDeAsteptare.size(),c);
//        }
//        Cuptor celMaiBun=null;
//        for(Cuptor c: cuptoare.values()){
//            if(celMaiBun==null){
//                celMaiBun=c;
//            }
//            if(celMaiBun.listaDeAsteptare.size()>c.listaDeAsteptare.size()){
//                celMaiBun=c;
//            }
//        }
//        return celMaiBun;

        return cuptoare.values().stream().min(Comparator.comparingInt(c->c.listaDeAsteptare.size())).orElse(null);
    }

    public void afisare(){
        for (Map.Entry<String, Cuptor> entry : cuptoare.entrySet()) {
            if (entry.getValue() == this) {
                System.out.println("Acesta este cuptorul: " + entry.getKey());
                return;
            }
        }
        System.out.println("nu a fost gasit cuptorul");
    }
}
