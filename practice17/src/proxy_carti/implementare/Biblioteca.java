package proxy_carti.implementare;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements IBiblioteca{
    private List<String> carti=new ArrayList<>();

    public void imprumuta(String utilizator,String titluCarte){
        carti.remove(titluCarte);
    }

    public List<String> getCarti() {
        return carti;
    }

    public Biblioteca(List<String> carti) {
        this.carti = carti;
    }
}
