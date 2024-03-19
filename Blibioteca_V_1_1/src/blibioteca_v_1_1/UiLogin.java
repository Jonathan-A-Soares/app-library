/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blibioteca_v_1_1;

import java.awt.Color;
import java.io.Closeable;
import javax.swing.JOptionPane;

/**
 *
 * @author bruxo
 */
public class UiLogin extends javax.swing.JFrame {

    /**
     * Creates new form UiLogin
     */
    public UiLogin() {
        initComponents();
        setResizable(false); //desabilitar o redimensionamento
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bnt_entrar = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputpPass = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        bemvindo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        event = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Bem Vindo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        bnt_entrar.setText("Entrar");
        bnt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_entrarActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setText("Login");

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        name.setText("Nome :");

        senha.setText("Senha:");

        bemvindo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bemvindo.setText("Bem Vindo");

        jLabel1.setText("Version");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Esqueci senha");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 121, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bemvindo)
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bnt_entrar)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(senha)
                                            .addComponent(inputpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(name)
                                    .addComponent(login)
                                    .addComponent(event))
                                .addGap(123, 123, 123))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(bemvindo)
                .addGap(28, 28, 28)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senha)
                .addGap(2, 2, 2)
                .addComponent(inputpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnt_entrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(event)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_entrarActionPerformed
        String name = inputName.getText();
        String pass = inputpPass.getText();
        event.setForeground(Color.red);

        if (name.isEmpty() | pass.isEmpty()) { // verifica se tem algum campo em branco
            //System.out.println("\u001B[31m" + "Prencha todos os campos");
            //JOptionPane.showMessageDialog(null, "Prencha todos os campos ", "Erro ao entrar", JOptionPane.ERROR_MESSAGE);
            event.setText("Prencha todos os campos");
        } else { //todos campos estao prenchidos
            String auth = Users.Authentic(name, pass);// retorna poo_06 se autorizado e poo_007 se nao autorizado

            //verificando se usurio vai ser autenticado com credenciais digitadas
            if (auth.equals("poo_07") | auth.equals("poo_02")) {
                //System.err.println(auth);
                Users.verErr(auth); //funçao que printa retorno da funçao
                //JOptionPane.showMessageDialog(null, "Credeciais Errada", "Erro ao entrar", JOptionPane.ERROR_MESSAGE);
                event.setText("Credeciais Errada");
            } else if (auth.equals("poo_06")) { //login realizado

                String perm = Users.EspecificDateUser(name, "permission");
                if (perm.equals("true")) {// quando usuario e adm disponibiliza o painel de administrador
                    
                    //System.out.println("Usuario e adm");
                    
                    setVisible(false);// tira visibilidade do login
                    new UIPainelAdm(name).setVisible(true); // chama a painel de usuario deixa visivel
                    
                    
                } else {// quando o usuario nao e adm disponibiliza painel de usuario
                    System.out.println("Usuario n e adm");
                    System.exit(0); // no momento finaliza progama

                }

                //System.out.println("\u001B[32m"+"login efetuado com sucesso!");
                Users.verErr(auth);//funçao que printa retorno da funçao

            } else {
                //System.out.println("\u001B[31m"+"Erro inesperado "+auth);
                event.setText(auth);
                Users.verErr(auth);
            }
        }

    }//GEN-LAST:event_bnt_entrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new UiRegister().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new UiRepassword().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemvindo;
    private javax.swing.JButton bnt_entrar;
    private javax.swing.JLabel event;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputpPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel login;
    private javax.swing.JLabel name;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
