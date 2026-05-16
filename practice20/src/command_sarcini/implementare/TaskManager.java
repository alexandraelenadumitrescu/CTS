package command_sarcini.implementare;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskuri=new ArrayList<>();
    public void completeaza()
    {
        for(Task t: taskuri){
            t.setItCompleted(true);
        }
    }
    public void sterge(){
        for(Task t: taskuri){
            taskuri.remove(t);
        }
    }

    public void adauga(Task t){
        taskuri.add(t);
    }

}
