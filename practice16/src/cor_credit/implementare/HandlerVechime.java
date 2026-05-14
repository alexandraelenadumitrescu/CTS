package cor_credit.implementare;

public class HandlerVechime implements IHandler{
    private IHandler nextHandler;
    private int vechime;

    public HandlerVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public boolean rezolva(Client client) {



        if(client.getVechime()<vechime){
            client.removeCredit();
            System.out.println("clientul nu are vecimea suficienta");
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
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler=nextHandler;
    }
}
