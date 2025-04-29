package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 * TableModel para exibir List<Task> em uma JTable com colunas:
 * [0] Nome, [1] Descrição, [2] Categoria, [3] Concluída.
 */
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

    /**
     * Informa à JTable qual é o tipo de dado de cada coluna:
     * - col 3 é Boolean.class, para renderizar um JCheckBox
     * - as demais são String.class
     */
    @Override
    public Class<?> getColumnClass(int col) {
        switch(col) {
            case 3:
                return Boolean.class;
            default: return String.class;
        }
    }

    /**
     * Define quais células são editáveis:
     * - apenas coluna 3 (o checkbox) é alterável diretamente na tabela
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 3;
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

    /**
     * Quando edita uma célula editável, a JTable chama este método.
     * Se for a coluna 3, alterar o campo `completed` na Task.
     * Evento para a tabela redesenhar essa linha.
     */
    @Override
    public void setValueAt(Object aValue, int row, int col) {
        Task t = tasks.get(row);
        if (col == 3) {
            t.setIsCompleted((Boolean)aValue);
            fireTableCellUpdated(row, 3);
        }
    }
}
