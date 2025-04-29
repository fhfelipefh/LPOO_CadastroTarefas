package controller;

import java.util.List;
import model.Task;

public class TaskController {

    // Adiciona uma tarefa à lista de tarefas
    public List<Task> addTask(Task task, List<Task> listTasks) {
        listTasks.add(task);
        return listTasks;
    }

    // Remove uma tarefa da lista de tarefas, a função remove da classe List já
    // remove o elemento utilizando o equals, então não é necessário fazer a
    // comparação manualmente
    public List<Task> removeTask(Task task, List<Task> listTasks) {
        listTasks.remove(task);
        return listTasks;
    }

    // Edita uma tarefa na lista de tarefas, a função set da classe List já
    // substitui o elemento na posição do índice, então não é necessário fazer a
    // comparação manualmente
    public List<Task> editTask(Task oldTask, Task updatedTask, List<Task> listTasks) {
        int index = listTasks.indexOf(oldTask);
        if (index != -1) {
            listTasks.set(index, updatedTask);
        }
        return listTasks;
    }
}
