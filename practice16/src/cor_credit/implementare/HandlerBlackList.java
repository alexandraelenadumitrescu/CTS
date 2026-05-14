package cor_credit.implementare;

import java.util.ArrayList;
import java.util.List;

public class HandlerBlackList implements IHandler {
    private IHandler nextHandler;

    private static final List<String> blackList=new ArrayList<>();

    static{
        blackList.add("Gigel");
        blackList.add("Costel");
    }

    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean rezolva(Client client) {
        if(blackList.contains(client.getNume())){
            System.out.println("clientul este inclus pe blacklist");
            client.removeCredit();

            return false;
        }else{
            if(nextHandler!=null){
                return nextHandler.rezolva(client);
            }else{
                return true;
            }

        }



    }

    public HandlerBlackList() {
    }
}
