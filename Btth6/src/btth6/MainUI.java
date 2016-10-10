/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author PC
 */
public class MainUI extends JFrame implements ActionListener{

    JLabel lblPhongBan,lblMaSV,lblTenSV,lblNamSinh,lblNgayVaoLam;
    JTextField txtMaSV,txtTenSV,txtNamSinh,txtNgayVaoLam;
    JComboBox<PhongBan> cboxPhongBan;
    JList<NhanVien> listNV;
    JButton btnThem,btnXoa,btnSua,btnThoat;
    
    public MainUI(String title) throws HeadlessException {
        super(title);
        this.setSize(550, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
        addControls();
    }

    private void addControls() {
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        this.add(pnMain);
        
        JPanel pnPhongBan = new JPanel();
        lblPhongBan = new JLabel("Chon Phong Ban");
        cboxPhongBan = new JComboBox<>();
        cboxPhongBan.setPreferredSize(new Dimension(200, 25));
        pnPhongBan.add(lblPhongBan);
        pnPhongBan.add(cboxPhongBan);
        

        JPanel pnDanhSachThongTin = new JPanel();
        pnDanhSachThongTin.setLayout(new BoxLayout(pnDanhSachThongTin, BoxLayout.X_AXIS));
        pnDanhSachThongTin.setPreferredSize(new Dimension(0,100));
        
        JPanel pnDanhSach = new JPanel();
        pnDanhSach.setLayout(new BorderLayout());
       
        Border borDanhSach = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titleDanhSach = new TitledBorder(borDanhSach, "Danh Sach");
        pnDanhSach.setBorder(titleDanhSach);
        listNV = new JList<>();
        listNV.setPreferredSize(new Dimension(pnDanhSach.getPreferredSize()));
        JScrollPane scrollPane = new JScrollPane(listNV,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnDanhSach.add(scrollPane);
        
        JPanel pnThongTin = new JPanel();
        pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
        pnThongTin.setPreferredSize(new Dimension(pnDanhSach.getPreferredSize()));
        Border borThongTin = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titleThongTin = new TitledBorder(borThongTin, "Thong Tin");
        pnThongTin.setBorder(titleThongTin);
        
        JPanel pnMaSV  = new JPanel();
        lblMaSV = new JLabel("Ma Nhan Vien");
        txtMaSV = new JTextField(20);
        pnMaSV.add(lblMaSV);
        pnMaSV.add(txtMaSV);
        
        JPanel pnTenSV  = new JPanel();
        lblTenSV = new JLabel("Ten Nhan Vien");
        txtTenSV = new JTextField(20);
        pnTenSV.add(lblTenSV);
        pnTenSV.add(txtTenSV);
        
        JPanel pnNamSinh  = new JPanel();
        lblNamSinh = new JLabel("Nam Sinh");
        txtNamSinh = new JTextField(20);
        pnNamSinh.add(lblNamSinh);
        pnNamSinh.add(txtNamSinh);
        
        JPanel pnNgayVaoLam  = new JPanel();
        lblNgayVaoLam = new JLabel("Ngay Vao Lam");
        txtNgayVaoLam = new JTextField(20);
        pnNgayVaoLam.add(lblNgayVaoLam);
        pnNgayVaoLam.add(txtNgayVaoLam);
        
        pnThongTin.add(pnMaSV);
        pnThongTin.add(pnTenSV);
        pnThongTin.add(pnNamSinh);
        pnThongTin.add(pnNgayVaoLam);
       
        pnDanhSachThongTin.add(pnDanhSach);
        pnDanhSachThongTin.add(pnThongTin);
        
        JPanel pnButton = new JPanel();
        pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        btnSua = new JButton("Sua");
        btnThem = new JButton("Them");
        btnXoa = new JButton("Xoa");
        btnThoat = new JButton("Thoat");
        
        pnButton.add(btnSua);
        pnButton.add(btnThem);
        pnButton.add(btnXoa);
        pnButton.add(btnThoat);
        
        pnMain.add(pnPhongBan);
        pnMain.add(pnDanhSachThongTin);
        pnMain.add(pnButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }
    
    
    
    
}
