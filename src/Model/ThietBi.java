/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author An Vi
 */
public class ThietBi {
    private String MaTB ;
    private String MaKhu ;
    private String LoaiTB ;
    private int TinhTrang ;
    
    public ThietBi(){}
    public ThietBi(String a, String b, String c, int d){
        MaTB = a ;
        MaKhu = b ;
        LoaiTB = c;
        TinhTrang = d;
    }

    public String getMaTB() {
        return MaTB;
    }

    public void setMaTB(String MaTB) {
        this.MaTB = MaTB;
    }

    public String getMaKhu() {
        return MaKhu;
    }

    public void setMaKhu(String MaKhu) {
        this.MaKhu = MaKhu;
    }

    public String getLoaiTB() {
        return LoaiTB;
    }

    public void setLoaiTB(String LoaiTB) {
        this.LoaiTB = LoaiTB;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
}
