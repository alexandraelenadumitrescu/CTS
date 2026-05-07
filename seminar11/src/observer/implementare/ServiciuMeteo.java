package observer.implementare;

import java.util.HashMap;
import java.util.Map;

public class ServiciuMeteo extends AObservabil{

    //private float temperatura;
    private Map<String, Float> asocieriTemperaturi;

    public ServiciuMeteo(String denumireServiciu) {
        super(denumireServiciu);

        this.asocieriTemperaturi=new HashMap<>();
    }

    public void setTemperatura(String oras, float temperatura,String mesaj){
//        if(this.temperatura!=temperatura){
//            this.temperatura=temperatura;
//            notificaObservatori(temperatura);
//
//        }

        if(this.asocieriTemperaturi.containsKey(oras)){
            if(this.asocieriTemperaturi.get(oras)!=temperatura){
                this.asocieriTemperaturi.put(oras,temperatura);
                notificaObservatori(mesaj,oras);
            }else{
                System.out.println("acc temp");
            }
        }else{
            this.asocieriTemperaturi.put(oras,temperatura);
            notificaObservatori(mesaj,oras);
        }
    }
}
