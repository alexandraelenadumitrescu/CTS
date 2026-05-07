package flyweight.implementare;

import java.util.List;

public class Reteta {
    private int id;
    private String diagnostic;
    private List<String> medicamente;

    public Reteta(int id, String diagnostic, List<String> medicamente) {
        this.id = id;
        this.diagnostic = diagnostic;
        this.medicamente = medicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "id=" + id +
                ", diagnostic='" + diagnostic + '\'' +
                ", medicamente=" + medicamente +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }
}
