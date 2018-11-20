/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import javax.swing.JOptionPane;
import  sistema.principal;
import static lista_simple.Listasimplecircular.num2;
import static lista_simple.Listasimplecircular.cate;
import static lista_simple.Listasimplecircular.credit;
import static lista_simple.Listasimplecircular.lab;
import static lista_simple.Listasimplecircular.namec;
import static lista_simple.Listasimplecircular.post;
import static lista_simple.Listasimplecircular.pre;
import static lista_simple.Listasimplecircular.seccion1;
import static sistema.principal.lista;
/**
 *
 * @author james
 */
public class Modificarcurso extends javax.swing.JFrame {


    public Modificarcurso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textcate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textcredito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        textpre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textpost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        buscartext = new javax.swing.JTextField();
        buscarbutton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        textseccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Curso");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("No. de Curso:");

        jLabel2.setText("Nombre del Curso:");

        jLabel3.setText("Codigo Catedratic@:");

        textcate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcateKeyTyped(evt);
            }
        });

        jLabel4.setText("Creditos:");

        textcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcreditoActionPerformed(evt);
            }
        });
        textcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcreditoKeyTyped(evt);
            }
        });

        jLabel5.setText("Laboratorio S/N:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "S", "N" }));

        jLabel6.setText("Pre_requisito:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Ejemplo: Pre_requisito1, Pre_requisito2, Pre_requisito3");

        jLabel8.setText("Post_requisito:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Ejemplo: Post_requisito1, Post_requisito2, Post_requisito3");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Buscar No. Curso:");

        buscartext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscartextKeyTyped(evt);
            }
        });

        buscarbutton.setText("Buscar");
        buscarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbuttonActionPerformed(evt);
            }
        });

        jLabel11.setText("Seccion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(guardar)
                        .addGap(89, 89, 89)
                        .addComponent(limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscartext, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(buscarbutton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textnum)
                                        .addComponent(textname)
                                        .addComponent(textcate, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(textcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textpre)
                                        .addComponent(textpost)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                                    .addComponent(textseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(buscartext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarbutton))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textcate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(textpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textseccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(limpiar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcreditoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      admin_curso df=new admin_curso();
      df.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
      revisar();
    }//GEN-LAST:event_guardarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed

    private void buscarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbuttonActionPerformed
revisar2();        // TODO add your handling code here:
    }//GEN-LAST:event_buscarbuttonActionPerformed

    private void buscartextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscartextKeyTyped
      char c;
        c = evt.getKeyChar();
        
        if (c<'0'||c>'9') evt.consume(); 
    }//GEN-LAST:event_buscartextKeyTyped

    private void textcreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcreditoKeyTyped
       char c;
        c = evt.getKeyChar();
        
        if (c<'0'||c>'9') evt.consume(); 
    }//GEN-LAST:event_textcreditoKeyTyped

    private void textcateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcateKeyTyped
    char c;
        c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_textcateKeyTyped
 
    public void revisar(){
         
          
          System.out.println(num2+"");
         if(textnum.getText().equals("")||textname.getText().equals("")||textcate.getText().equals("")
             ||textcredito.getText().equals("")){
            JOptionPane.showMessageDialog(null,"por favor llene todas las casillas");
        }else if(jComboBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"por favor seleccione Si o No, en el area de laboratorio  ");
        }else{
             String buscar=textnum.getText();
            ingresar(buscar);
         }
         
    }    
    
    public void ingresar(String buscar) {
        lista.buscar3(buscar);

        if (textnum.getText().equals(num2)) {
             guardar();
            JOptionPane.showMessageDialog(null, "Informacion Guardada Exitosamente");
            
        } else {
           JOptionPane.showMessageDialog(null, "El usuario NO existe");
        }

    }

    public void guardar() {
        String carnet = textnum.getText();
        String name = textname.getText();
        String catedratico = textcate.getText();
        int credito = Integer.parseInt(textcredito.getText());
        String laboratorio = jComboBox1.getSelectedItem().toString();
        String pre = textpre.getText();
        String post = textpost.getText();
        String seccion=textseccion.getText();

        lista.modificar(carnet, name, catedratico, credito, laboratorio, pre, post,seccion);
        
    }
    public void limpiar() {
        textnum.setText("");
        textname.setText("");
        textcate.setText("");
        textcredito.setText("");
        jComboBox1.setSelectedIndex(0);
        textpre.setText("");
        textpost.setText("");
        textseccion.setText("");
    }

    public void revisar2() {
        

        if (buscartext.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "por favor llene la casilla");
        } else {
            String verificar = buscartext.getText();
              lista.buscar3(verificar);

        //String pass = String.valueOf(passtext.getPassword());
        // int dop=Integer.parseInt(textcarnet.getText());
        if (buscartext.getText().equals(num2)) {
            textnum.setText(num2);
            textcate.setText(cate);
            textname.setText(namec);
            textpost.setText(post);
            textpre.setText(pre);
            jComboBox1.setSelectedItem(lab);
            textcredito.setText(Integer.toString(credit));
            textseccion.setText(seccion1);
            buscartext.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "El curso No existe");
        }

        }

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
            java.util.logging.Logger.getLogger(Modificarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificarcurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarbutton;
    private javax.swing.JTextField buscartext;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField textcate;
    private javax.swing.JTextField textcredito;
    private javax.swing.JTextField textname;
    private javax.swing.JTextField textnum;
    private javax.swing.JTextField textpost;
    private javax.swing.JTextField textpre;
    private javax.swing.JTextField textseccion;
    // End of variables declaration//GEN-END:variables
}
