package cor_pacient.implementare;

public interface IHandler {
    boolean procesare(Pacient pacient);
    void setNextHandler(IHandler nextHandler);
}
