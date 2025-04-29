package view;

import javax.swing.SwingUtilities;
import model.Task;

/**
 * Janela principal com menu para abrir a tela de tarefas.
 */
public class Main extends javax.swing.JFrame {

    // instancia única da janela de tarefas, para não perder o estado
    private final TasksJF tasksWindow = new TasksJF();

    /**
     * Cria a Main e posiciona no centro.
     */
    public Main() {
        initComponents();
        setTitle("Organizador de Tarefas");
        setLocationRelativeTo(null);
    }

    /**
     * Este método é chamado pelo GUI Builder. NÃO REMOVA nem altere
     * os comentários //<editor-fold…> e                         
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabelTotalTarefas = new javax.swing.JLabel();
        jLabelTarefasCompletas = new javax.swing.JLabel();
        jProgressBarTarefasCompletas = new javax.swing.JProgressBar();
        jLabelTotalTarefasValue = new javax.swing.JLabel();
        jButtonReloadDashboard = new javax.swing.JButton();
        jLabelCompleted = new javax.swing.JLabel();
        jLabelNotCompleted = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNotCompletedTasks = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCompletedTasks1 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        miTarefa = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTotalTarefas.setText("Total de tarefas:");

        jLabelTarefasCompletas.setText("Concluídas:");

        jLabelTotalTarefasValue.setText("0");

        jButtonReloadDashboard.setText("Recarregar total de tarefas");
        jButtonReloadDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReloadDashboardActionPerformed(evt);
            }
        });

        jLabelCompleted.setText("Concluidas");

        jLabelNotCompleted.setText("Não concluídas");

        jScrollPane1.setViewportView(jListNotCompletedTasks);

        jScrollPane2.setViewportView(jListCompletedTasks1);

        menuCadastro.setText("Cadastro");

        miTarefa.setText("Tarefa");
        miTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTarefaActionPerformed(evt);
            }
        });
        menuCadastro.add(miTarefa);

        jMenuBar1.add(menuCadastro);

        menuAjuda.setText("Ajuda");

        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(miSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotalTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotalTarefasValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTarefasCompletas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBarTarefasCompletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonReloadDashboard)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabelNotCompleted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalTarefas)
                    .addComponent(jLabelTotalTarefasValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBarTarefasCompletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTarefasCompletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompleted)
                    .addComponent(jLabelNotCompleted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButtonReloadDashboard)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReloadDashboardActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonReloadDashboardActionPerformed
        // TODO add your handling code here:
        // atualiza o total de tarefas na tela principal
        jLabelTotalTarefasValue.setText(String.valueOf(tasksWindow.getTotalTarefas()));
        // atualiza a barra de progresso com o total de tarefas concluídas
        jProgressBarTarefasCompletas.setMaximum(tasksWindow.getTotalTarefas());
        jProgressBarTarefasCompletas.setValue(tasksWindow.getTotalTarefasConcluidas());
        jProgressBarTarefasCompletas
                .setString(tasksWindow.getTotalTarefasConcluidas() + " / " + tasksWindow.getTotalTarefas());

        // atualiza a lista de tarefas concluídas
        Task[] arr = tasksWindow.getTarefas(true).toArray(new Task[0]);
        jListCompletedTasks1.setListData(arr);

        // atualiza a lista de tarefas não concluídas
        arr = tasksWindow.getTarefas(false).toArray(new Task[0]);
        jListNotCompletedTasks.setListData(arr);

    }// GEN-LAST:event_jButtonReloadDashboardActionPerformed

    /**
     * Handler do menu “Cadastro → Tarefa”
     */
    private void miTarefaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_miTarefaActionPerformed
        tasksWindow.setVisible(true);
        // atualiza o total de tarefas na tela principal
        jLabelTotalTarefasValue.setText(String.valueOf(tasksWindow.getTotalTarefas()));

        // atualiza a barra de progresso com o total de tarefas concluídas
        jProgressBarTarefasCompletas.setMaximum(tasksWindow.getTotalTarefas());
        jProgressBarTarefasCompletas.setValue(tasksWindow.getTotalTarefasConcluidas());
        jProgressBarTarefasCompletas
                .setString(tasksWindow.getTotalTarefasConcluidas() + " / " + tasksWindow.getTotalTarefas());

    }// GEN-LAST:event_miTarefaActionPerformed

    /**
     * Handler do menu “Ajuda → Sobre”
     */
    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_miSobreActionPerformed
        AboutJD dialogSobre = new AboutJD(this, true);
        dialogSobre.setVisible(true);
    }// GEN-LAST:event_miSobreActionPerformed

    /**
     * Ponto de entrada da aplicação.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }

    // Variáveis declaradas pelo GUI Builder — NÃO REMOVA nem altere estes
    // comentários
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonReloadDashboard;
    private javax.swing.JLabel jLabelCompleted;
    private javax.swing.JLabel jLabelNotCompleted;
    private javax.swing.JLabel jLabelTarefasCompletas;
    private javax.swing.JLabel jLabelTotalTarefas;
    private javax.swing.JLabel jLabelTotalTarefasValue;
    private javax.swing.JList<Task> jListCompletedTasks1;
    private javax.swing.JList<Task> jListNotCompletedTasks;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBarTarefasCompletas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miTarefa;
    // End of variables declaration//GEN-END:variables
}
