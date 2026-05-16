package command_stb.implementare;

import command_sarcini.implementare.ICommand;

public class DeschideUsaFata implements ICommand {
    UsaFata usaFata;

    public DeschideUsaFata(UsaFata usaFata) {
        this.usaFata = usaFata;
    }

    @Override
    public void execute() {
        usaFata.deschide();
    }
}
