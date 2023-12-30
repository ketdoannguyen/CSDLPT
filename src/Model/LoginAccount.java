/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author An Vi
 */
public class LoginAccount {
    private String TenDangNhap ;
    private String MatKhau ;
    private String LoaiTK ;
    
    public LoginAccount(){}
    public LoginAccount(String a, String b, String c){
        TenDangNhap = a ;
        MatKhau = b ;
        LoaiTK = c;
    }
    
    public void setTenDangNhap(String a){
        TenDangNhap = a ;
    }
    public String getTenDangNhap(){
        return TenDangNhap ;
    }
    public void setMatKhau(String a){
        MatKhau = a ;
    }
    public String getMatKhau(){
        return MatKhau ;
    }
    public void setLoaiTK(String a){
        LoaiTK = a ;
    }
    public String getLoaiTK(){
        return LoaiTK ;
    }
}
