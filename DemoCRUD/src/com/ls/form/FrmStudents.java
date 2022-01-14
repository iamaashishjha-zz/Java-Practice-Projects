/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ls.form;

import com.ls.bll.Students;
import com.ls.dao.StudentDao;
import com.ls.dao.StudentDaoImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ethan
 */
public class FrmStudents extends javax.swing.JFrame {

    /**
     * Creates new form Students
     */
    private ArrayList<String> dataList;

    public FrmStudents() {
        initComponents();
        //loadDataToTable();

        StudentDao sd = new StudentDaoImpl();
        try {
            dataList = sd.getDataFromFile("StudentsInfo.txt");
        } catch (Exception ex) {
        }
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    /*
    public void loadDataToTable() {
        
        StudentDao sd = new StudentDaoImpl();

        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"SID", "Name", "Address", "Course"}, 0);
        try {
            dataList = sd.getDataFromFile("StudentsInfo.txt");
            Object[] tableLines;
            tableLines = dataList.toArray();
            for (int i = 0; i < tableLines.length; i++) {

                String lines = tableLines[i].toString();
                String[] row = lines.split(",");
                defaultTableModel.addRow(row);
            }
        } catch (IOException ex) {
            
        }

        jTable2.setModel(defaultTableModel);
    }*/

    private void loadData() {
        try {
            ArrayList<String> fileData;
            StudentDao sd = new StudentDaoImpl();
            fileData = sd.getAlLStudents();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"SID", "Name", "Address", "Course"}, 0);
            Object[] tableLines = fileData.toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String lines = tableLines[i].toString();
                String[] row = lines.split(",");
                dtm.addRow(row);

            }
            jTable2.setModel(dtm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private boolean valid() {
        String filePath = "StudentsInfo.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String lines = tableLines[i].toString().trim();
                String[] dataRow = lines.split(",");
                if (txtSID.getText().equals(dataRow[0])) {
                    JOptionPane.showMessageDialog(this, "Student Id should be unique");
                    return false;
                }
            }
        } catch (Exception ex) {

        }
        if (txtSID.getText() == null || txtSID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Student Id is required");
            return false;
        } else if (txtSName.getText() == "" || txtSName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Book Name is required");
            return false;
        } //return false;
        else if (txtSAddr.getText() == "" || txtSAddr.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Author Name is required");
            return false;
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        txtSID = new javax.swing.JTextField();
        txtSAddr = new javax.swing.JTextField();
        cmbCourse = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setText("SID: -");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setText("Student Name: -");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setText("Student Address: -");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setText("Student Course: -");

        txtSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNameActionPerformed(evt);
            }
        });

        txtSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSIDActionPerformed(evt);
            }
        });

        txtSAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSAddrActionPerformed(evt);
            }
        });

        cmbCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BBA", "BSCIT", "MBA", "MSCIT" }));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnClear)
                .addGap(107, 107, 107)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtSName)
                        .addComponent(cmbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNameActionPerformed

    private void txtSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSIDActionPerformed

    private void txtSAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAddrActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        StudentDao sd = new StudentDaoImpl();
        try {
            dataList = sd.getDataFromFile("StudentsInfo.txt");

        } catch (Exception ex) {

        }
        Students s = new Students();
        if (valid()) {
            s.setSID(txtSID.getText());
            s.setsName(txtSName.getText());
            s.setsAddress(txtSAddr.getText());
            s.setsCourse(cmbCourse.getSelectedItem().toString());

            ArrayList<String> list = dataList;

            list.add(s.getSID() + "," + s.getsName() + "," + s.getsAddress() + "," + s.getsCourse());

            sd.writeToFile("StudentsInfo.txt", list);

            JOptionPane.showMessageDialog(rootPane, "Sucess");

            loadData();

            txtSID.setText("");
            txtSName.setText("");
            txtSAddr.setText("");
            cmbCourse.setSelectedIndex(0);

        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        boolean found = false;

        Students s = new Students();

        StudentDao sd = new StudentDaoImpl();

        if (txtSID.getText() == null || txtSID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Select from the table to update record");
        } else {

            s.setSID(txtSID.getText());
            s.setsName(txtSName.getText());
            s.setsAddress(txtSAddr.getText());
            s.setsCourse(cmbCourse.getSelectedItem().toString());

            for (int i = 0; i < dataList.size(); i++) {

                String[] storedData;
                ArrayList<String> list = dataList;
                storedData = list.get(i).split(",");
                if (txtSID.getText().equals(storedData[0])) {

                    list.set(i, s.getSID() + "," + s.getsName() + "," + s.getsAddress() + "," + s.getsCourse());

                    sd.writeToFile("StudentsInfo.txt", list);

                    found = true;
                    break;
                }
            }
            if (found) {

                JOptionPane.showMessageDialog(this, "Updated Sucessfully");
                //loadDataToTable();
                loadData();

                txtSID.setText("");
                txtSName.setText("");
                txtSAddr.setText("");
                cmbCourse.setSelectedIndex(0);

            } else {

                JOptionPane.showMessageDialog(this, "Sorry file not Updated");
            }

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        if (row < 0) {

            JOptionPane.showMessageDialog(this, "Sorry No Data Selected");
        } else {

            String id = (jTable2.getModel().getValueAt(row, 0).toString());
            for (int i = 0; i < dataList.size(); i++) {

                String[] storedData = dataList.get(i).split(",");
                if (id.equals(storedData[0])) {

                    txtSID.setText(storedData[0]);
                    txtSName.setText(storedData[1]);
                    txtSAddr.setText(storedData[2]);
                    cmbCourse.setSelectedItem(storedData[3]);
                }
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        boolean found = false;
        StudentDao sd = new StudentDaoImpl();

        for (int i = 0; i < dataList.size(); i++) {

            String[] storedData;
            ArrayList<String> list = dataList;
            storedData = list.get(i).split(",");
            if (txtSID.getText().equals(storedData[0])) {
                found = true;
                list.remove(i);
                //database.writeToFile("BookInfo.txt", list);
                sd.writeToFile("StudentsInfo.txt", list);
                break;
            }
        }
        if (found) {

            JOptionPane.showMessageDialog(this, "Deleted Sucessfully");
            loadData();

            txtSID.setText("");
            txtSName.setText("");
            txtSAddr.setText("");
            cmbCourse.setSelectedIndex(0);
        } else {

            JOptionPane.showMessageDialog(this, "Sorry file not deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtSID.setText("");
        txtSName.setText("");
        txtSAddr.setText("");
        cmbCourse.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(FrmStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtSAddr;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
}
