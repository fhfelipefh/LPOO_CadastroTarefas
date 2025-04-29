package view;

import javax.swing.SwingUtilities;

public class Main extends javax.swing.JFrame {
    private final TasksJF tasksWindow = new TasksJF();

    public Main() {
        initComponents();
        setTitle("Organizador de Tarefas");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        miTarefa = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastro");

        miTarefa.setText("Tarefa");
        miTarefa.addActionListener(this::miTarefaActionPerformed);
        menuCadastro.add(miTarefa);

        jMenuBar1.add(menuCadastro);

        menuAjuda.setText("Ajuda");

        miSobre.setText("Sobre");
        miSobre.addActionListener(this::miSobreActionPerformed);
        menuAjuda.add(miSobre);

        jMenuBar1.add(menuAjuda);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        pack();
    }

    private void miTarefaActionPerformed(java.awt.event.ActionEvent evt) {
        tasksWindow.setVisible(true);
    }

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {
        AboutJD dialogSobre = new AboutJD(this, true);
        dialogSobre.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }

    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem miTarefa;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem miSobre;
}
