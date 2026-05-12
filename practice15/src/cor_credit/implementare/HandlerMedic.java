package cor_credit.implementare;

import java.util.ArrayList;
import java.util.List;

public class HandlerMedic implements IHandler{
    private IHandler nextHandler;
    private List<String> medici=new ArrayList<>();

    public void adaugaMedic(String medic){
        this.medici.add(medic);
    }
    @Override
    public boolean procesare(Pacient pacient) {
        if(medici.size()==0){
            return false;
        }else{
            if(nextHandler!=null){
                this.medici.remove(0);
                return nextHandler.procesare(pacient);
            }else{
                this.medici.remove(0);
                return true;
            }
        }
    }

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler=nextHandler;
    }
}
