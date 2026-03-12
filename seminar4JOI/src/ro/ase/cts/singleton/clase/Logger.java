package ro.ase.cts.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;

    private static Logger instantaLogger=null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;

    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public void afiseazaLog(String text){
        System.out.println(sender+" cu codul "+cod+" a trimis "+text+" din categoria "+categorie);
        this.cod++;
    }

    public static synchronized Logger getInstanta(String sender, String categorie){
        if(instantaLogger==null){
            instantaLogger=new Logger(sender,categorie);
        }
        return instantaLogger;
    }
}
