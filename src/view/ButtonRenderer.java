package view;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * ButtonRenderer:
 * Implementa TableCellRenderer para exibir, em cada célula,
 * um JButton cujo texto corresponde ao valor da célula.
 */
public class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }

    /**
     * Este método é chamado sempre que a tabela precisa renderizar
     * uma célula nesta coluna.
     *
     * @param table      A JTable que está solicitando a renderização.
     * @param value      O valor da célula.
     * @param isSelected Se a linha está selecionada.
     * @param hasFocus   Se a célula está com foco.
     * @param row        Índice da linha.
     * @param column     Índice da coluna.
     * @return O componente pronto para ser desenhado.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table,
                                                   Object value,
                                                   boolean isSelected,
                                                   boolean hasFocus,
                                                   int row,
                                                   int column)
    {
        setText(value == null ? "" : value.toString());
        return this;
    }
}
