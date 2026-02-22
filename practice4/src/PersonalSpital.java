public abstract class PersonalSpital {
    private String nume;
    private TipPersonal tipPersonal;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public PersonalSpital(String nume, TipPersonal tipPersonal) {
        this.nume = nume;
        this.tipPersonal = tipPersonal;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", tipPersonal=" + tipPersonal +
                '}';
    }
}
