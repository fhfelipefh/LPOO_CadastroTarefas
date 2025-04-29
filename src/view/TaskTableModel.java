package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

public class TaskTableModel extends AbstractTableModel {
    private final String[] colNames = {"Nome", "Descrição", "Categoria", "Concluída"};
    private final List<Task> tasks;

    public TaskTableModel(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return colNames[col];
    }

    @Override
    public Class<?> getColumnClass(int col) {
        switch(col) {
            case 3: return Boolean.class;
            case 4: return String.class;
            default: return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 3 || col == 4;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Task t = tasks.get(row);
        switch(col) {
            case 0: return t.getName();
            case 1: return t.getDescription();
            case 2: return t.getTaskType().name();
            case 3: return t.isCompleted();
            default: return "";
        }
    }

    @Override
    public void setValueAt(Object aValue, int row, int col) {
        Task t = tasks.get(row);
        if (col == 3) {
            t.setIsCompleted((Boolean)aValue);
            fireTableCellUpdated(row, 4);
        }
    }
}
