package cor_credit.implementare;

public interface IHandler {
    boolean rezolva(Client client);//boolean sau void?
    void setNextHandler(IHandler handler);
}
