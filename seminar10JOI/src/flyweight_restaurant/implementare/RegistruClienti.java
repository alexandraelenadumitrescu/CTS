package flyweight_restaurant.implementare;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String,ClientAbstract> clienti=new HashMap<>();

//    void adauga(ClientAbstract client){
//        clienti.put(client)
//    }

    public ClientAbstract getClient(String nume,String telefon, String adresaDeMail){
        ClientAbstract nou= clienti.get(telefon);
        if(nou==null){
            nou =new Client(nume,telefon,adresaDeMail);
            clienti.put(telefon,nou);

        }
        return nou;
    }

}
