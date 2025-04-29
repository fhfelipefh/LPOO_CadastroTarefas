package view;

import controller.TaskController;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

public class TasksJF extends JFrame {

    private final ArrayList<Task> tasksList = new ArrayList<>();
    private final TaskController controller = new TaskController();

    private JTable taskTable;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JButton btnEditar;

    public TasksJF() {
        super("Organizador de Tarefas");
        initComponents();
        loadTasks();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        btnAdicionar = new JButton("Adicionar");
        btnRemover = new JButton("Remover");
        btnEditar = new JButton("Editar");
        btnAdicionar.addActionListener(e -> onAdd());
        btnRemover.addActionListener(e -> onRemove());
        btnEditar.addActionListener(e -> onEdit());

        JPanel topPanel = new JPanel();
        topPanel.add(btnAdicionar);
        topPanel.add(btnRemover);
        topPanel.add(btnEditar);

        taskTable = new JTable();
        JScrollPane scroll = new JScrollPane(taskTable);

        getContentPane().setLayout(new BorderLayout(5, 5));
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(scroll, BorderLayout.CENTER);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700, 400);
    }

    private void loadTasks() {
        TaskTableModel model = new TaskTableModel(tasksList);
        taskTable.setModel(model);

        taskTable.getColumnModel()
                .getColumn(3)
                .setCellEditor(new DefaultCellEditor(new JCheckBox()));

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(SwingConstants.CENTER);
        taskTable.getColumnModel()
                .getColumn(3)
                .setCellRenderer(center);
    }

    private void onAdd() {
        RegisterTaskJD dlg = new RegisterTaskJD(this, true);
        dlg.setVisible(true);
        Task t = dlg.getTask();
        if (t != null) {
            controller.addTask(t, tasksList);
            loadTasks();
        }
    }

    private void onRemove() {
        int row = taskTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma tarefa para remover.",
                    "Nenhuma seleção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Task t = tasksList.get(row);
        int resp = JOptionPane.showConfirmDialog(this,
                "Deseja remover a tarefa \"" + t.getName() + "\"?",
                "Confirmar remoção",
                JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            controller.removeTask(t, tasksList);
            loadTasks();
        }
    }

    private void onEdit() {
        int row = taskTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma tarefa para editar.",
                    "Nenhuma seleção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Task original = tasksList.get(row);
        RegisterTaskJD dlg = new RegisterTaskJD(this, true, original);
        dlg.setVisible(true);
        Task updated = dlg.getTask();
        if (updated != null) {
            controller.editTask(original, updated, tasksList);
            loadTasks();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TasksJF().setVisible(true));
    }
}
