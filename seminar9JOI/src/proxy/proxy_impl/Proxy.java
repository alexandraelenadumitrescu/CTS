package proxy.proxy_impl;

import proxy.clase.ISpital;
import proxy.clase.Pacient;
import proxy.clase.Spital;

public class Proxy implements ISpital {
    private Spital spital;

    public Proxy(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient p) {
        if(p.getGravitate()>=6){
            spital.interneazaPacient(p);
        }

    }
}
