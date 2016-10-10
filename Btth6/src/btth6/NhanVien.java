/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth6;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author PC
 */
public class NhanVien implements Serializable{
    private int maNV;
    private String tenNV;
    private Date namSinh;
    private Date ngayVaoLam;
    private PhongBan phongBan;

    public NhanVien(int maNV, String tenNV, Date namSinh, Date ngayVaoLam, PhongBan phongBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namSinh = namSinh;
        this.ngayVaoLam = ngayVaoLam;
        this.phongBan = phongBan;
    }

    public NhanVien() {
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return tenNV;
    }
    
    
}
