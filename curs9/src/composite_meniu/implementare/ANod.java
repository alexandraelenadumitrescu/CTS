package composite_meniu.implementare;



public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getPret();

    public String getInfo(int nivel) {
        return "  ".repeat(nivel) + getDenumire() + " - " + getPret() + " RON";
    }

    public void adaugaNod(ANod elemStructura) {
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elemStructura) {
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i) {
        throw new UnsupportedOperationException();
    }
}