package command_sarcini.implementare;

public class ComandaFinish implements ICommand{
    @Override
    public void execute() {
        System.out.println("the task has been marked as completed");
    }
}
