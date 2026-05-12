package cor_credit.implementare;

public interface IHandler {
    boolean procesare(Pacient pacient);
    void setNextHandler(IHandler nextHandler);
}
