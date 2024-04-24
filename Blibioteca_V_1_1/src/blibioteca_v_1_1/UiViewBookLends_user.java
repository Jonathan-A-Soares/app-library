/*
*   LendBook por:
*   Jonathan Americo Soares -- 42311ETE013
*   Joaquim Vitor castilho ferreira Pedro -- 42111ETE020
*
*/
package blibioteca_v_1_1;


import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultRowSorter;
import org.json.simple.JSONObject;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author bruxo
 */
public class UiViewBookLends_user extends javax.swing.JPanel {

    /**
     * Creates new form UiViewBookLends
     */
    private String Filter;
    private String view;

    public UiViewBookLends_user() {
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
        table_books = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bnt_filter = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        box_Filter = new javax.swing.JComboBox<>();
        filter_textfield = new javax.swing.JTextField();
        box_View = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        errMsg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num_books = new javax.swing.JLabel();

        table_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Emprestado", "Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_books);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Filtros");

        bnt_filter.setText("Filtrar");
        bnt_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_filterActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtra por:");

        box_Filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo" }));

        box_View.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Vencidos", "Vence hoje", "No prazo" }));

        jLabel3.setText("Ver:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnt_filter)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filter_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jLabel4.setText("Livros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_books, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(num_books, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_filterActionPerformed

        Filter = (String) box_Filter.getSelectedItem();
        view = (String) box_View.getSelectedItem();

        JSONObject BooksLoads = Books.ReadJsonBooks(1);
        DefaultTableModel model = (DefaultTableModel) table_books.getModel();
        model.setRowCount(0);
        // Criaa umnm classifidor de linhas
        DefaultRowSorter sorter = new TableRowSorter(model);
        table_books.setRowSorter(sorter);

        
        
        String nameUser = UiPainelUser.UserName();
        String num_identification = Users.EspecificDateUser(nameUser, "num_identification");
        //System.err.println(num_identification);
        
        


            // Cria um novo objeto JSONObject para armazenar os livros do usuario
            JSONObject livrosDoUserJSON = new JSONObject();
            int qntlivros = 0;
            // Percorre todos os livros para verificar se esta posse do usuario
            for (Object key : BooksLoads.keySet()) {
                Object value = BooksLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;
                    String gripped = (String) livro.get("gripped");

                    
                        if (gripped.equals(num_identification)) {
                            // Se estiver pose do user, adiciona o livro ao novo objeto JSON
                            livrosDoUserJSON.put(key, livro);
                            qntlivros = qntlivros + 1;

                        }
                    
                }
            }

            // Atualiza BooksLoads com os livros do usuario
            BooksLoads = livrosDoUserJSON;
            //System.out.println(BooksLoads);
            num_books.setText(Long.toString(qntlivros));
            // Limpa todas as linhas da tabela
            model.setRowCount(0);

            // Notifica a tabela sobre as mudanças nos dados
            model.fireTableDataChanged();






         if(BooksLoads.isEmpty()){
         num_books.setText("0");
         }else{

        
        if (view.equals("Todos")) {// carrega todos os livros do usuario

            
            num_books.setText(Long.toString(qntlivros));

        } else if (view.equals("Vencidos")) { // carrega livros vencidos

            JSONObject livrosVencidos = new JSONObject(); // Criar um novo objeto JSON para armazenar apenas os livros vencidos
             qntlivros = 0;
            for (Object key : BooksLoads.keySet()) {
                Object value = BooksLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;
                    String date_give_back = (String) livro.get("date_give_back");

                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Formato da data
                    Date dataAtual = new Date();
                    Date dataRetorno;

                    try {
                        dataRetorno = dateFormat.parse(date_give_back);

                        if (dataAtual.after(dataRetorno)) {
                            livrosVencidos.put(key, livro); // Adiciona o livro vencido ao novo objeto JSON
                            qntlivros = qntlivros + 1;
                        }
                    } catch (ParseException e) {
                        // Trate aqui caso ocorra algum erro na conversão das datas
                        e.printStackTrace();
                    }
                }
            }

            // Atualiza BooksLoads com os livros vencidos
            BooksLoads = livrosVencidos;

            num_books.setText(Long.toString(qntlivros));

            // Limpa todas as linhas da tabela
            model.setRowCount(0);

        } else if (view.equals("Vence hoje")) { // carrega livros que vencem hoje
            // Criar um objeto para armazenar os livros que vencem hoje
            JSONObject livrosVencemHoje = new JSONObject();
             qntlivros = 0;
            // Obtém a data atual
            Date dataAtual = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dataAtualStr = dateFormat.format(dataAtual);

            // Percorre todos os livros para verificar se vencem hoje
            for (Object key : BooksLoads.keySet()) {
                Object value = BooksLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;
                    String date_give_back = (String) livro.get("date_give_back");

                    try {
                        // Compara a data de devolução do livro com a data atual
                        if (date_give_back.equals(dataAtualStr)) {
                            livrosVencemHoje.put(key, livro); // Adiciona o livro que vence hoje ao novo objeto JSON
                            qntlivros = qntlivros + 1;
                        }
                    } catch (Exception e) {
                        // Trate aqui caso ocorra algum erro
                        e.printStackTrace();
                    }
                }
            }

            // Atualiza BooksLoads com os livros que vencem hoje
            BooksLoads = livrosVencemHoje;
            num_books.setText(Long.toString(qntlivros));
            // Limpa todas as linhas da tabela
            model.setRowCount(0);

        } else { // Carrega livros dentro do prazo correto

            // Cria um novo objeto JSONObject para armazenar os livros dentro do prazo
            JSONObject livrosDentroDoPrazoJSON = new JSONObject();
             qntlivros = 0;
            // Percorre todos os livros para verificar se estão dentro do prazo
            for (Object key : BooksLoads.keySet()) {
                Object value = BooksLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;
                    String date_give_back = (String) livro.get("date_give_back");

                    try {
                        // Converte a data de devolução do livro para o formato de data
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date dataRetorno = dateFormat.parse(date_give_back);

                        // Verifica se a data de devolução é posterior à data atual
                        Date dataAtual = new Date();
                        if (dataRetorno.after(dataAtual)) {
                            // Se estiver dentro do prazo, adiciona o livro ao novo objeto JSON
                            livrosDentroDoPrazoJSON.put(key, livro);
                            qntlivros = qntlivros + 1;

                        }
                    } catch (ParseException e) {
                        // Trate aqui caso ocorra algum erro na conversão das datas
                        e.printStackTrace();
                    }
                }
            }

