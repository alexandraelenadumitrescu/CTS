package composite_vapor.implementare;



public abstract class ANod {
    public abstract double getGreutate();
    public abstract boolean esteFragil();

    public String getInfo(int nivel) {
        return "  ".repeat(nivel) + "[" + (esteFragil() ? "FRAGIL" : "normal") + "] "
                + getClass().getSimpleName() + " - " + getGreutate() + " kg";
    }

    public void adaugaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i) {
        throw new UnsupportedOperationException();
    }
}