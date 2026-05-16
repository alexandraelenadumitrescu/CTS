package command_stb.implementare;

public class InchideUsaFata implements ICommand{
    UsaFata usaFata;

    public InchideUsaFata(UsaFata usaFata) {
        this.usaFata = usaFata;
    }

    @Override
    public void execute() {
        this.usaFata.inchide();
    }
}
