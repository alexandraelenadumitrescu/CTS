package facade.main;

import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("pacient 1",10);
        Medic medic=new Medic("medic 1");
        Salon salon=new Salon();

        if(pacient.getGravitate()>=4){
            if(medic.areBiletDeTrimitere(pacient)){
                if(salon.getNrPatLiber()!=-1){
                    System.out.println(pacient+" s a internat");
                }
            }
        }
    }}
