/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class PhongBan implements Serializable{
    private int maPhongBan;
    private String tenPhongBan;
    private List<NhanVien> list;
    public PhongBan(int maPhongBan, String tenPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
    }
    
    public void themPhongBan(NhanVien nv){
        this.list.add(nv);
        nv.setPhongBan(this);
       
    }
    
    public PhongBan() {
        list = new ArrayList<>();
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public List<NhanVien> getList() {
        return list;
    }

    public void setList(List<NhanVien> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return tenPhongBan;
    }
    
    
}
