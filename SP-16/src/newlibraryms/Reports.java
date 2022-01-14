
package newlibraryms;

import Database.Database;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Reports extends javax.swing.JFrame {

    private Database database;
    private ArrayList<String> dataList;
    public Reports() {
        initComponents();
        database = new Database();
         setResizable(false);
          this.setLocationRelativeTo(null);
         try {
            dataList = database.getDataFromFile("StudentInfo.txt");
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
         loadDataToMemberTable();
         loadDataToBookTable();
         loadDataToBorrowersTable();
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        report = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Knowledgica Library Management System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Reports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel12)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });

        MemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Gender", "Address", "Email", "Phone Number", "Level", "Course"
            }
        ));
        jScrollPane1.setViewportView(MemberTable);

        report.addTab("Members Report", jScrollPane1);

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author Name", "Publisher Name", "Stock Number", "Shelf Number", "Column Number", "Row Number"
            }
        ));
        jScrollPane2.setViewportView(bookTable);

        report.addTab("Books Report", jScrollPane2);

        borrowersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(borrowersTable);

        report.addTab("Borrowers", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
       
    }//GEN-LAST:event_reportMouseClicked

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    public void loadDataToMemberTable(){
    
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Student ID", "First Name", "Last Name", "Gender",
                                                                                "Address", "Email", "Phone Number", "Level", "Course"}, 0);
        try {
            dataList = database.getDataFromFile("StudentInfo.txt");
            Object[] tableLines;
            tableLines = dataList.toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String lines = tableLines[i].toString();
                String[] row = lines.split(",");
                defaultTableModel.addRow(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }

        MemberTable.setModel(defaultTableModel);
    }
    
    
       public void loadDataToBookTable(){
    
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Book ID", "Book Name", "Publisher Name", "Stock Number",
                                                                                "Shelf Number", "Column Number", "Row Number"}, 0);
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
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }

        bookTable.setModel(defaultTableModel);
    }
       
          public void loadDataToBorrowersTable(){
    
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Student ID", "First Name", "Last Name", "Gender",
                                                                                "Address", "Email", "Contact Number","Level","Course"
                                                                                    ,"Book ID","Book Name"}, 0);
        try {
            dataList = database.getDataFromFile("BookBorrowInfo.txt");
            Object[] tableLines;
            tableLines = dataList.toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String lines = tableLines[i].toString();
                String[] row = lines.split(",");
                defaultTableModel.addRow(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }

        borrowersTable.setModel(defaultTableModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MemberTable;
    private javax.swing.JTable bookTable;
    private javax.swing.JTable borrowersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane report;
    // End of variables declaration//GEN-END:variables
}
