/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static lista_doble.Listadoblecircular.carnet3;
import static lista_doble.Listadoblecircular.adress;
import static lista_doble.Listadoblecircular.name;
import static lista_doble.Listadoblecircular.dpis;
import static lista_doble.Listadoblecircular.creditos;
import static lista_doble.Listadoblecircular.email;
import static lista_doble.Listadoblecircular.pass2;
import static sistema.principal.add;
/**
 *
 * @author james
 */
public class MasivaStudent extends javax.swing.JFrame {
public static java.io.File fichero;    
public static FileNameExtensionFilter filter;
public static DefaultTableModel model1;
String carga;
    /**
     * Creates new form VisualizarStudent
     */
    public MasivaStudent() {
        initComponents();
        this.setLocationRelativeTo(null);
        model1= (DefaultTableModel)table1.getModel();
       
    }
    public void radomalfanumerico() {
        Random rnd = new Random();
        String numero = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int contador = 0;
        int posicion1 = 0;
        int posicion2 = 0;
        int posicion3 = 0;
        int posicion4 = 0;
        String cadena = "";
        while (contador < 1) {
            posicion1 = (int) (rnd.nextDouble() * numero.length() - 1 + 0);
            cadena += numero.charAt(posicion1);
            posicion3 = (int) (rnd.nextDouble() * 9);
            cadena += posicion3;
            posicion2 = (int) (rnd.nextDouble() * numero.length() - 1 + 0);
            cadena += numero.charAt(posicion2);
            posicion4 = (int) (rnd.nextDouble() * 9);
            cadena += posicion4;
            carga = cadena;
            //passtext.setText(cadena);
            contador++;
        }
    }
    public String abrirCSV() {
        String cadena = "";
         filter = new FileNameExtensionFilter("archivos ipce", "ipce");
         file25.setFileFilter(filter);
        int seleccion = file25.showOpenDialog(file25);
          
        if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION) {
               
               file25.setFileFilter(filter);
            fichero = file25.getSelectedFile();
            cadena = fichero.getAbsolutePath();
        }
        return cadena;
    }
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    public String parsearCSV() {
        FileReader fr = null;
        String cadena = "";
        int contar = 0;
        try {
            File sc = new File(abrirCSV());
            fr = new FileReader(sc);
            
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (contar-1!= 0) {
                    // Biblioteca libro = new Biblioteca();
                    String[] informacion;
                    informacion = linea.split(";");
                    if (informacion[0].equals("") || informacion[1].equals("") || informacion[2].equals("") || informacion[3].equals("")
                            || informacion[4].equals("") || informacion[5].equals("")) {
                        contar++;
                    } else if(isNumeric(informacion[0])==false||isNumeric(informacion[1])==false||isNumeric(informacion[5])==false){
                        contar++;
                    }else{    
                        String carnet = informacion[0];
                        String dpi = informacion[1];
                        String nombre = informacion[2];
                        String correo = informacion[3];
                        String dirrecion = informacion[4];
                        int creditos = Integer.parseInt(informacion[5]);

                        radomalfanumerico();
                        String password = carnet + carga;

                        add.ingresarNodo(carnet, dpi, nombre, correo, dirrecion, creditos, password);
                    }
                }
                contar++;
            }
        }
        catch(Exception e){
           // e.printStackTrace();
        }finally{
            try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
            }catch (Exception e2){ 
             //   e2.printStackTrace();
            }
        
            add.mostrar3();
        
    }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        file25 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carga Masiva de  Estudiante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet", "DPI/CUI", "Nombre ", "Correo", "Dirreccion", "No. de Creditos", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        jButton1.setText("Carga de Informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("CARGA MASIVA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        admin_student df = new admin_student();
        df.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   parsearCSV();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MasivaStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasivaStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasivaStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasivaStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasivaStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser file25;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
