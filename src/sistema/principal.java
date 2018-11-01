/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author james
 */
/* public void guardar(){
     
         
            if(container<usuarios.length){
                String Name ="alejandro";
                String Lastname="armira";
                int edad=25;
                int Id=201602983;
                String Rol="Administrador";
                String Nacionalidad = "Guatemala";
                String Username= "admin";
                String password =String.valueOf("201602983");
                String email="alejoarmira@gmail.com";
                
               // JOptionPane.showMessageDialog(this,"El Usuario se ha registrado correctamente");
                reger = new register(Name,Lastname,edad,Id,Rol,Nacionalidad,Username,password,email);
                usuarios[container]=reger;
                container++;
            }
            
            // esto era para ver si en realidad esta guardando
            for(int i=0;i<container;i++){
                 System.out.println("el rol es "+usuarios[i].getRol()+" El Usuario es "+usuarios[i].getUsername());
            }
           
        
    }*/
public class principal {
    public static void main(String[] args) {
        bienvenida fg =new bienvenida();
        fg.setVisible(true);
    }
}
