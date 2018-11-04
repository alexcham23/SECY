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
       String nombre="Jaime Amfra";
       String nombre2="oscar corleto";
       int n=21;
       int n2=21;
       String n3="40";
     
        String carnet="201602983";
        int carnet2=201602982;
        int dpi = 498850401;
        String nombre3 = "antoino";
        String nombre4 = "option65.la";
        String nombre5 = "option65";
                
       add.ingresarNodo(carnet, dpi, nombre, nombre2, nombre3, dpi, nombre4);
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
