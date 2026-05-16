package command_sarcini.implementare;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> comenzi=new ArrayList<>();

    public void completeaza(){
        for(ICommand c:comenzi){
            c.execute();
        }
    }

    public void anuleaza(){
        comenzi.removeLast();
    }

}

//PANA AICI E DESTUL
