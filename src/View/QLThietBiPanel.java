/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.SQLThietBi;
import Model.ThietBi;
import java.awt.print.PrinterJob;
import static java.awt.print.PrinterJob.getPrinterJob;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author An Vi
 */
public class QLThietBiPanel extends javax.swing.JPanel {

    ArrayList<ThietBi> list;
    SQLThietBi sql ;
    DefaultTableModel model;
    private String loaiTK;
    public QLThietBiPanel(String loaiTK) {
        initComponents();
        this.loaiTK = loaiTK ;
        sql = new SQLThietBi(this.loaiTK);
        list = sql.getListThietBi();
        model = (DefaultTableModel) jTable1.getModel();
        showTable();
    }
    public void showTable() {
        for (ThietBi s : list) {
            model.addRow(new Object[]{
                s.getMaTB(), s.getMaKhu(), s.getLoaiTB(),s.getTinhTrang()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_maTB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_loaiTB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_maKhu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_tinhtrang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonThoat = new javax.swing.JButton();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonTaiLai = new javax.swing.JButton();
        jButtonBaoCao = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH THIẾT BỊ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1500, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Mã Thiết bị :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        tf_maTB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(tf_maTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 270, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Loại Thiết bị :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        tf_loaiTB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(tf_loaiTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 270, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Mã Khu :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, -1, -1));

        tf_maKhu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(tf_maKhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 270, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Tình trạng TB :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        tf_tinhtrang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(tf_tinhtrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 170, 270, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Thiết bị", "Mã Khu", "Loại Thiết bị", "Tình trạng TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jTable1.setRowHeight(40);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1500, 340));

        jButtonThoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 260, -1, 60));

        jButtonThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonThem.setText("Thêm");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });
        add(jButtonThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 60));

        jButtonSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSua.setText("Sửa");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });
        add(jButtonSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, 60));

        jButtonXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });
        add(jButtonXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, 60));

        jButtonTaiLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonTaiLai.setText("Làm mới");
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, -1, 60));

        jButtonBaoCao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBaoCao.setText("Báo cáo");
        jButtonBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaoCaoActionPerformed(evt);
            }
        });
        add(jButtonBaoCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, 60));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Hủy");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 260, -1, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        ThietBi s = new ThietBi();
        s.setMaTB(tf_maTB.getText());
        s.setMaKhu(tf_maKhu.getText());
        s.setLoaiTB(tf_loaiTB.getText());
        s.setTinhTrang(Integer.parseInt(tf_tinhtrang.getText()));;

        try {
            if(sql.addThietBi(s)){
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !!");
                list.add(s); 
                showResult();
            } 
            else{
                JOptionPane.showMessageDialog(this, "Lỗi !!");
            }   
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi !!");
        }
        TaiLaiTrang();
    }//GEN-LAST:event_jButtonThemActionPerformed
    int index = -1;
    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        index = jTable1.getSelectedRow() ;
        ThietBi c = null ;
        if(index == -1){
            JOptionPane.showMessageDialog(this, "Hãy chọn sản phẩm muốn chỉnh sửa!!!");
        }
        else{
            c = list.get(index);
        }
        
        ThietBi s = new ThietBi();
        s.setMaTB(tf_maTB.getText());
        s.setMaKhu(tf_maKhu.getText());
        s.setLoaiTB(tf_loaiTB.getText());
        s.setTinhTrang(Integer.parseInt(tf_tinhtrang.getText()));;

        try {
            sql.EditThietBi(s);
            JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công!!!!");
            list.remove(index);
            list.add(index,s); 
            model.removeRow(index);
            model.insertRow(index,new Object[]{
                 tf_maTB.getText(), tf_maKhu.getText(), tf_loaiTB.getText(), tf_tinhtrang.getText()
            });
            model.fireTableDataChanged();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi!!!Không thể sửa sản phẩm");
        }
        TaiLaiTrang();
        
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        index = jTable1.getSelectedRow() ;
        if(list.size() == 0){
            JOptionPane.showMessageDialog(this, "Hãy nhập kho sản phẩm!!!");
        }
        else if(index == -1){
            JOptionPane.showMessageDialog(this, "Hãy chọn sản phẩm muốn xóa!!!");
        }
        else{
            ThietBi s = list.get(index);
            try {
                if(sql.DeleteThietBi(s)){
                    JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công!!!!");
                    list.remove(s);
                    model.removeRow(index);
                    model.fireTableDataChanged();
                } 
                else{
                    JOptionPane.showMessageDialog(this, "Lỗi !!! Không thể xóa sản phẩm");
                }   
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi !!! Không thể xóa sản phẩm");
            }
            TaiLaiTrang();
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        TaiLaiTrang();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed

    private void jButtonBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaoCaoActionPerformed
        MessageFormat header = new MessageFormat("Danh sách Thiết bị");
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
    }//GEN-LAST:event_jButtonBaoCaoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        index = jTable1.getSelectedRow() ;
        ThietBi s = list.get(index);
        tf_loaiTB.setText(""+s.getLoaiTB());
        tf_maKhu.setText(""+s.getMaKhu());
        tf_maTB.setText(""+s.getMaTB());
        tf_tinhtrang.setText(""+s.getTinhTrang());
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void TaiLaiTrang(){
        tf_loaiTB.setText("");
        tf_maKhu.setText("");
        tf_maTB.setText("");
        tf_tinhtrang.setText("");
        jTable1.clearSelection();
    }
    public void showResult() {
        ThietBi s = list.get(list.size() - 1);
        model.addRow(new Object[]{
            tf_maTB.getText(), tf_maKhu.getText(), tf_loaiTB.getText(), tf_tinhtrang.getText()
        });
        model.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonBaoCao;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_loaiTB;
    private javax.swing.JTextField tf_maKhu;
    private javax.swing.JTextField tf_maTB;
    private javax.swing.JTextField tf_tinhtrang;
    // End of variables declaration//GEN-END:variables
}