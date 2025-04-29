package controller;

import java.util.List;
import model.Task;

public class TaskController {

    public List<Task> addTask(Task task, List<Task> listTasks) {
        listTasks.add(task);
        return listTasks;
    }

    public List<Task> removeTask(Task task, List<Task> listTasks) {
        listTasks.remove(task);
        return listTasks;
    }

    public List<Task> editTask(Task oldTask, Task updatedTask, List<Task> listTasks) {
        int index = listTasks.indexOf(oldTask);
        if (index != -1) {
            listTasks.set(index, updatedTask);
        }
        return listTasks;
    }
}
