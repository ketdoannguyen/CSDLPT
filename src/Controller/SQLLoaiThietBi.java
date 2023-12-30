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
/**
 *
 * @author An Vi
 */
public class SQLLoaiThietBi {
//    private Connection conn ;
//    private ArrayList<ThietBi> list;
//    public SQLLoaiThietBi(String loaitaikhoan){
//        if (loaitaikhoan.equals("Main")){
//            conn = ConnectionSQLMain.getConnection();
//        }else if(loaitaikhoan.equals("KhuK")){
//            conn = ConnectionSQLKhuK.getConnection();
//        }else if(loaitaikhoan.equals("KhuV")){
//            conn = ConnectionSQLKhuV.getConnection();
//        }else{
//            System.out.println("Controller.SQL_Login.<init>()");
//        }
//    }
//    
//    public ArrayList<ThietBi> getList(){
//        ArrayList<ThietBi> list = new ArrayList<ThietBi>();
//        list.clear();
//        String sql = "SELECT * FROM LOAITB";
//        try{
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                ThietBi x = new ThietBi();
//                x.setMaTB(rs.getString("MALOAI"));
//                x.setMaKhu(rs.getString("TENLOAI"));
//                
//                list.add(x);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return list ;
//    }
}