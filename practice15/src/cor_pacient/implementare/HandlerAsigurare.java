package cor_pacient.implementare;

public class HandlerAsigurare implements  IHandler{
    private IHandler nextHandler;


    @Override
    public boolean procesare(Pacient pacient) {
        if(!pacient.isAreAsigurare()){
            return false;
        }else{
            if(nextHandler!=null){
                return nextHandler.procesare(pacient);
            }else{
                return true;
            }
        }
    }

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler=nextHandler;
    }


}
