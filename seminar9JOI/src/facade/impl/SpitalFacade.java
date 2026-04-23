package facade.impl;

import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;

public class SpitalFacade {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=6){
            if(medic.areBiletDeTrimitere(pacient)){
                if(salon.getNrPatLiber()!=-1){

                }
            }
        }else{
            System.out.println("");
        }
    }

}
