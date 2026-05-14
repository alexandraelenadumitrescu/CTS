package proxy_carti.implementare;

import java.util.*;

public class BibliotecaProxy implements IBiblioteca{
    private Map<String,List<String>> utilizatori;
    private Biblioteca biblioteca;


    public BibliotecaProxy( Biblioteca biblioteca) {
        this.utilizatori=new HashMap<>();
        for(String s:biblioteca.getCarti()){
            utilizatori.put(s,new ArrayList<>());
        }
        this.biblioteca = biblioteca;
    }

    @Override
    public void imprumuta(String utilizator, String titluCarte) {
        if(utilizatori.containsKey(utilizator)){
            if(utilizatori.get(utilizator).size()==3){
                System.out.println("nu se poate imprumuta inca o carte s a ajuns la numarul maxim de carti imprumutate");

            }else{

                utilizatori.get(utilizator).add(titluCarte);
                biblioteca.imprumuta(utilizator, titluCarte);
            }
        }else{
            utilizatori.put(utilizator,new ArrayList<>());
            biblioteca.imprumuta(utilizator, titluCarte);
        }
    }
}
