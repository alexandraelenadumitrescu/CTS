package command_stb.implementare;

public class InchideUsaMijloc implements ICommand{
    private UsaMijloc usaMijloc;

    public InchideUsaMijloc(UsaMijloc usaMijloc) {
        this.usaMijloc = usaMijloc;
    }

    @Override
    public void execute() {
        usaMijloc.inchide();
    }
}
