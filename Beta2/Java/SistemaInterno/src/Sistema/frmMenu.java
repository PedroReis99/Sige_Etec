/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import static Sistema.frmLogin.CodEscola;
import static Sistema.frmLogin.Escola;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
        
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/LogoSige1.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEscola = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnMatricula = new javax.swing.JMenuItem();
        btnConsultas = new javax.swing.JMenuItem();
        btnOcorrencias = new javax.swing.JMenuItem();
        btnBoletim = new javax.swing.JMenuItem();
        btnRematricula = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnTransferencia = new javax.swing.JMenuItem();
        btnSolicitacao = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnTurmas = new javax.swing.JMenu();
        btnCadastoTurma = new javax.swing.JMenuItem();
        btnGerencia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenCadUser = new javax.swing.JMenuItem();
        btnAtualizar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fundo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/IconeMenu.png"))); // NOI18N

        lblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData.setText("Data:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário:");

        lblUsuario1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario1.setText("Usuário:");

        lblData1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData1.setText("Data:");

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Bem Vindo a escola:");

        lblEscola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEscola.setText("Nome da escola");

        jMenu1.setText("MENU");

        jMenu3.setText("ALUNOS ");

        btnMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btnMatricula.setText("MATRÍCULA");
        btnMatricula.setEnabled(false);
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });
        jMenu3.add(btnMatricula);

        btnConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnConsultas.setText("CONSULTA");
        btnConsultas.setEnabled(false);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jMenu3.add(btnConsultas);

        btnOcorrencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        btnOcorrencias.setText("OCORRÊNCIAS");
        btnOcorrencias.setEnabled(false);
        btnOcorrencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcorrenciasActionPerformed(evt);
            }
        });
        jMenu3.add(btnOcorrencias);

        btnBoletim.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnBoletim.setText("BOLETIM");
        btnBoletim.setEnabled(false);
        btnBoletim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletimActionPerformed(evt);
            }
        });
        jMenu3.add(btnBoletim);

        btnRematricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        btnRematricula.setText("REMATRICULA");
        btnRematricula.setEnabled(false);
        btnRematricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRematriculaActionPerformed(evt);
            }
        });
        jMenu3.add(btnRematricula);

        jMenu5.setText("TRANSFERÊNCIA");

        btnTransferencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnTransferencia.setText("TRANSFERÊNCIA");
        btnTransferencia.setEnabled(false);
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });
        jMenu5.add(btnTransferencia);

        btnSolicitacao.setText("SOLICITAÇÃO DE TRANSFERÊNCIA");
        btnSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoActionPerformed(evt);
            }
        });
        jMenu5.add(btnSolicitacao);

        jMenu3.add(jMenu5);

        jMenu1.add(jMenu3);

        jMenu4.setText("ESCOLA");

        btnTurmas.setText("TURMAS");
        btnTurmas.setEnabled(false);

        btnCadastoTurma.setText("CADASTRAR");
        btnCadastoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastoTurmaActionPerformed(evt);
            }
        });
        btnTurmas.add(btnCadastoTurma);

        btnGerencia.setText("GERENCIAR");
        btnGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciaActionPerformed(evt);
            }
        });
        btnTurmas.add(btnGerencia);

        jMenu4.add(btnTurmas);

        jMenu1.add(jMenu4);

        jMenu2.setText("USUÁRIOS");

        MenCadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        MenCadUser.setText("CADASTRAR");
        MenCadUser.setEnabled(false);
        MenCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadUserActionPerformed(evt);
            }
        });
        jMenu2.add(MenCadUser);

        btnAtualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jMenu2.add(btnAtualizar);

        jMenu1.add(jMenu2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("SAIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)
                        .addComponent(lblEscola))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData1)
                            .addComponent(lblUsuario1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData)
                                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblData1)
                .addGap(17, 17, 17)
                .addComponent(lblData)
                .addGap(18, 18, 18)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblEscola))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadUserActionPerformed
