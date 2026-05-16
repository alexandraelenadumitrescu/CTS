package command_stb.implementare;

import java.util.ArrayList;
import java.util.List;

public class PanouComanda {

    private List<ICommand> comenzi=new ArrayList<>();

    public void apasaButon(ICommand comanda){
        comenzi.add(comanda);
        comanda.execute();
    }
}
