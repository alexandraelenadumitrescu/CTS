package command_stb.implementare;

public class DeschideUsaMijloc implements ICommand{
    UsaMijloc usaMijloc;

    public DeschideUsaMijloc(UsaMijloc usaMijloc) {
        this.usaMijloc = usaMijloc;
    }

    @Override
    public void execute() {
        usaMijloc.deschide();
    }
}
