/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DocGhiFile {
    public static boolean ghiFile(List<NhanVien> list,String path){
        
        try {
            FileOutputStream fis = new FileOutputStream(path);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(list);
            ois.flush();
            ois.close();
            fis.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }
    public static List<NhanVien> docFile(String Paht){
        List<NhanVien> listNV = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(Paht);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            listNV = (List<NhanVien>) data;
           
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listNV;
    }
}