//        frmCadastro Cad = new frmCadastro();
//        Cad.setVisible(true);
//        this.dispose();
                DFrmCadastro DCad = new DFrmCadastro(null, rootPaneCheckingEnabled);
                DCad.setVisible(true);
    }//GEN-LAST:event_MenCadUserActionPerformed

    private void btnRematriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRematriculaActionPerformed
       DfrmRematricula RM = new DfrmRematricula(null, rootPaneCheckingEnabled);
       RM.setVisible(true);
    }//GEN-LAST:event_btnRematriculaActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        DFrmConsultas dc = new DFrmConsultas(null, rootPaneCheckingEnabled);
        dc.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        DFrmMatricula dm = new DFrmMatricula(null, rootPaneCheckingEnabled);
        dm.setVisible(true);
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void btnOcorrenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcorrenciasActionPerformed
       DFrmOcorrencias Do = new DFrmOcorrencias(null, rootPaneCheckingEnabled);
       Do.setVisible(true);
    }//GEN-LAST:event_btnOcorrenciasActionPerformed

    private void btnBoletimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletimActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        DfrmTransferencia dt = new DfrmTransferencia(null, rootPaneCheckingEnabled);
        dt.setVisible(true);
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if( sair == JOptionPane.YES_OPTION){
                frmLogin fl = new frmLogin();
        fl.setVisible(true);
        this.dispose();
        CodEscola = "";
        Escola = "";
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //O codigo abaixo vai setar a variavel lblData com a data atual apresentada no sistema
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.MEDIUM);
        lblData.setText(formatador.format(data));
        //lblData.setText(data.toString());
        // O timer Inicia o relógio no sistema
        Timer timer = new Timer(0, new hora());
        timer.start();
        
        lblEscola.setText(Escola);
    }//GEN-LAST:event_formWindowActivated

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        DFrmAtualizacaoFunc dfa = new DFrmAtualizacaoFunc(null, rootPaneCheckingEnabled);
        dfa.setVisible(true);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCadastoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastoTurmaActionPerformed
        DfrmCadastroTurmas cdt = new DfrmCadastroTurmas(null, rootPaneCheckingEnabled);
        cdt.setVisible(true);
    }//GEN-LAST:event_btnCadastoTurmaActionPerformed

    private void btnGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciaActionPerformed
        DfrmConsultaTurma ct = new DfrmConsultaTurma(null, rootPaneCheckingEnabled);
        ct.setVisible(true);
    }//GEN-LAST:event_btnGerenciaActionPerformed

    private void btnSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoActionPerformed
        DFrmSolicitaTransferencia ds = new DFrmSolicitaTransferencia(null, rootPaneCheckingEnabled);
        ds.setVisible(true);
    }//GEN-LAST:event_btnSolicitacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                 // O código abaixo muda o estilo da tela.
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
             
            }
//            Properties props = new Properties();
//            props.put("logoString", "");
//            SmartLookAndFeel.setCurrentTheme(props);
//            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem MenCadUser;
    private javax.swing.JMenuBar Menu;
    public static javax.swing.JMenuItem btnAtualizar;
    public static javax.swing.JMenuItem btnBoletim;
    private javax.swing.JMenuItem btnCadastoTurma;
    public static javax.swing.JMenuItem btnConsultas;
    private javax.swing.JMenuItem btnGerencia;
    public static javax.swing.JMenuItem btnMatricula;
    public static javax.swing.JMenuItem btnOcorrencias;
    public static javax.swing.JMenuItem btnRematricula;
    private javax.swing.JMenuItem btnSolicitacao;
    public static javax.swing.JMenuItem btnTransferencia;
    public static javax.swing.JMenu btnTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblEscola;
    private javax.swing.JLabel lblHora;
    public static javax.swing.JLabel lblUsuario;
    public static javax.swing.JLabel lblUsuario1;
    // End of variables declaration//GEN-END:variables


    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
