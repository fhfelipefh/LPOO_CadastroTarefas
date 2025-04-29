package controller;

import java.util.List;
import model.Task;


public class TaskController {
    public List<Task> addTask(Task task, List<Task> listTasks){
        listTasks.add(task);
        return listTasks;
    }
}
