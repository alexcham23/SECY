/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import lista_doble.Listadoblecircular;
  /**
 *
 * @author james
 */
public class principal {
    public static Listadoblecircular add =new Listadoblecircular() ;

  public void nose(){
       String nombre="Jaime Alejandro Armira";
       String nombre2="alejandro.james.rock9999@gmail.com";
       int n=21;
       int n2=21;
       String n3="60";
     
        String carnet="201602983";
        String dpi = "1764988500401";
        String nombre3 = "Col. San rafael zona 2, chimaltenango";
        String nombre4 = "option65.la";
        String nombre5 = "option65";
                
       add.ingresarNodo(carnet, dpi, nombre, nombre2, nombre3, n2, nombre4);
       // add.ingresarNodo(carnet2, dpi, nombre, nombre2, nombre3, dpi, nombre5);
       // add.ingresarNodo(n2, dpi, nombre, nombre2, nombre3, dpi, nombre5);
       add.mostrar();
     //add.buscar(carnet);
        
  }
    public static void main(String[] args) {
        bienvenida fg =new bienvenida();
        fg.setVisible(true);
        principal df=new principal();
        df.nose();
       
    }   
}
