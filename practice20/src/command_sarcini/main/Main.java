package command_sarcini.main;

import command_sarcini.implementare.*;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager=new TaskManager();
        ICommand commandCreate=new ComandaCreate(new Task(),taskManager);
        Invoker invoker=new Invoker();
        invoker.completeaza();
    }
}
