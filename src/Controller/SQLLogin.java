/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import ConnectionSQL.*; 
import Model.LoginAccount;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author An Vi
 */
public class SQLLogin {
    private Connection conn ; 
    public SQLLogin(String loaitaikhoan){
        if (loaitaikhoan.equals("Main")){
            conn = ConnectionSQLMain.getConnection();
        }else if(loaitaikhoan.equals("KhuK")){
            conn = ConnectionSQLKhuK.getConnection();
        }else if(loaitaikhoan.equals("KhuV")){
            conn = ConnectionSQLKhuV.getConnection();
        }else{
            System.out.println("Controller.SQL_Login.<init>()");
        }
    }
    public boolean addDangNhap(LoginAccount x) throws SQLException{
        String sql = "INSERT INTO TAIKHOAN(TENTAIKHOAN,MATKHAU,LOAITAIKHOAN) VALUES(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,x.getTenDangNhap());
        ps.setString(2,x.getMatKhau());
        ps.setString(3,x.getLoaiTK());
        return ps.executeUpdate() > 0 ;
    }
    
    public ArrayList<LoginAccount> getListDangNhap(){
        ArrayList<LoginAccount> list = new ArrayList<LoginAccount>();
        list.clear();
        String sql = "SELECT * FROM TAIKHOAN";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoginAccount x = new LoginAccount();
                x.setTenDangNhap(rs.getString("TENTAIKHOAN"));
                x.setMatKhau(rs.getString("MATKHAU"));
                x.setLoaiTK(rs.getString("LOAITAIKHOAN"));
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    public static void main(String[] args) {
       var a  = new SQLLogin("KhuK").getListDangNhap();
        System.out.println(a);
    }
}
