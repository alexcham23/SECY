/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author james
 */
public class login extends JFrame{
    private JLabel  label1,label2;
    private JTextField texto1,texto2;
    private Container panel;
    
    public login(){
        super("Login");
        panel=this.getContentPane();
        this.setSize(300,500);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
}
