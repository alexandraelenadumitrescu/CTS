package command_sarcini.implementare;

public class ComandaDelete implements ICommand{
    @Override
    public void execute() {
        System.out.println("the task has been deleted");
    }
}
