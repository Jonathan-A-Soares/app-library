/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package blibioteca_v_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultRowSorter;
import org.json.simple.JSONObject;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bruxo
 */
public class UiViewUsers extends javax.swing.JPanel {

    /**
     * Creates new form UiViewUsers
     *
     */
    private String Filter;
    private String view;

    public UiViewUsers() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bnt_filter = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        box_Filter = new javax.swing.JComboBox<>();
        filter_textfield = new javax.swing.JTextField();
        box_View = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        errMsg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num_users = new javax.swing.JLabel();

        table_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Identificador", "Telefone", "Permisão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_users);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Filtros");

        bnt_filter.setText("Filtrar");
        bnt_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_filterActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtra por:");

        box_Filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Telefone", "Identificador" }));

        box_View.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Administrador", "Visitantes" }));
        box_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_ViewActionPerformed(evt);
            }
        });

        jLabel3.setText("Ver:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnt_filter)
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(errMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filter_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(box_Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filter_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnt_filter)
                .addContainerGap())
        );

        jLabel4.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_users, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(num_users, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_filterActionPerformed

        Filter = (String) box_Filter.getSelectedItem();
        view = (String) box_View.getSelectedItem();

        JSONObject usersLoads = Users.ReadJsonUsers();
        DefaultTableModel model = (DefaultTableModel) table_users.getModel();
        model.setRowCount(0);
        // Criaa umnm classifidor de linhas
        DefaultRowSorter sorter = new TableRowSorter(model);
        table_users.setRowSorter(sorter);

        if (view.equals("Todos")) {// carrega todos usuarios

        } else if (view.equals("Administrador")) { // carrega administradores

            // Verifica se o usuário administradores
            boolean userEncontrado = false;
            List<Object> keysToRemove = new ArrayList<>();
            for (Object key : usersLoads.keySet()) {
                Object value = usersLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject user = (JSONObject) value;
                    boolean perm = (boolean) user.get("permission");
                    if (!perm) { // procura o usuário que vai ser removido da lista no momento

                        keysToRemove.add(key);
                        userEncontrado = true;
                    }
                }
            }

            if (userEncontrado) {
                // Remove os usuários visitantes encontrados
                for (Object key : keysToRemove) {
                    usersLoads.remove(key);
                    //System.out.println("Usuário " + name + " Removido");
                    long numUsers = (long) usersLoads.get("Numero de Usuarios");
                    usersLoads.put("Numero de Usuarios", numUsers - 1);
                    num_users.setText(Long.toString(numUsers));
                }

                // Subtrai número de usuários
            }

        } else { //carrega usuario visitante
            // Verifica se o usuário administradores
            boolean userEncontrado = false;
            List<Object> keysToRemove = new ArrayList<>();
            for (Object key : usersLoads.keySet()) {
                Object value = usersLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject user = (JSONObject) value;
                    boolean perm = (boolean) user.get("permission");
                    if (perm) { // procura o usuário que vai ser removido da lista no momento

                        keysToRemove.add(key);
                        userEncontrado = true;
                    }
                }
            }

            if (userEncontrado) {
                // Remove os usuários visitantes encontrados
                for (Object key : keysToRemove) {
                    usersLoads.remove(key);
                    //System.out.println("Usuário " + name + " Removido");
                    long numUsers = (long) usersLoads.get("Numero de Usuarios");
                    usersLoads.put("Numero de Usuarios", numUsers - 1);
                    num_users.setText(Long.toString(numUsers));
                }

                // Subtrai número de usuários
            }

        }

        String filter_op = filter_textfield.getText();
        if (!filter_op.isEmpty()) {

            if (Filter.equals("Nome")) {
                Filter = "name";
            } else if (Filter.equals("Telefone")) {
                Filter = "Phone";
            } else if (Filter.equals("Identificador")) {
                Filter = "num_identification";
            }

            sorter.toggleSortOrder(0);

            for (Object key : usersLoads.keySet()) { //plota todo os usuarios
                Object value = usersLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get(Filter).equals(filter_op)) {
                        //coleta as informalçoes dos lusuario
                        String Name = (String) livro.get("name");
                        String idente = (String) livro.get("num_identification");
                        String phone = (String) livro.get("Phone");
                        boolean perm = (boolean) livro.get("permission");
                        String a;
                        if (perm) {
                            a = "Administrador";
                        } else {
                            a = "Visitantes";
                        }

                        model.addRow(new Object[]{Name, idente, phone, a}); //adciona dados a tabela por usuuario ver
                    }
                }

                long numUsers = (long) usersLoads.get("Numero de Usuarios");
                num_users.setText(Long.toString(numUsers));
            }

        } else { //se na tiver filtro nenhum, plota tuudo que achar

            //varre tudo que etem no json
            for (Object key : usersLoads.keySet()) { //plota todo os usuarios
                Object value = usersLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    //coleta as informalçoes dos lusuario
                    String Name = (String) livro.get("name");
                    String idente = (String) livro.get("num_identification");
                    String phone = (String) livro.get("Phone");
                    boolean perm = (boolean) livro.get("permission");
                    String a;
                    if (perm) {
                        a = "Administrador";
                    } else {
                        a = "Visitantes";
                    }

                    model.addRow(new Object[]{Name, idente, phone, a}); //adciona dados a tabela por usuuario ver
                }
            }
            long numUsers = (long) usersLoads.get("Numero de Usuarios");
            num_users.setText(Long.toString(numUsers));
            sorter.toggleSortOrder(0);
        }

    }//GEN-LAST:event_bnt_filterActionPerformed

    private void box_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_ViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_ViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bnt_filter;
    private javax.swing.JComboBox<String> box_Filter;
    private javax.swing.JComboBox<String> box_View;
    private javax.swing.JLabel errMsg;
    private javax.swing.JTextField filter_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel num_users;
    private javax.swing.JTable table_users;
    // End of variables declaration//GEN-END:variables
}
