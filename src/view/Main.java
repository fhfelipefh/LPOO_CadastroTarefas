package view;

import javax.swing.SwingUtilities;

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

        jLabelTotalTarefas = new javax.swing.JLabel();
        jLabelTarefasCompletas = new javax.swing.JLabel();
        jProgressBarTarefasCompletas = new javax.swing.JProgressBar();
        jLabelTotalTarefasValue = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        miTarefa = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTotalTarefas.setText("Total de tarefas:");

        jLabelTarefasCompletas.setText("Concluídas:");

        jLabelTotalTarefasValue.setText("0");

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
                        .addComponent(jProgressBarTarefasCompletas, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addContainerGap(389, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabelTarefasCompletas;
    private javax.swing.JLabel jLabelTotalTarefas;
    private javax.swing.JLabel jLabelTotalTarefasValue;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBarTarefasCompletas;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miTarefa;
    // End of variables declaration//GEN-END:variables
}
