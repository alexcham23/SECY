/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author james
 */
public class inicio extends JFrame{
   private JButton boton1,boton2;
   private Container panel;
    public inicio(){
        panel=this.getContentPane();
        this.setSize(600,400);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
}
