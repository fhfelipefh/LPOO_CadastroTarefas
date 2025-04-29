package view;

import controller.TaskController;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Task;

public class TasksJF extends javax.swing.JFrame {

    private ArrayList<Task> tasksList = new ArrayList<>();

    private void loadTasks() {
        DefaultListModel<Task> model = new DefaultListModel<>();
        tasksList.forEach(model::addElement);
        taskJList.setModel(model);
    }

    public TasksJF() {
        initComponents();
        loadTasks();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskJList = new javax.swing.JList<>();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Organizador de Tarefas");

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitulo.setText("Tarefas Cadastradas");

        jScrollPane1.setViewportView(taskJList);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(this::btnAdicionarActionPerformed);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(this::btnRemoverActionPerformed);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTitulo)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                                                .addComponent(btnRemover)
                            .addGap(18, 18, 18)
                                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdicionar)
                                        .addComponent(btnRemover)
                                        .addComponent(btnEditar))
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterTaskJD cadastro = new RegisterTaskJD(this, true);
        cadastro.setVisible(true);

        Task novaTask = cadastro.getTask();
        if (novaTask == null)
            return;

        TaskController controller = new TaskController();
        tasksList = (ArrayList<Task>) controller.addTask(novaTask, tasksList);

        loadTasks();
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        int idx = taskJList.getSelectedIndex();
        if (idx == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para remover.",
                    "Nenhuma seleção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Task selecionada = taskJList.getModel().getElementAt(idx);
        int confirm = JOptionPane.showConfirmDialog(this,
                "Remover a tarefa \"" + selecionada.getName() + "\"?",
                "Confirmar remoção", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION)
            return;

        TaskController controller = new TaskController();
        tasksList = (ArrayList<Task>) controller.removeTask(selecionada, tasksList);

        loadTasks();
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        int idx = taskJList.getSelectedIndex();
        if (idx == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para editar.",
                    "Nenhuma seleção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Task selecionada = taskJList.getModel().getElementAt(idx);

        RegisterTaskJD editar = new RegisterTaskJD(this, true, selecionada);
        editar.setVisible(true);

        Task alterada = editar.getTask();
        if (alterada == null)
            return;

        TaskController controller = new TaskController();
        tasksList = (ArrayList<Task>) controller.editTask(selecionada, alterada, tasksList);

        loadTasks();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TasksJF().setVisible(true));
    }

    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Task> taskJList;
}
