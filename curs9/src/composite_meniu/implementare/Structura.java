package composite_meniu.implementare;



import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod {
    private List<ANod> structura = new ArrayList<>();
    private String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo(int nivel) {
        StringBuilder info = new StringBuilder();
        info.append("  ".repeat(nivel)).append(numeStructura).append("\n");
        for (ANod n : structura) {
            info.append(n.getInfo(nivel + 1)).append("\n");
        }
        return info.toString();
    }

    @Override
    public void adaugaNod(ANod elemStructura) {
        structura.add(elemStructura);
    }

    @Override
    public void eliminaNod(ANod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}