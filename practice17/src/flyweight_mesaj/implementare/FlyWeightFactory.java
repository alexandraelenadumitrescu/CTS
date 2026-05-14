package flyweight_mesaj.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static Map<String,INotificare> mapa=new HashMap<>();

    static{
        mapa.put("URGENT", new Notificare("urgent"));
        mapa.put("NORMAL", new Notificare("normal"));
        mapa.put("INFORMATIVA", new Notificare("informativa"));

    }

    public static INotificare getNotificare(String key){
        if(mapa.containsKey(key)){
            return mapa.get(key);
        }else{
            throw new RuntimeException("nu exista acest tip de prioritate");
        }
    }

}
