package view;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 * ButtonEditor:
 * Estende DefaultCellEditor para transformar uma célula em um editor
 * que usa JButton. Ao clicar no botão, alterna o estado “concluída”
 * no TaskTableModel.
 */
public class ButtonEditor extends DefaultCellEditor {
    private final JButton button;
    private String label;
    private boolean clicked;
    private int row;
    private final JTable table;

    public ButtonEditor(JTable table) {
        super(new JCheckBox());
        this.table = table;
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(e -> fireEditingStopped());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table,
                                                 Object value,
                                                 boolean isSelected,
                                                 int row,
                                                 int column)
    {
        this.label = value == null ? "" : value.toString();
        button.setText(label);
        this.clicked = true;
        this.row = row;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (clicked) {
            TaskTableModel model = (TaskTableModel) table.getModel();
            Boolean atual = (Boolean) model.getValueAt(row, 3);
            model.setValueAt(!atual, row, 3);
        }
        clicked = false;
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing();
    }
}
