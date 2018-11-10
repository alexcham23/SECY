/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import lista_doble.Listadoblecircular;
import PILA.Pila;
  /**
 *
 * @author james
 */
public class principal {
    public static Listadoblecircular add =new Listadoblecircular() ;
    public static Pila pila= new Pila();
    
    public void mestro(){
        String carnet ="201800010";
        String carnet2 ="201800011";
        String Nombre ="Fernando Garcia";
        String curso="Fisica Basica";
        String Dirrecion="9na Ave. 2-17 zona9";
        String email="fernandogarcia@gmai.com";
        String password="option65";
        pila.push(carnet, Nombre, curso,Dirrecion, email, password);
        pila.push(carnet2, Nombre, curso,Dirrecion, email, password);
        pila.mostrarpila();
        pila.pilabuscar(carnet);
    }
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
       df.mestro();
    }   
}
