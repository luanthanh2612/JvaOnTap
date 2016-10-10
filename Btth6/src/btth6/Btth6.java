/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth6;

import javax.swing.SwingUtilities;

/**
 *
 * @author PC
 */
public class Btth6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainUI UI = new MainUI("Nhan Vien");
            }
        });
    }
    
}
