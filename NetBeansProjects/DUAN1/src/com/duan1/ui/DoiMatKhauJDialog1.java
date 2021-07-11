/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.dao.NhanVienDAO;
import com.duan1.utils.Auth;
import com.duan1.utils.MsgBox;
import com.duan1.entity.NhanVien;
import com.duan1.utils.XImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 *
 * @author Admin
 */
public class DoiMatKhauJDialog1 extends javax.swing.JDialog {

    
    
    public DoiMatKhauJDialog1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMatKhauMoi1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtMatKhauMoi2 = new javax.swing.JPasswordField();
        btnDoiMatKhau = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        chkShowPass = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FireCode - Đổi mật khẩu");
        setUndecorated(true);

        jPanel1.setLayout(null);

        pnlMenu.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mật khẩu mới");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jLabel8);
        jLabel8.setBounds(40, 150, 110, 20);

        txtMatKhauMoi1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMatKhauMoi1.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauMoi1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pnlMenu.add(txtMatKhauMoi1);
        txtMatKhauMoi1.setBounds(40, 180, 300, 16);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mật khẩu hiện tại");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jLabel9);
        jLabel9.setBounds(40, 220, 130, 20);

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pnlMenu.add(txtMatKhau);
        txtMatKhau.setBounds(40, 250, 300, 16);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Xác nhận mật khẩu mới");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jLabel10);
        jLabel10.setBounds(40, 290, 180, 20);

