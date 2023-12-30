/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author An Vi
 */
public class Phong {
    private String MaPhong ;
    private String MaKhu ;
    private int trangthai ;
    
    public Phong(){}
    public Phong(String a, String b, int c){
        MaPhong = a ;
        MaKhu = b ;
        trangthai = c;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaKhu() {
        return MaKhu;
    }

    public void setMaKhu(String MaKhu) {
        this.MaKhu = MaKhu;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
}
