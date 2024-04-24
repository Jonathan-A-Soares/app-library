/*
*   LendBook por:
*   Jonathan Americo Soares -- 42311ETE013
*   Joaquim Vitor castilho ferreira Pedro -- 42111ETE020
*
 */
package blibioteca_v_1_1;

import static blibioteca_v_1_1.Users.ReadJsonUsers;
import javax.swing.DefaultRowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author bruxo
 */
public class UiHistoryBooks extends javax.swing.JPanel {

    /**
     * Creates new form UiHistoryBooksUsers
     */
    public UiHistoryBooks() {
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
        books_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bnt_shear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Input_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        num_books = new javax.swing.JLabel();

        books_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Livro", "Data", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(books_table);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bnt_shear.setText("Buscar");
        bnt_shear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_shearActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Filtro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Input_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_shear))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Input_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bnt_shear)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel3.setText("Livros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_books, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num_books, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_shearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_shearActionPerformed
        String nameUser = Input_name.getText();

        JSONObject usersLoads = Users.ReadJsonUsers();
        DefaultTableModel model = (DefaultTableModel) books_table.getModel();
        model.setRowCount(0);
        // Criaa umnm classifidor de linhas
        DefaultRowSorter sorter = new TableRowSorter(model);
        books_table.setRowSorter(sorter);
        int Qnt_livros = 0;

        if (!nameUser.isEmpty()) {

            
            
            
            //varre tudo que tem no json
            for (Object key : usersLoads.keySet()) { //plota somente de um usuario
                Object value = usersLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;
                    if(livro.get("name").equals(nameUser)){
                    //coleta as informalçoes do usuario especificado
                    String Name = (String) livro.get("name");
                    JSONArray titlesArray = (JSONArray) livro.get("titles_lends");
                    JSONArray dateArray = (JSONArray) livro.get("date_lends");
                    //adciona titlo de acordo com sua data
                    for (int i = 0; i < titlesArray.size(); i++) {
                        String title = (String) titlesArray.get(i);
                        String date = (String) dateArray.get(i);

                        if (!title.equals("empy_000") && !date.equals("empy_000")) {
                            model.addRow(new Object[]{title, date, Name});
                            Qnt_livros += 1;
                        }
                    }}

                }
            
        }} else {

            //varre tudo que tem no json
            for (Object key : usersLoads.keySet()) { //plota todo os usuarios
                Object value = usersLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    //coleta as informalçoes dos lusuario
                    String Name = (String) livro.get("name");
                    JSONArray titlesArray = (JSONArray) livro.get("titles_lends");
                    JSONArray dateArray = (JSONArray) livro.get("date_lends");

                    for (int i = 0; i < titlesArray.size(); i++) {
                        String title = (String) titlesArray.get(i);
                        String date = (String) dateArray.get(i);

                        if (!title.equals("empy_000") && !date.equals("empy_000")) {
                            model.addRow(new Object[]{title, date, Name});
                            Qnt_livros += 1;
                        }
                    }

                }
            }

            num_books.setText(Long.toString(Qnt_livros));
            sorter.toggleSortOrder(0);
        }

    }//GEN-LAST:event_bnt_shearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Input_name;
    private javax.swing.JButton bnt_shear;
    private javax.swing.JTable books_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel num_books;
    // End of variables declaration//GEN-END:variables
}