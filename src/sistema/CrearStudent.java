/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.Random;
import javax.swing.JOptionPane;
import lista_doble.Listadoblecircular;
import static lista_doble.Listadoblecircular.carnet3;
//import static lista_doble.Listadoblecircular.carnet2;
import static lista_doble.Listadoblecircular.pass2;
import static sistema.principal.add;

/**
 *
 * @author james
 */
public class CrearStudent extends javax.swing.JFrame {
String carga;
    /**
     * Creates new form CrearStudent
     */
    public CrearStudent() {
        initComponents();
        this.setLocationRelativeTo(null);
        radomalfanumerico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        textcarnet = new javax.swing.JTextField();
        textdpi = new javax.swing.JTextField();
        textadress = new javax.swing.JTextField();
        textcorreo = new javax.swing.JTextField();
        textcredit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Carnet:");

        jLabel2.setText("DPI/CUI:");

        jLabel3.setText("Nombre y Apellido:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Dirreccion:");

        jLabel6.setText("No. de Creditos:");

        textcarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcarnetKeyTyped(evt);
            }
        });

        textdpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textdpiKeyTyped(evt);
            }
        });

        textcredit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcreditKeyTyped(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 0, 51));

        label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textdpi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(textadress)
                                    .addComponent(textcredit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(53, 53, 53)
                                .addComponent(jButton2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(textcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textcredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
limpiar();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   revisar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      admin_student df=new admin_student();
      df.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void textcarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcarnetKeyTyped
 char c;
        c = evt.getKeyChar();
        
        if (c<'0'||c>'9') evt.consume();        
    }//GEN-LAST:event_textcarnetKeyTyped

    private void textdpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textdpiKeyTyped
        char c;
        c = evt.getKeyChar();
        
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textdpiKeyTyped

    private void textcreditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcreditKeyTyped
      char c;
        c = evt.getKeyChar();
        
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textcreditKeyTyped

    /**
     * @param args the command line arguments
     */
    public void radomalfanumerico(){
        Random rnd =new Random();
        String numero="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int contador=0;
        int posicion1=0;
        int posicion2=0;
        int posicion3=0;
        int posicion4=0;
        String cadena="";
        while(contador<1){
            posicion1=(int)(rnd.nextDouble()*numero.length()-1+0);
            cadena+= numero.charAt(posicion1);
            posicion3=(int)(rnd.nextDouble()*9);
            cadena+=posicion3;
            posicion2=(int)(rnd.nextDouble()*numero.length()-1+0);
            cadena+= numero.charAt(posicion2);
            posicion4=(int)(rnd.nextDouble()*9);
            cadena+=  posicion4;
            carga=cadena;
            //passtext.setText(cadena);
            contador++;
        }
    }
    public void revisar(){
         if(textcarnet.getText().equals("")||textdpi.getText().equals("")||txtnombre.getText().equals("")
             ||textcorreo.getText().equals("")||textadress.getText().equals("")||textcredit.getText().equals("")){
            JOptionPane.showMessageDialog(null,"por favor llene todas las casillas");
        }else{
             String verificar=textcarnet.getText();
             ingresar(verificar);
         }
         
    }    
    public void ingresar (String y){
               
       
        add.buscar2(y);
       
        //String pass = String.valueOf(passtext.getPassword());
       
        if(textcarnet.getText().equals(carnet3)){
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        } else {
      
             guardar();
        }
    
    }
    public void guardar(){
        String carnet=textcarnet.getText();
        String dpi=textdpi.getText();
        String nombre = txtnombre.getText();
        String correo =textcorreo.getText();
        String dirrecion=textadress.getText();
        int creditos =Integer.parseInt(textcredit.getText());
        
        
       
            radomalfanumerico();
            String password=carnet+carga;
        add.ingresarNodo(carnet, dpi, nombre, correo, dirrecion, creditos, password);
        
        label1.setText("SE GUARDO EXITOSAMENTE...TU CONTRASEÑA ES:");
        label2.setText(password);
        add.mostrar();
                    
    }
    public void limpiar(){
        textcarnet.setText("");
        textdpi.setText("");
        txtnombre.setText("");
        textcorreo.setText("");
        textadress.setText("");
        textcredit.setText("");
        label1.setText("");
        label2.setText("");
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JTextField textadress;
    private javax.swing.JTextField textcarnet;
    private javax.swing.JTextField textcorreo;
    private javax.swing.JTextField textcredit;
    private javax.swing.JTextField textdpi;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
