package Sistema;

import Bean.LoginBean;
import Conector.MetodoConexao;
import Controller.ControleLogin;
import Controller.ControleRegistro;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class frmLogin extends javax.swing.JFrame {
    
    
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    
    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        conexao = MetodoConexao.conector();

        //O método abaixo altera o icone do formulario.
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/LogoSige1.png")).getImage());
    }
    
    public static String CodEscola, Escola, Matricula, cpf,Nome, Funcao;
    
    public void Login(){
        
        LoginBean lb = new LoginBean();
        
        lb.setUsuario(txtUsuario.getText());
        lb.setSenha(txtSenha.getText());
        
        ControleLogin cl = new ControleLogin();
        cl.Logar(lb);
        
        CodEscola = lb.getCodEscola();
        Escola = lb.getEscola();
        Nome = lb.getNomeFunc();
        Funcao = lb.getFuncao();
        cpf = lb.getCpf();
        
        if(Funcao.equals("Diretor(a)")){
// esse if vai verificar no banco de dados, se existe na tabela Login no campo perfil, a função de diretor.
                        frmMenu mn = new frmMenu();
                        mn.setVisible(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnMatricula.setEnabled(true);
                        frmMenu.btnBoletim.setEnabled(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnTransferencia.setEnabled(true);
                        frmMenu.btnConsultas.setEnabled(true);
                        frmMenu.MenCadUser.setEnabled(true);
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnRematricula.setEnabled(true);
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnAtualizar.setEnabled(true);
                        //seta o nome do usuario e muda a cor caso seja diretor
                        frmMenu.lblUsuario.setText(Nome);
                        frmMenu.lblUsuario.setForeground(Color.red);

                        Registro();
                        this.dispose();
                        
                        JOptionPane.showMessageDialog(null, "VOCÊ REALIZOU LOGIN NA ESCOLA: " + Escola,"Aviso", 
               JOptionPane.WARNING_MESSAGE);
                        }
        else if(Funcao.equals("Coordenador(a)")){
//Esse else if faz com que todos os logins,que não possuem o campo perfil preenchido,possam acessar o menu do sistema,
//com suas limitações.
                           
                        frmMenu mn = new frmMenu();
                        mn.setVisible(true);                                        
                        frmMenu.btnMatricula.setEnabled(true);
                        frmMenu.btnBoletim.setEnabled(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnTransferencia.setEnabled(true);
                        frmMenu.btnConsultas.setEnabled(true);
                        frmMenu.btnRematricula.setEnabled(true);
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnAtualizar.setEnabled(true);
                        //seta o nome do usuario
                        frmMenu.lblUsuario.setText(Nome);
                        
                        Registro();
                        this.dispose();
                        
                        JOptionPane.showMessageDialog(null, "VOCÊ REALIZOU LOGIN NA ESCOLA: " + Escola,"Aviso", 
               JOptionPane.WARNING_MESSAGE);
        }
        else if(Funcao.equals("Professor(a)")){
                        
                        frmMenu mn = new frmMenu();
                        mn.setVisible(true);                                        
                        frmMenu.btnBoletim.setEnabled(true);
                        frmMenu.btnConsultas.setEnabled(true);
                        //seta o nome do usuario
                        frmMenu.lblUsuario.setText(Nome);
                        Registro();
                        this.dispose();
                        
                        JOptionPane.showMessageDialog(null, "VOCÊ REALIZOU LOGIN NA ESCOLA: " + Escola,"Aviso", 
               JOptionPane.WARNING_MESSAGE);
        }
        else if(Funcao.equals("Secretario(a)")){
                        
                        frmMenu mn = new frmMenu();
                        mn.setVisible(true);                                        
                        frmMenu.btnMatricula.setEnabled(true);
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnTransferencia.setEnabled(true);
                        frmMenu.btnConsultas.setEnabled(true);
                        frmMenu.btnRematricula.setEnabled(true);
                        //seta o nome do usuario
                        frmMenu.lblUsuario.setText(Nome);
                        Registro();
                        this.dispose();
                        
                        JOptionPane.showMessageDialog(null, "VOCÊ REALIZOU LOGIN NA ESCOLA: " + Escola,"Aviso", 
               JOptionPane.WARNING_MESSAGE);
                        
                            }
        else if(Funcao.equals("Vice-Diretor(a)")){
                        
                        frmMenu mn = new frmMenu();
                        mn.setVisible(true); 
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnMatricula.setEnabled(true);
                        frmMenu.btnBoletim.setEnabled(true);
                        frmMenu.btnTransferencia.setEnabled(true);
                        frmMenu.btnConsultas.setEnabled(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnRematricula.setEnabled(true);
                        frmMenu.btnAtualizar.setEnabled(true);
                        //seta o nome do usuario
                        frmMenu.lblUsuario.setText(Nome);
                        Registro();
                        this.dispose();
                        
                        JOptionPane.showMessageDialog(null, "VOCÊ REALIZOU LOGIN NA ESCOLA:" + Escola,"Aviso", 
               JOptionPane.WARNING_MESSAGE);
                        
                            }
        else{
                    JOptionPane.showMessageDialog(null, "Usuario e/ou senha invalidos!", "AVISO!",
                            JOptionPane.ERROR_MESSAGE);
                                    txtUsuario.setText("");
                                    txtSenha.setText("");
                                    txtUsuario.requestFocus();
                    }
    
    }
    
    public void Registro(){
    
        ControleRegistro CR = new ControleRegistro();
        CR.Adicionar(Matricula, Nome, cpf, CodEscola);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new Estilo.JTextFieldHint(new JTextField(), "user-icon.png", "Nome de Usuario");
        ;
        txtSenha = new Estilo.JPassWordFieldHint(new JPasswordField(), "padlock", "Senha");
        ;
        btnEntrar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAjuda = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE GERENCIAMENTO ESCOLAR");
        setBackground(new java.awt.Color(39, 185, 236));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BEM VINDO!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        txtUsuario.setToolTipText("");

        btnEntrar.setBackground(new java.awt.Color(58, 65, 84));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnFechar.setBackground(new java.awt.Color(217, 51, 51));
        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("SAIR");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFecharMouseExited(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user-icon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/padlock.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Avíso: Utilize seu usuário e senha cadastrados na escola.");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/IconeLogin.jpg"))); // NOI18N

        lblAjuda.setText("Esqueceu sua senha?");
        lblAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAjudaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAjuda)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblAjuda)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Atenção", JOptionPane.YES_NO_OPTION);
        
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setBackground(new Color(235,235,235));
        btnEntrar.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseEntered
        btnFechar.setBackground(new Color(235,235,235));
        btnFechar.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_btnFecharMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setBackground(new Color(58,65,84));
        btnEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseExited
        btnFechar.setBackground(new Color(217,81,51));
        btnFechar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnFecharMouseExited

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       //Login();
       frmMenu mn = new frmMenu();
                        mn.setVisible(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnMatricula.setEnabled(true);
                        frmMenu.btnBoletim.setEnabled(true);
                        frmMenu.btnTurmas.setEnabled(true);
                        frmMenu.btnTransferencia.setEnabled(true);
                        frmMenu.btnConsultas.setEnabled(true);
                        frmMenu.MenCadUser.setEnabled(true);
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnRematricula.setEnabled(true);
                        frmMenu.btnOcorrencias.setEnabled(true);
                        frmMenu.btnAtualizar.setEnabled(true);
                        //seta o nome do usuario e muda a cor caso seja diretor
                        frmMenu.lblUsuario.setText(Nome);
                        frmMenu.lblUsuario.setForeground(Color.red);

                        this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjudaMouseClicked
        
    }//GEN-LAST:event_lblAjudaMouseClicked

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                 
             UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            }
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
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
