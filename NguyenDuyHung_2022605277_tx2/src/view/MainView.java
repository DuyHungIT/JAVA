/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ComputerController;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Computer;
import model.QLModel;

/**
 *
 * @author H
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    ActionListener action = new ComputerController(this);
    public QLModel model;

    public MainView() {
        initComponents();
        ComputerController computercontroller;
        model = new QLModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_danhsach = new javax.swing.JTable();
        jLabel_danhsachmaytinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Price = new javax.swing.JTextField();
        jTextField_Total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Memoryram = new javax.swing.JTextField();
        jTextField_Brand = new javax.swing.JTextField();
        jTextField_Fanspeed = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Sort = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Searchname = new javax.swing.JTextField();
        jButton_Find = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DANH SÁCH MÁY TÍNH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTable1_danhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE", "TOTAL", "MEMORY RAM", "BRAND", "FAN SPEED"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1_danhsach);

        jLabel_danhsachmaytinh.setBackground(new java.awt.Color(255, 255, 51));
        jLabel_danhsachmaytinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_danhsachmaytinh.setText("Danh sách");

        jLabel2.setText("Thông tin chi tiết");

        jLabel3.setText("ID:");

        jLabel4.setText("Name: ");

        jLabel5.setText("Price:");

        jLabel6.setText("Total:");

        jLabel7.setText("Memory Ram:");

        jLabel8.setText("Brand:");

        jLabel9.setText("Fan Speed:");

        jButton_Add.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Edit.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Delete.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Sort.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Sort.setText("Sort");
        jButton_Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SortActionPerformed(evt);
            }
        });

        jButton_Exit.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jLabel10.setText("Search (name) : ");

        jButton_Find.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Find.setText("Find");
        jButton_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FindActionPerformed(evt);
            }
        });

        jButton_Save.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_danhsachmaytinh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Name)
                            .addComponent(jTextField_ID)
                            .addComponent(jTextField_Price)
                            .addComponent(jTextField_Total, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton_Add)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_Searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButton_Find))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Edit)
                                .addGap(73, 73, 73)
                                .addComponent(jButton_Delete)
                                .addGap(72, 72, 72)
                                .addComponent(jButton_Sort)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton_Save)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_Exit)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Memoryram, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Fanspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_danhsachmaytinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Memoryram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Fanspeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Searchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Find))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add)
                            .addComponent(jButton_Edit)
                            .addComponent(jButton_Delete)
                            .addComponent(jButton_Sort))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Exit)
                            .addComponent(jButton_Save))
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //THÊM - ADD 
    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed

        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn ADD");
        jButton_Add.addActionListener(action);
    }//GEN-LAST:event_jButton_AddActionPerformed

    // SỬA - EDIT
    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn EDIT");
        jButton_Edit.addActionListener(action);
    }//GEN-LAST:event_jButton_EditActionPerformed

    // XÓA _DELETE
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn DELETE");
        jButton_Delete.addActionListener(action);
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    // SẮP XẾP - SORT
    private void jButton_SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SortActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn SORT");
        jButton_Sort.addActionListener(action);
    }//GEN-LAST:event_jButton_SortActionPerformed

    // THOÁT CHƯƠNG TRÌNH
    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn EXIT");
        jButton_Exit.addActionListener(action);
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FindActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn Find");
        jButton_Find.addActionListener(action);
    }//GEN-LAST:event_jButton_FindActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn chọn SAVE");
        jButton_Save.addActionListener(action);
    }//GEN-LAST:event_jButton_SaveActionPerformed

    // delete information khi click thêm
    public void deleteInformation() {
        jTextField_ID.setText("");
        jTextField_Name.setText("");
        jTextField_Price.setText("");
        jTextField_Total.setText("");
        jTextField_Memoryram.setText("");
        jTextField_Brand.setText("");
        jTextField_Fanspeed.setText("");
    }

    // thêm thông tin vào bảng
    public void addInformation(Computer c) {

        // insert dữ liệu vào mảng
        this.model.addComputer(c);

        // thêm dữ liệu vào bảng jtable
        DefaultTableModel modeltable = (DefaultTableModel) jTable1_danhsach.getModel();

        modeltable.addRow(
                new Object[]{
                    c.getProduct_id(),
                    c.getProduct_name(),
                    c.getProduct_price(),
                    c.getProduct_total(),
                    c.getRam_memory(),
                    c.getComputer_brand(),
                    c.getFan_speed()
                });
    }

    public void outputInformation() {
        DefaultTableModel modeltable = (DefaultTableModel) jTable1_danhsach.getModel();
        int count_row = jTable1_danhsach.getSelectedRow();

        int id = Integer.parseInt(modeltable.getValueAt(count_row, 0) + "");
        String name = modeltable.getValueAt(count_row, 1) + "";
        float price = Float.parseFloat(modeltable.getValueAt(count_row, 2) + "");
        int total = Integer.parseInt(modeltable.getValueAt(count_row, 3) + "");
        float ram = Float.parseFloat(modeltable.getValueAt(count_row, 4) + "");
        String brand = modeltable.getValueAt(count_row, 5) + "";
        float fan = Float.parseFloat(modeltable.getValueAt(count_row, 0) + "");

        this.jTextField_ID.setText(id + "");
        this.jTextField_Name.setText(name);
        this.jTextField_Price.setText(price + "");
        this.jTextField_Total.setText(total + "");
        this.jTextField_Fanspeed.setText(fan + "");
        this.jTextField_Memoryram.setText(ram + "");
        this.jTextField_Brand.setText(brand);

    }

    public void editInformation(Computer c) {

        DefaultTableModel modeltable = (DefaultTableModel) jTable1_danhsach.getModel();
        int count_row = jTable1_danhsach.getSelectedRow();

        int id = Integer.parseInt(jTextField_ID.getText());
        String name = jTextField_Name.getText();
        float price = Float.parseFloat(jTextField_Price.getText());
        int total = Integer.parseInt(jTextField_Total.getText());
        float ram = Float.parseFloat(jTextField_Memoryram.getText());
        String brand = jTextField_Brand.getText();
        float fan = Float.parseFloat(jTextField_Fanspeed.getText());

        modeltable.setValueAt(id, count_row, 0);
        modeltable.setValueAt(name, count_row, 1);
        modeltable.setValueAt(price, count_row, 2);
        modeltable.setValueAt(total, count_row, 3);
        modeltable.setValueAt(ram, count_row, 4);
        modeltable.setValueAt(brand, count_row, 5);
        modeltable.setValueAt(fan, count_row, 6);

    }

    // xóa
    public void DeleteInformation() {

        DefaultTableModel modeltable = (DefaultTableModel) jTable1_danhsach.getModel();

        int count_row = jTable1_danhsach.getSelectedRow();

        // lấy dữ liệu ra
        int id = Integer.parseInt(modeltable.getValueAt(count_row, 0) + "");
        String name = modeltable.getValueAt(count_row, 1) + "";
        float price = Float.parseFloat(modeltable.getValueAt(count_row, 2) + "");
        int total = Integer.parseInt(modeltable.getValueAt(count_row, 3) + "");
        float ram = Float.parseFloat(modeltable.getValueAt(count_row, 4) + "");
        String brand = modeltable.getValueAt(count_row, 5) + "";
        float fan = Float.parseFloat(modeltable.getValueAt(count_row, 0) + "");

        Computer c = new Computer(ram, brand, fan, id,
                name, price, total);
        this.model.delComputer(c);

        //
        if (count_row != -1) {
            ((DefaultTableModel) jTable1_danhsach.getModel()).removeRow(count_row);
        }

    }

    // find
    public void findInformation() {
        DefaultTableModel modeltable = (DefaultTableModel) jTable1_danhsach.getModel();
        String name = jTextField_Searchname.getText() + "";

        for (int i = 0; i < modeltable.getRowCount(); i++) {
            if (name.equalsIgnoreCase(modeltable.getValueAt(i, 1) + "")) {
                int id = Integer.parseInt(modeltable.getValueAt(i, 1) + "");
                String name1 = modeltable.getValueAt(i, 1) + "";
                float price = Float.parseFloat(modeltable.getValueAt(i, 1) + "");
                int total = Integer.parseInt(modeltable.getValueAt(i, 1) + "");
                float ram = Float.parseFloat(modeltable.getValueAt(i, 1) + "");
                String brand = modeltable.getValueAt(i, 1) + "";
                float fan = Float.parseFloat(modeltable.getValueAt(i, 1) + "");

                // gán vào textfield
                this.jTextField_ID.setText(id + "");
                this.jTextField_Name.setText(name);
                this.jTextField_Price.setText(price + "");
                this.jTextField_Total.setText(total + "");
                this.jTextField_Fanspeed.setText(fan + "");
                this.jTextField_Memoryram.setText(ram + "");
                this.jTextField_Brand.setText(brand);
            }
        }

    }
    
    // sort
    public void sortInformation() {
        
        DefaultTableModel modeltable = (DefaultTableModel) jTable1_danhsach.getModel();

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(modeltable);
        jTable1_danhsach.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING)); // Cột "Price" ở vị trí thứ 3 (index 2)
        sorter.setSortKeys(sortKeys);

        sorter.sort();

    }
    
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Find;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Sort;
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
    private javax.swing.JLabel jLabel_danhsachmaytinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_danhsach;
    private javax.swing.JTextField jTextField_Brand;
    private javax.swing.JTextField jTextField_Fanspeed;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Memoryram;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Searchname;
    private javax.swing.JTextField jTextField_Total;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextField_Brand() {
        return jTextField_Brand;
    }

    public void setjTextField_Brand(JTextField jTextField_Brand) {
        this.jTextField_Brand = jTextField_Brand;
    }

    public JTextField getjTextField_Fanspeed() {
        return jTextField_Fanspeed;
    }

    public void setjTextField_Fanspeed(JTextField jTextField_Fanspeed) {
        this.jTextField_Fanspeed = jTextField_Fanspeed;
    }

    public JTextField getjTextField_ID() {
        return jTextField_ID;
    }

    public void setjTextField_ID(JTextField jTextField_ID) {
        this.jTextField_ID = jTextField_ID;
    }

    public JTextField getjTextField_Memoryram() {
        return jTextField_Memoryram;
    }

    public void setjTextField_Memoryram(JTextField jTextField_Memoryram) {
        this.jTextField_Memoryram = jTextField_Memoryram;
    }

    public JTextField getjTextField_Name() {
        return jTextField_Name;
    }

    public void setjTextField_Name(JTextField jTextField_Name) {
        this.jTextField_Name = jTextField_Name;
    }

    public JTextField getjTextField_Price() {
        return jTextField_Price;
    }

    public void setjTextField_Price(JTextField jTextField_Price) {
        this.jTextField_Price = jTextField_Price;
    }

    public JTextField getjTextField_Searchname() {
        return jTextField_Searchname;
    }

    public void setjTextField_Searchname(JTextField jTextField_Searchname) {
        this.jTextField_Searchname = jTextField_Searchname;
    }

    public JTextField getjTextField_Total() {
        return jTextField_Total;
    }

    public void setjTextField_Total(JTextField jTextField_Total) {
        this.jTextField_Total = jTextField_Total;
    }

    

}
