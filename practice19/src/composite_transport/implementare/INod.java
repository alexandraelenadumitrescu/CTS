package composite_transport.implementare;

public interface INod {
    void add(AbstractElementTransport nod);
    void remove(AbstractElementTransport nod);
    AbstractElementTransport getChild(int index);
}
