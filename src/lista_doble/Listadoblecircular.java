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
   //
    public static String pass2,dpis,carnet3,name,email,adress;
    public static int creditos;
    Nodo primero;
    Nodo ultimo;
  
    public Listadoblecircular(){
        primero=null;
        ultimo=null;
    }
    
    public void ingresarNodo(String carnet,String dpi, String nombre,String correo,String dirrecion,int credito,String password){
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
            int dpi=Integer.parseInt(x);
            if(actual.carnet.equals(x)||actual.dpi==x){
                bandera=true;
                 pass2=actual.password;
             carnet3=String.valueOf(actual.carnet);
             name=actual.Nombre;
             dpis=actual.dpi;
             email=actual.correo;
             adress=actual.Dirreccion;
             creditos=actual.credito;
             
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
    public void modificar(String carnet,String dpi, String nombre,String correo,String dirrecion,int credito,String password){
          
    Nodo actual =new Nodo();
    actual=primero;
        do {
            if (actual.carnet.equals(carnet) ) {
                
                actual.carnet=carnet;
                actual.dpi=dpi;
                actual.Nombre=nombre;
                actual.correo=correo;
                actual.Dirreccion=dirrecion;
                actual.credito=credito;
                actual.password=password;
            }
            actual=actual.siguiente;
            
        } while (actual!=primero);
        
    }
    
    public void eliminarnudo(String x){
      Nodo actual =new Nodo();  
      Nodo anterior =new Nodo();  
      actual=primero;
      anterior=ultimo;
        do {
            if(actual.carnet.equals(x)){
                if (actual==primero) {
                    primero=primero.siguiente;
                    ultimo.siguiente=primero;
                    primero.anterior=ultimo;
                    
                }else if(actual==ultimo){
                    ultimo=anterior;
                    primero.anterior=ultimo;
                    ultimo.siguiente=primero;
                }else{
                    anterior.siguiente=actual.siguiente;
                    actual.siguiente.anterior=anterior;
                }
            }
            anterior=actual;
         actual=actual.siguiente;   
        } while (actual!=primero);
        
        
    }
}
