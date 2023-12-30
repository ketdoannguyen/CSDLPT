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
import Model.PhieuMuon;
/**
 *
 * @author An Vi
 */
public class SQLPhieuMuon {
    private Connection conn ;
    private ArrayList<PhieuMuon> list;
    public SQLPhieuMuon(String loaitaikhoan){
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
    
    public ArrayList<PhieuMuon> getList(){
        ArrayList<PhieuMuon> list = new ArrayList<PhieuMuon>();
        list.clear();
        String sql = "SELECT * FROM PHIEUMUON";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                PhieuMuon x = new PhieuMuon();
                x.setMAPM(rs.getInt("MAPM"));
                x.setMAPHG(rs.getString("MAPHG"));
                x.setTHOIDIEMMUON(rs.getString("THOIDIEMMUON"));
                x.setHANTRA(rs.getString("HANTRA"));
                x.setTHOIDIEMTRA(rs.getString("THOIDIEMTRA"));
                x.setNGUOILAPPHIEU(rs.getString("NGUOILAPPHIEU"));
                
                list.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list ;
    }
//    public boolean addThietBi(PhieuMuon x) throws SQLException{
//        String sql = "INSERT INTO THIETBI(MATBI,MAKHU,LOAITBI,TINHTRANGTB) VALUES(?,?,?,?) ;";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setString(1,x.getMaTB());
//        ps.setString(2,x.getMaKhu());
//        ps.setString(3,x.getLoaiTB());
//        ps.setInt(4,x.getTinhTrang());
//        return ps.executeUpdate() > 0 ;
//    }
//    
//    public boolean EditThietBi(PhieuMuon x) throws SQLException{
//        String sql = "UPDATE THIETBI SET MAKHU = '"+x.getMaKhu()
//                 + "' , LOAITBI = '"+x.getLoaiTB()
//                 + "' , TINHTRANGTB = '"+x.getTinhTrang()
//                + "' WHERE MATBI = '"+x.getMaTB()+"'  ; ";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        return ps.executeUpdate() > 0 ;
//    }
//    public boolean DeleteThietBi(PhieuMuon x) throws SQLException{
//        String sql = "DELETE FROM THIETBI WHERE (MATBI = '"+x.getMaTB()+"' );";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        return ps.executeUpdate() > 0 ;
//    }
}