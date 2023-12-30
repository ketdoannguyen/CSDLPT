/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author An Vi
 */
public class PhieuMuon {
    private int MAPM ;
    private String MAPHG ;
    private String THOIDIEMMUON ;
    private String HANTRA ;
    private String THOIDIEMTRA ;
    private String NGUOILAPPHIEU ;
    
    public PhieuMuon(){}
    public PhieuMuon(int a, String b, String c, String d, String e, String f){
        MAPM = a ;
        MAPHG = b ;
        THOIDIEMMUON = c;
        HANTRA = d;
        THOIDIEMTRA = e;
        NGUOILAPPHIEU = f;
        
    }

    public int getMAPM() {
        return MAPM;
    }

    public void setMAPM(int MAPM) {
        this.MAPM = MAPM;
    }

    public String getMAPHG() {
        return MAPHG;
    }

    public void setMAPHG(String MAPHG) {
        this.MAPHG = MAPHG;
    }

    public String getTHOIDIEMMUON() {
        return THOIDIEMMUON;
    }

    public void setTHOIDIEMMUON(String THOIDIEMMUON) {
        this.THOIDIEMMUON = THOIDIEMMUON;
    }

    public String getHANTRA() {
        return HANTRA;
    }

    public void setHANTRA(String HANTRA) {
        this.HANTRA = HANTRA;
    }

    public String getTHOIDIEMTRA() {
        return THOIDIEMTRA;
    }

    public void setTHOIDIEMTRA(String THOIDIEMTRA) {
        this.THOIDIEMTRA = THOIDIEMTRA;
    }

    public String getNGUOILAPPHIEU() {
        return NGUOILAPPHIEU;
    }

    public void setNGUOILAPPHIEU(String NGUOILAPPHIEU) {
        this.NGUOILAPPHIEU = NGUOILAPPHIEU;
    }
    
}