        txtMatKhauMoi2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMatKhauMoi2.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauMoi2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhauMoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauMoi2ActionPerformed(evt);
            }
        });
        pnlMenu.add(txtMatKhauMoi2);
        txtMatKhauMoi2.setBounds(40, 320, 300, 16);

        btnDoiMatKhau.setBackground(new java.awt.Color(0, 51, 153));
        btnDoiMatKhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setText("Đồng ý");
        btnDoiMatKhau.setAlignmentY(0.0F);
        btnDoiMatKhau.setBorder(null);
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        pnlMenu.add(btnDoiMatKhau);
        btnDoiMatKhau.setBounds(80, 390, 91, 35);

        btnHuy.setBackground(new java.awt.Color(0, 0, 0));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy bỏ");
        btnHuy.setAlignmentY(0.0F);
        btnHuy.setBorder(null);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHuy);
        btnHuy.setBounds(210, 390, 90, 35);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tên tài khoản");
        pnlMenu.add(jLabel11);
        jLabel11.setBounds(40, 80, 110, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ĐỔI MẬT KHẨU");
        pnlMenu.add(jLabel2);
        jLabel2.setBounds(90, 20, 200, 29);

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaNV.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pnlMenu.add(txtMaNV);
        txtMaNV.setBounds(40, 110, 300, 16);

        chkShowPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkShowPass.setForeground(new java.awt.Color(255, 255, 255));
        chkShowPass.setText("Hiện mật khẩu!!");
        chkShowPass.setBorder(null);
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });
        pnlMenu.add(chkShowPass);
        chkShowPass.setBounds(40, 350, 110, 15);

        jPanel1.add(pnlMenu);
        pnlMenu.setBounds(200, 60, 370, 480);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\DUAN1\\DUAN1\\src\\com\\duan1\\icon\\background5.jpg")); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.huyBo();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        this.doiMK();
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void txtMatKhauMoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauMoi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoi2ActionPerformed

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        // TODO add your handling code here:
        if(chkShowPass.isSelected()){
            txtMatKhau.setEchoChar((char)0);
            txtMatKhauMoi1.setEchoChar((char)0);
            txtMatKhauMoi2.setEchoChar((char)0);
        }else{
            txtMatKhau.setEchoChar('*');
            txtMatKhauMoi1.setEchoChar('*');
            txtMatKhauMoi2.setEchoChar('*');
        }
    }//GEN-LAST:event_chkShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DoiMatKhauJDialog1 dialog = new DoiMatKhauJDialog1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnHuy;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi1;
    private javax.swing.JPasswordField txtMatKhauMoi2;
    // End of variables declaration//GEN-END:variables

    private void init() {
        txtMaNV.setBackground(new java.awt.Color(0,0,0,0));
        txtMatKhau.setBackground(new java.awt.Color(0,0,0,0));
        txtMatKhauMoi1.setBackground(new java.awt.Color(0,0,0,0));
        txtMatKhauMoi2.setBackground(new java.awt.Color(0,0,0,0));
        pnlMenu.setBackground(new java.awt.Color(0,0,0,250));
        this.setLocationRelativeTo(null);
        setIconImage(XImage.getAppIcon());
    }
    
    NhanVienDAO dao = new NhanVienDAO();
    
    private void huyBo() {
        this.dispose();
        new DangNhap1JDialog(null, true).setVisible(true);
    }
    
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;database=duan1";
    private static String username = "sa";
    private static String password = "123";
    
    void doiMK() {
        String Manhanvien = txtMaNV.getText();
        String Matkhau = new String(txtMatKhau.getPassword());
        NhanVien nhanVien = dao.selectById(Manhanvien);
        if (nhanVien == null) {
            MsgBox.alert(this, "Xác nhận lại tên đăng nhập!");
            
        } else if (!Matkhau.equals(nhanVien.getMatkhau())) {
            MsgBox.alert(this, "Sai mật khẩu!");
        } else {
            Connection conn = null;
            Statement stml = null;
            ResultSet rs = null;
            try {
                System.out.println("Đang kết nối đến dữ liệu....");
                conn = DriverManager.getConnection(dburl, username, password);//Kết nối CSDL bằng đối tượng Connection
                String sql = "Select * from nhanvien";
                stml = conn.createStatement();//Tạo đối tượng Statement
                rs = stml.executeQuery(sql);//Thi hành câu truy vấn
                String user, pass;
                boolean role;
                boolean flag = false;
                while (rs.next()) {    //Xử lý kết quả             
                    user = rs.getString("Manhanvien");
                    pass = rs.getString("Matkhau");
                    if (user.equalsIgnoreCase(txtMaNV.getText()) && pass.equalsIgnoreCase(txtMatKhau.getText())) {
                        flag = true;
                        role = rs.getBoolean("vaitro");
                        Auth.user = nhanVien;
                        if (role == true) {
//                            MsgBox.alert(this, "Đăng nhập vai trò nhân viên thành công!");
//                            new QuanTriVienUI().setVisible(true);
                            String matKhauMoi = new String(txtMatKhauMoi2.getPassword());
                            String matKhauMoi2 = new String(txtMatKhauMoi2.getPassword());
                            
                            if (!Manhanvien.equalsIgnoreCase(Auth.user.getManhanvien())) {
                                MsgBox.alert(this, "Sai tên đăng nhập!");
                            } else if (!Matkhau.equals(Auth.user.getMatkhau())) {
                                MsgBox.alert(this, "Sai mật khẩu!");
                            } else if (matKhauMoi.equals("")) {
                                MsgBox.alert(this, "Mật khẩu mới trống");
                            }else if (!matKhauMoi.equals(matKhauMoi2)) {
                                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
                            } else {
                                Auth.user.setMatkhau(matKhauMoi);
                                dao.update(Auth.user);
                                MsgBox.alert(this, "Đổi mật khẩu thành công!");
                            }
                            // dispose(); // thoát khỏi login
                        } else {
//                            MsgBox.alert(this, "Đăng nhập vai trò quản lý thành công!");
//                            new NhanVienUI().setVisible(true);
                            String matKhauMoi = new String(txtMatKhauMoi2.getPassword());
                            String matKhauMoi2 = new String(txtMatKhauMoi2.getPassword());
                            
                            if (!Manhanvien.equalsIgnoreCase(Auth.user.getManhanvien())) {
                                MsgBox.alert(this, "Sai tên đăng nhập!");
                            } else if (!Matkhau.equals(Auth.user.getMatkhau())) {
                                MsgBox.alert(this, "Sai mật khẩu!");
                            } else if (!matKhauMoi.equals(matKhauMoi2)) {
                                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
                            } else {
                                Auth.user.setMatkhau(matKhauMoi);
                                dao.update(Auth.user);
                                MsgBox.alert(this, "Đổi mật khẩu thành công!");
                            }
                            // dispose(); // thoát khỏi login
                        }
                    }
                }
                if (flag == false) {
                    MsgBox.alert(this, "Đăng nhập thất bại");
                }
                rs.close(); // đóng mọi thứ (ResultSet)
                stml.close();// đóng câu lệnh
                conn.close();// đóng kết nối

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
