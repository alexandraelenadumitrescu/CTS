package composite_vapor.implementare;


import java.util.ArrayList;
import java.util.List;

public class Container extends ANod {
    private String numeContainer;
    private List<ANod> noduri = new ArrayList<>();

    public Container(String numeContainer) {
        this.numeContainer = numeContainer;
    }

    @Override
    public double getGreutate() {
        double total = 0;
        for (ANod nod : noduri) {
            total += nod.getGreutate();
        }
        return total;
    }

    @Override
    public boolean esteFragil() {
        for (ANod nod : noduri) {
            if (nod.esteFragil()) {
                return true; // un colet fragil => containerul e fragil
            }
        }
        return false;
    }

    @Override
    public String getInfo(int nivel) {
        StringBuilder info = new StringBuilder();
        info.append("  ".repeat(nivel))
                .append("Container [").append(numeContainer).append("] - ")
                .append(getGreutate()).append(" kg - ")
                .append(esteFragil() ? "FRAGIL" : "normal")
                .append("\n");
        for (ANod nod : noduri) {
            info.append(nod.getInfo(nivel + 1)).append("\n");
        }
        return info.toString();
    }

    @Override
    public void adaugaNod(ANod nod) {
        noduri.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        noduri.remove(nod);
    }

    @Override
    public ANod getNod(int i) {
        return noduri.get(i);
    }
}