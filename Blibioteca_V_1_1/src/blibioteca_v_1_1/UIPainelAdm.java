/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blibioteca_v_1_1;

import java.awt.Container;
import javax.swing.UIManager;

/**
 *
 * @author bruxo
 */
public class UIPainelAdm extends javax.swing.JFrame {

    /**
     * Creates new form UIPainelAdm
     */
    private String name;
    private String numIdent;
    private String perm;

    public UIPainelAdm(String name) {
        this.name = name;
        initComponents();

        numIdent = Users.EspecificDateUser(name, "num_identification");
        perm = Users.EspecificDateUser(name, "permission");

        if (perm.equals("true")) {
            permUser.setText("Adm");
        } else {
            permUser.setText("Visitante");
        }
        identNumUser.setText(numIdent);
        nameUser.setText(name);
        String dateA = Users.getDateTime();
        dateUserPanel.setText(dateA);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nameUser = new javax.swing.JLabel();
        identNumUser = new javax.swing.JLabel();
        dateUserPanel = new javax.swing.JLabel();
        permUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadBook = new javax.swing.JButton();
        cadLend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shearBook = new javax.swing.JButton();
        viweBooksUnavailable = new javax.swing.JButton();
        viewBooks = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cadUser = new javax.swing.JButton();
        viewAllUser = new javax.swing.JButton();
        consultLendUser = new javax.swing.JButton();
        historyUser = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        removBook = new javax.swing.JButton();
        UIWellcomePanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titlePage = new javax.swing.JLabel();
        titlePageWelcome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jButton5.setText("jButton1");

        jButton6.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        nameUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameUser.setText("Nome usuario");

        identNumUser.setText("indent");

        dateUserPanel.setText("date");

        permUser.setText("perm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(permUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(identNumUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateUserPanel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameUser)
                    .addComponent(permUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identNumUser)
                    .addComponent(dateUserPanel))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cadBook.setText("Cadastrar um Livro");
        cadBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadBookActionPerformed(evt);
            }
        });

        cadLend.setText("Cadastrar emprestimos");
        cadLend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadLendActionPerformed(evt);
            }
        });

        jLabel1.setText("Livro");

        shearBook.setText("Pesquisas livro");
        shearBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shearBookActionPerformed(evt);
            }
        });

        viweBooksUnavailable.setText("Ver todos emprestimos");
        viweBooksUnavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viweBooksUnavailableActionPerformed(evt);
            }
        });

        viewBooks.setText("Ver todos livros");
        viewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBooksActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuario");

        cadUser.setText("Cadastrar Usuario");
        cadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUserActionPerformed(evt);
            }
        });

        viewAllUser.setText("Ver todos usuarios");
        viewAllUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllUserActionPerformed(evt);
            }
        });

        consultLendUser.setText("Consulta emprestimo");
        consultLendUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultLendUserActionPerformed(evt);
            }
        });

        historyUser.setText("Historico");
        historyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyUserActionPerformed(evt);
            }
        });

        removBook.setText("Remover livro");
        removBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(viewBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viweBooksUnavailable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadLend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shearBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel5))
                        .addComponent(cadUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewAllUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultLendUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(viewBooks)
                .addGap(18, 18, 18)
                .addComponent(cadBook)
                .addGap(18, 18, 18)
                .addComponent(cadLend)
                .addGap(18, 18, 18)
                .addComponent(viweBooksUnavailable)
                .addGap(18, 18, 18)
                .addComponent(shearBook)
                .addGap(18, 18, 18)
                .addComponent(removBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(cadUser)
                        .addGap(18, 18, 18)
                        .addComponent(viewAllUser)
                        .addGap(18, 18, 18)
                        .addComponent(consultLendUser)))
                .addGap(18, 18, 18)
                .addComponent(historyUser)
                .addGap(56, 56, 56))
        );

        UIWellcomePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LendBook");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bem Vindo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ao");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        titlePage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titlePage.setText("Painel do Administrador");

        javax.swing.GroupLayout UIWellcomePanelLayout = new javax.swing.GroupLayout(UIWellcomePanel);
        UIWellcomePanel.setLayout(UIWellcomePanelLayout);
        UIWellcomePanelLayout.setHorizontalGroup(
            UIWellcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UIWellcomePanelLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UIWellcomePanelLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(titlePage)
                .addGap(193, 193, 193))
        );
        UIWellcomePanelLayout.setVerticalGroup(
            UIWellcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UIWellcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlePage)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titlePageWelcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titlePageWelcome.setText("Bem Vindo");

        jMenu1.setText("Sair");

        jMenuItem2.setText("Fechar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Deslogar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tarifas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIWellcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlePageWelcome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlePageWelcome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UIWellcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadBookActionPerformed
        cadBook.setEnabled(false);
        UIWellcomePanel.setVisible(false);// deixa painel bem vindo invisível

        UiAddBokk newPanel = new UiAddBokk();// crian ovo painel
        newPanel.setBounds(UIWellcomePanel.getBounds()); // Adiciona a painel ao mesmo local do home
        Container parent = UIWellcomePanel.getParent(); // Obtém o painel pai de jPanel3
        parent.remove(UIWellcomePanel); // remove painel bem vindo do painel pai
        parent.add(newPanel);// Adiciona o novo painel ao painel pai 
        parent.revalidate(); // Atualiza o contêiner para refletir as mudanças
        parent.repaint();
        newPanel.setVisible(true);// Torna o novo painel visível
        titlePageWelcome.setText("Adicionar um novo Livro"); // muda titulo 
        
    }//GEN-LAST:event_cadBookActionPerformed

    private void cadLendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadLendActionPerformed
        cadLend.setEnabled(false);
        UIWellcomePanel.setVisible(false);// deixa painel bem vindo invisível

        UiLendBook newPanel = new UiLendBook();// crian ovo painel
        newPanel.setBounds(UIWellcomePanel.getBounds()); // Adiciona a painel ao mesmo local do home
        Container parent = UIWellcomePanel.getParent(); // Obtém o painel pai de jPanel3
        parent.remove(UIWellcomePanel); // remove painel bem vindo do painel pai
        parent.add(newPanel);// Adiciona o novo painel ao painel pai 
        parent.revalidate(); // Atualiza o contêiner para refletir as mudanças
        parent.repaint();
        newPanel.setVisible(true);// Torna o novo painel visível
        titlePageWelcome.setText("Realizar emprestimos"); // muda titulo
    }//GEN-LAST:event_cadLendActionPerformed

    private void shearBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shearBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shearBookActionPerformed

    private void viweBooksUnavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viweBooksUnavailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viweBooksUnavailableActionPerformed

    private void viewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBooksActionPerformed

    private void cadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadUserActionPerformed

    private void viewAllUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAllUserActionPerformed

    private void consultLendUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultLendUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultLendUserActionPerformed

    private void historyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyUserActionPerformed

    private void removBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removBookActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
        //setVisible(false);
        //new UiLogin().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //System.exit(0);
        setVisible(false); // desativa a inteface do ususario
        new UiLogin().setVisible(true); // chama a interface de login
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(UIPainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIPainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIPainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIPainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIPainelAdm("adm").setVisible(true);//volta usuario somente para testes (usuario tem que exitir)
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UIWellcomePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cadBook;
    private javax.swing.JButton cadLend;
    private javax.swing.JButton cadUser;
    private javax.swing.JButton consultLendUser;
    private javax.swing.JLabel dateUserPanel;
    private javax.swing.JButton historyUser;
    private javax.swing.JLabel identNumUser;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameUser;
    private javax.swing.JLabel permUser;
    private javax.swing.JButton removBook;
    private javax.swing.JButton shearBook;
    private javax.swing.JLabel titlePage;
    private javax.swing.JLabel titlePageWelcome;
    private javax.swing.JButton viewAllUser;
    private javax.swing.JButton viewBooks;
    private javax.swing.JButton viweBooksUnavailable;
    // End of variables declaration//GEN-END:variables
}