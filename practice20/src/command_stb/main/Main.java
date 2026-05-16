package command_stb.main;

import command_stb.implementare.DeschideUsaMijloc;
import command_stb.implementare.PanouComanda;
import command_stb.implementare.UsaMijloc;

public class Main {
    public static void main(String[] args) {
//        Autobuzele vin din fabrica cu 3 usi: usa din fata,
//        usa de la mijloc si usa din spate. Pentru
//fiecare usa, soferul are cate un buton pentru punerea
// usilor in modul liber (sa poata fi deschise la
//solicitarea calatorilor) si un alt buton pentru deschiderea
// fortata a acestora. In total soferul are 6
//butoane. Se doreste implementarea unui modul care sa simplifice
// procesul pentru sofer si sa aiba
//un buton pentru punerea tuturor usilor in modul liber
// si un alt buton pentru deschiderea fortata a
//tuturor usilor.
        PanouComanda panouComanda=new PanouComanda();
        panouComanda.apasaButon(new DeschideUsaMijloc(new UsaMijloc()));
    }
}
