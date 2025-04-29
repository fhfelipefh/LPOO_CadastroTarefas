package model;

import java.util.Objects;
import java.util.UUID;

public class Task {

    private final UUID id;
    private String name;
    private String description;
    private boolean isCompleted;
    private TaskType taskType;

    public Task(String name, String description, boolean isCompleted, TaskType taskType) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.isCompleted = isCompleted;
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Tarefa: " + "Nome: " + name + " | Descrição: " + description + " | Concluído: " + isCompleted + " | Tipo: " + taskType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
