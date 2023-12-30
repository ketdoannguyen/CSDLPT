/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import ConnectionSQL.ConnectionSQLKhuK;
import ConnectionSQL.ConnectionSQLKhuV;
import ConnectionSQL.ConnectionSQLMain;
import java.sql.*;
import java.util.ArrayList;
import Model.ThietBi;
/**
 *
 * @author An Vi
 */
public class SQLThietBi {
    private Connection conn ;
    private ArrayList<ThietBi> list;
    public SQLThietBi(String loaitaikhoan){
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
    
    public ArrayList<ThietBi> getListThietBi(){
        ArrayList<ThietBi> list = new ArrayList<ThietBi>();
        list.clear();
        String sql = "SELECT * FROM THIETBI";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThietBi x = new ThietBi();
                x.setMaTB(rs.getString("MATBI"));
                x.setMaKhu(rs.getString("MAKHU"));
                x.setLoaiTB(rs.getString("LOAITBI"));
                x.setTinhTrang(rs.getInt("TINHTRANGTB"));
                
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    public boolean addThietBi(ThietBi x) throws SQLException{
        String sql = "INSERT INTO THIETBI(MATBI,MAKHU,LOAITBI,TINHTRANGTB) VALUES(?,?,?,?) ;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,x.getMaTB());
        ps.setString(2,x.getMaKhu());
        ps.setString(3,x.getLoaiTB());
        ps.setInt(4,x.getTinhTrang());
        return ps.executeUpdate() > 0 ;
    }
    
    public boolean EditThietBi(ThietBi x) throws SQLException{
        String sql = "UPDATE THIETBI SET MAKHU = '"+x.getMaKhu()
                 + "' , LOAITBI = '"+x.getLoaiTB()
                 + "' , TINHTRANGTB = '"+x.getTinhTrang()
                + "' WHERE MATBI = '"+x.getMaTB()+"'  ; ";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
    public boolean DeleteThietBi(ThietBi x) throws SQLException{
        String sql = "DELETE FROM THIETBI WHERE (MATBI = '"+x.getMaTB()+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeUpdate() > 0 ;
    }
}