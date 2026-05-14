package cor_credit.implementare;

public class HandlerGradIndatorare implements IHandler{
    private IHandler nextHandler;
    private double gradIndatorare;

    public void setGradIndatorare(double gradIndatorare) {
        this.gradIndatorare = gradIndatorare;
    }

    public HandlerGradIndatorare( double gradIndatorare) {

        this.gradIndatorare = gradIndatorare;
    }

    @Override
    public boolean rezolva(Client client) {

        if ((client.getCredit().getSuma() / client.getCredit().getNrLuni()) / client.getVenit() > gradIndatorare)
        {
            System.out.println("clientul ar avea un grad de indatorare prea mare");
            client.removeCredit();
            return false;
        }else{
            if(nextHandler!=null){
                return nextHandler.rezolva(client);
            }else{
                return true;
            }

        }



    }

    @Override
    public void setNextHandler(IHandler handler) {
        this.nextHandler=handler;
    }
}
