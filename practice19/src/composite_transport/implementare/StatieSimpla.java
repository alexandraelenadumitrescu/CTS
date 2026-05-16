package composite_transport.implementare;



public class StatieSimpla implements INod, AbstractElementTransport {
    private int nrPasageri;


    public StatieSimpla(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }




    @Override
    public int calculeazaNumarPasageri() {
        return this.nrPasageri;
    }

    @Override
    public boolean verificaCapacitate(int capacitateMaxima) {
        return capacitateMaxima<this.nrPasageri;
    }

    @Override
    public void add(AbstractElementTransport nod) {
        throw new RuntimeException("operatie nesuportata");

    }

    @Override
    public void remove(AbstractElementTransport nod) {
        throw new RuntimeException("operatie nesuportata");

    }

    @Override
    public AbstractElementTransport getChild(int index) {
        throw new RuntimeException("operatie nesuportata");

    }
}
