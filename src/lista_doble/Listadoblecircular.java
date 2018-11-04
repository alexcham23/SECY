/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble;
import sistema.principal;
/**
 *
 * @author james
 */
public class Listadoblecircular {
    public static String carnet2;
    public static String pass2,carnet3;
    Nodo primero;
    Nodo ultimo;
  
    public Listadoblecircular(){
        primero=null;
        ultimo=null;
    }
    
    public void ingresarNodo(String carnet,int dpi, String nombre,String correo,String dirrecion,int credito,String password){
    Nodo nuevo =new Nodo();
    nuevo.carnet=carnet;
     nuevo.dpi=dpi;
    nuevo.Nombre=nombre;
    nuevo.correo=correo;
    nuevo.Dirreccion=dirrecion;
    nuevo.credito=credito;
    nuevo.password=password;
    if(primero==null){//si primero no tiene nada entonces es nuevo
        primero=nuevo;
        primero.siguiente=primero;
        nuevo.anterior=ultimo;
        ultimo=nuevo;
    }else{
        ultimo.siguiente=nuevo;
        nuevo.siguiente=primero;
        nuevo.anterior=ultimo;
        ultimo =nuevo;
        primero.anterior=ultimo;
    }
       
    }
    public void buscar(String x){
        Nodo actual =new Nodo();
        actual=primero;
        boolean bandera =false;
        do {
            if(actual.carnet.equals(x)){
                bandera=true;
            } 
            actual=actual.anterior;
        } while (actual!=primero);
        if(bandera==true){
            System.out.println(ultimo.carnet+" , "+actual.password);
      
        }else{
            System.out.println("el Nodo no existe");
        }
        
    }
    public void buscar2(String x){
        Nodo actual =new Nodo();
        actual=primero  ;
        boolean bandera =false;
        do {
            if(actual.carnet.equals(x)){
                bandera=true;
                 pass2=actual.password;
             carnet3=String.valueOf(actual.carnet);
            } 
            actual=actual.siguiente;
        } while (actual!=primero);
       
        if(bandera==true){
             
            System.out.println(carnet3+" , "+pass2);
      
        }else{
             System.out.println("el Nodo no existe");
        }
        
    }
    public void mostrar(){
       Nodo actual= new Nodo();
       actual=primero;
        do {
            System.out.println(actual.Nombre);
            System.out.println(actual.carnet);
            actual=actual.siguiente;
        } while (actual!=primero);
        
    }
    public void modificar(String name){
          
    Nodo actual =new Nodo();
    actual=primero;
        do {
            if (actual.carnet==name ) {
                
                actual.carnet=name;
                //actual.credito=edad;
            }
            actual=actual.siguiente;
            
        } while (actual!=primero);
        
    }
}
