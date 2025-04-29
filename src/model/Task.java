package model;

public class Task {
    
    private int id;
    private String name;
    private String description;
    private boolean isCompleted;
    private TaskType taskType;

    public Task(String name, String description, boolean isCompleted, TaskType taskType) {
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

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    @Override
    public String toString() {
        return "Tarefa: " + "Nome: " + name + " | Descrição: " + description + " | Concluído: " + isCompleted + " | Tipo: " + taskType;
    }

    
  
}