            // Atualiza BooksLoads com os livros dentro do prazo
            BooksLoads = livrosDentroDoPrazoJSON;
            num_books.setText(Long.toString(qntlivros));
            // Limpa todas as linhas da tabela
            model.setRowCount(0);

            // Notifica a tabela sobre as mudanças nos dados
            model.fireTableDataChanged();
        }
        String filter_op = filter_textfield.getText();
        if (!filter_op.isEmpty()) {

            if (Filter.equals("Titulo")) { // Titulo Usuario
                Filter = "title";
            } else if (Filter.equals("Usuario")) {
                Filter = "gripped";
            }

            boolean check = false; // variavel controle pa saber se algun livro foi encontrado ocm filtro
            int qntBoks = 0;
            for (Object key : BooksLoads.keySet()) {
                Object value = BooksLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get(Filter).equals(filter_op)) {
                        //coleta as informalçoes dos livros

                        String title = (String) livro.get("title");
                        String date_land = (String) livro.get("date_land");
                        String date_give_back = (String) livro.get("date_give_back");
                        String gripped = (String) livro.get("gripped");
                        
                        qntBoks = qntBoks + 1;
                        //adciona o titulo a tabela
                        model.addRow(new Object[]{title, date_land, date_give_back});
                        check = true; // true se algun livro foi encontrado com filtro aplicado

                    }
                }

            }

            if (!check) { // se nenhum livro foi encontrado avisa usuario
                errMsg.setText("Nenhum livro encontrado");
                num_books.setText("0");
            } else {
                errMsg.setText("");
            }
            num_books.setText(Long.toString(qntBoks));
            sorter.toggleSortOrder(0);
        } else { //se na tiver filtro nenhum plota tuudo que achar
            long qntBoks = 0;
            //varre tudo que etem no json
            for (Object key : BooksLoads.keySet()) { //plota todo os livros disponiveis
                Object value = BooksLoads.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;
                    //coleta as informalçoes dos livros

                    String title = (String) livro.get("title");
                    String date_land = (String) livro.get("date_land");
                    String date_give_back = (String) livro.get("date_give_back");
                    String gripped = (String) livro.get("gripped");
                    
                    qntBoks = +1;
                    //adciona o titulo a tabela
                    model.addRow(new Object[]{title, date_land, date_give_back, gripped});

                }
            }
            
            sorter.toggleSortOrder(0);
        }}

    }//GEN-LAST:event_bnt_filterActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel num_books;
    private javax.swing.JTable table_books;
    // End of variables declaration//GEN-END:variables
}
