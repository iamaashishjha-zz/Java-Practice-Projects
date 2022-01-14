package newlibraryms;

import Database.Database;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Books extends javax.swing.JFrame {

    private Database database;
    private ArrayList<String> dataList;

    public Books() {
        initComponents();
        database = new Database();

        try {
            dataList = database.getDataFromFile("BookInfo.txt");
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        setResizable(false);
        this.setLocationRelativeTo(null);
        loadDataToTable();
    }
    BookInfo bookInfoObject = new BookInfo();

    public void addBookRecord() {
        try {
            dataList = database.getDataFromFile("BookInfo.txt");
        } catch (IOException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (valid()) {

            bookInfoObject.setBookId(bookIdField.getText());
            bookInfoObject.setBookName(bookNameField.getText());
            bookInfoObject.setAuthorName(authorNameField.getText());
            bookInfoObject.setPublisherName(publisherNameField.getText());
            bookInfoObject.setStockNumber(stockNumberField.getText());

            bookInfoObject.setShelfNumber(shelfNumberField.getText());
            bookInfoObject.setColumnNumber(columnNumberField.getText());
            bookInfoObject.setRowNumber(rowNumberField.getText());

            ArrayList<String> list = dataList;
            list.add(bookInfoObject.getBookId() + "," + bookInfoObject.getBookName() + "," + bookInfoObject.getAuthorName()
                    + "," + bookInfoObject.getPublisherName() + "," + bookInfoObject.getStockNumber() + "," + bookInfoObject.getShelfNumber()
                    + "," + bookInfoObject.getColumnNumber() + "," + bookInfoObject.getRowNumber());

            database.writeToFile("BookInfo.txt", list);
            JOptionPane.showMessageDialog(rootPane, "Sucess");

            bookIdField.setText("");
            bookNameField.setText("");
            authorNameField.setText("");
            publisherNameField.setText("");
            stockNumberField.setText("");
            shelfNumberField.setText("");
            columnNumberField.setText("");
            rowNumberField.setText("");
        } else {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bookNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        authorNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stockNumberField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        shelfNumberField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        columnNumberField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rowNumberField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        publisherNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Knowledgica Library Management System");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Manage Books");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Author Name", "Publisher Name", "Stock Number", "Shelf Number", "Column Number", "Row Number"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Book ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Book Name:");

        bookNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bookNameFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Author Name:");

        authorNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                authorNameFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Publisher Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Stock Number:");

        stockNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockNumberFieldKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Shelf Number:");

        shelfNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                shelfNumberFieldKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Column Number:");

        columnNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                columnNumberFieldKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Row Number:");

        rowNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rowNumberFieldKeyTyped(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        publisherNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                publisherNameFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publisherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shelfNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(38, 38, 38)
                        .addComponent(deleteButton)
                        .addGap(40, 40, 40)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(publisherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(shelfNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stockNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rowNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookNameFieldKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_bookNameFieldKeyTyped

    private void authorNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorNameFieldKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_authorNameFieldKeyTyped

    private void publisherNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_publisherNameFieldKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_publisherNameFieldKeyTyped

    private void stockNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockNumberFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_stockNumberFieldKeyTyped

    private void shelfNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shelfNumberFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_shelfNumberFieldKeyTyped

    private void columnNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columnNumberFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_columnNumberFieldKeyTyped

    private void rowNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rowNumberFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_rowNumberFieldKeyTyped

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addBookRecord();
        loadDataToTable();

    }//GEN-LAST:event_addButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row < 0) {

            JOptionPane.showMessageDialog(this, "Sorry No Data Selected");
        } else {

            String id = (jTable1.getModel().getValueAt(row, 0).toString());
            for (int i = 0; i < dataList.size(); i++) {

                String[] storedData = dataList.get(i).split(",");
                if (id.equals(storedData[0])) {

                    bookIdField.setText(storedData[0]);
                    bookNameField.setText(storedData[1]);
                    authorNameField.setText(storedData[2]);
                    publisherNameField.setText(storedData[3]);
                    stockNumberField.setText(storedData[4]);
                    shelfNumberField.setText(storedData[5]);
                    columnNumberField.setText(storedData[6]);
                    rowNumberField.setText(storedData[7]);
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        boolean found = false;
        if (bookIdField.getText() == null || bookIdField.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please Select from the table to update record");
        } else {

            bookInfoObject.setBookId(bookIdField.getText());
            bookInfoObject.setBookName(bookNameField.getText());
            bookInfoObject.setAuthorName(authorNameField.getText());
            bookInfoObject.setPublisherName(publisherNameField.getText());
            bookInfoObject.setStockNumber(stockNumberField.getText());
            bookInfoObject.setShelfNumber(shelfNumberField.getText());
            bookInfoObject.setColumnNumber(columnNumberField.getText());
            bookInfoObject.setRowNumber(rowNumberField.getText());

            for (int i = 0; i < dataList.size(); i++) {

                String[] storedData;
                ArrayList<String> list = dataList;
                storedData = list.get(i).split(",");
                if (bookIdField.getText().equals(storedData[0])) {

                    list.set(i, bookInfoObject.getBookId() + "," + bookInfoObject.getBookName() + "," + bookInfoObject.getAuthorName()
                            + "," + bookInfoObject.getPublisherName() + "," + bookInfoObject.getStockNumber() + "," + bookInfoObject.getShelfNumber()
                            + "," + bookInfoObject.getColumnNumber() + "," + bookInfoObject.getRowNumber());

                    database.writeToFile("BookInfo.txt", list);

                    found = true;
                    break;
                }
            }
            if (found) {

                JOptionPane.showMessageDialog(this, "Updated Sucessfully");
                loadDataToTable();
                bookIdField.setText("");
                bookNameField.setText("");
                authorNameField.setText("");
                publisherNameField.setText("");
                stockNumberField.setText("");
                shelfNumberField.setText("");
                columnNumberField.setText("");
                rowNumberField.setText("");
            } else {

                JOptionPane.showMessageDialog(this, "Sorry file not Updated");
            }

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        boolean found = false;

        for (int i = 0; i < dataList.size(); i++) {

            String[] storedData;
            ArrayList<String> list = dataList;
            storedData = list.get(i).split(",");
            if (bookIdField.getText().equals(storedData[0])) {
                found = true;
                list.remove(i);
                database.writeToFile("BookInfo.txt", list);

                break;
            }
        }
        if (found) {

            JOptionPane.showMessageDialog(this, "Deleted Sucessfully");
            loadDataToTable();
            bookIdField.setText("");
            bookNameField.setText("");
            authorNameField.setText("");
            publisherNameField.setText("");
            stockNumberField.setText("");
            shelfNumberField.setText("");
            columnNumberField.setText("");
            rowNumberField.setText("");
        } else {

            JOptionPane.showMessageDialog(this, "Sorry file not deleted");
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        bookIdField.setText("");
        bookNameField.setText("");
        authorNameField.setText("");
        publisherNameField.setText("");
        stockNumberField.setText("");
        shelfNumberField.setText("");
        columnNumberField.setText("");
        rowNumberField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    public void loadDataToTable() {

        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Book ID", "Book Name", "Author Name", "Publisher Name",
            "Stock Number", "Shelf Number", "Column Number", "Row Number"}, 0);
        try {
            dataList = database.getDataFromFile("BookInfo.txt");
            Object[] tableLines;
            tableLines = dataList.toArray();
            for (int i = 0; i < tableLines.length; i++) {

                String lines = tableLines[i].toString();
                String[] row = lines.split(",");
                defaultTableModel.addRow(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTable1.setModel(defaultTableModel);
    }

    private boolean valid() {

        String filePath = "BookInfo.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String lines = tableLines[i].toString().trim();
                String[] dataRow = lines.split(",");
                if (bookIdField.getText().equals(dataRow[0])) {
                    JOptionPane.showMessageDialog(this, "Book Id should be unique");
                    return false;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (bookIdField.getText() == null || bookIdField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Book Id is required");
            return false;
        } else if (bookNameField.getText() == "" || bookNameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Book Name is required");
        } //return false;
        else if (authorNameField.getText() == "" || authorNameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Author Name is required");
            return false;
        } else if (stockNumberField.getText() == "" || stockNumberField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Stock Number is required");
            return false;
        } else if (shelfNumberField.getText() == "" || shelfNumberField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Shelf Number is required");
            return false;
        } else if (columnNumberField.getText() == "" || columnNumberField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Column Number is required");
            return false;
        } else if (rowNumberField.getText() == "" || rowNumberField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Row Number is required");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorNameField;
    private javax.swing.JTextField bookIdField;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField columnNumberField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField publisherNameField;
    private javax.swing.JTextField rowNumberField;
    private javax.swing.JTextField shelfNumberField;
    private javax.swing.JTextField stockNumberField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
