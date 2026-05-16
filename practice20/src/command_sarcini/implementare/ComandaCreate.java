package command_sarcini.implementare;

public class ComandaCreate implements ICommand{

    TaskManager taskManager;
    Task task;

    public ComandaCreate(Task task,TaskManager taskManager) {
        this.task = task;
        this.taskManager=taskManager;
    }


    @Override
    public void execute() {
        taskManager.adauga(task);
        System.out.println("the task has been created");
    }
}
