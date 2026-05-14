package cor_credit.implementare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chain {
    private static List<IHandler> handleri=new ArrayList<>();

    static IHandler handlerBlackList=new HandlerBlackList();
    static IHandler handlerGrad=new HandlerGradIndatorare(0.4);
    static IHandler handlerVechime=new HandlerVechime(5);
    static{
        handleri.add(handlerBlackList);
        handleri.add(handlerGrad);
        handleri.add(handlerVechime);
        handlerBlackList.setNextHandler(handlerGrad);
        handlerGrad.setNextHandler(handlerVechime);

    }


    public void shuffle(){
        Collections.shuffle(handleri);

        for(int i=0;i<handleri.size()-1;i++){
            handleri.get(i).setNextHandler(handleri.get(i+1));
        }

        handleri.get(handleri.size()-1).setNextHandler(null);
    }

    public void rezolva(Client c){
        handleri.get(0).rezolva(c);
    }
}
