/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PILA;
import static sistema.Crearcatedratico.adressp;
import static sistema.Crearcatedratico.carnetp;
//import static sistema.Crearcatedratico.cursop;
import static sistema.Crearcatedratico.emailp;
import static sistema.Crearcatedratico.namep;
import static sistema.Crearcatedratico.passp;
import static sistema.Visualizarcatedratico.model;
import static sistema.Masivacatedratico.model1;

/**
 *
 * @author james
 */
public class Pila {
  //public static String carnetp,namep,cursop,adressp,emailp,passp;  
    Nodo primero;
    
    public Pila(){
        primero=null;
       
    }
    public void push(String carnet,String nombre,String adress,
            String mail,String password){
     Nodo pila=new Nodo();
     pila.carnet=carnet;
     pila.nombre=nombre;
    // pila.Curso=curso;
     pila.adress=adress;
     pila.Email=mail;
     pila.Password=password;
     
     pila.siguiente=primero;//siguiente a punte a primero ejemplo 25->null
     primero=pila;// primero sera el nuevo en este caso seria la cabeza de la pila
        System.out.println("Nodo fue creada");   
    }
    public void pilabuscar(String carnet){
        Nodo buscar =new Nodo();
        buscar=primero;
        boolean bandera=false;
              
        if(primero!=null){         
        while(buscar!=null&& bandera!=true){
            if(buscar.carnet.equals(carnet)){
             carnetp=buscar.carnet;
             namep=buscar.nombre;
             //cursop=buscar.Curso;
             adressp=buscar.adress;
             emailp=buscar.Email;
             passp=buscar.Password;
                bandera=true;
                System.out.println("informacion encontrada");
                System.out.println(carnetp+" , "+namep+" , "+adressp+" , "+emailp+" , "+passp);
            }
            buscar=buscar.siguiente; 
        }    
           if(!bandera){
            System.out.println("El nudo no existe");
           }
        }else{
            System.out.println("La pila esta vacia");
        }
        
        
    }
public void modipila(String carnet,String nombre,String adress,
            String mail,String password){
    Nodo buscar =new Nodo();
        buscar=primero;
        boolean bandera=false;
              
        if(primero!=null){         
        while(buscar!=null&& bandera!=true){
            if(buscar.carnet.equals(carnet)){
            buscar.carnet=carnet;
             buscar.nombre=nombre;
             //buscar.Curso=curso;
             buscar.adress=adress;
             buscar.Email=mail;
             buscar.Password=password;
                System.out.println("Nodo ha sido modificado");  
             bandera=true;
               
            }
         buscar=buscar.siguiente; 
        }    
           if(!bandera){
            System.out.println("El nudo no existe");
           }
        }else{
            System.out.println("La pila esta vacia");
        }
           
    
    }
 public void eraserpila(String carnet){
      Nodo buscar =new Nodo();
        buscar=primero;
        Nodo anterior =new Nodo();
        anterior=null;
        boolean bandera=false;
              
        if(primero!=null){         
        while(buscar!=null&& bandera!=true){
            if(buscar.carnet.equals(carnet)){
               if(buscar==primero){
                   primero=primero.siguiente;///aqui estoy diciendo que ya no apute al siguiente si no al que le sigue
               }else{
                   anterior.siguiente=buscar.siguiente;
                   }
                bandera=true;
            }
            anterior=buscar;
          buscar=buscar.siguiente; 
        }    
           if(!bandera){
            System.out.println("El nudo no existe");
            
           }
        }else{
            System.out.println("La pila esta vacia");
        }
    }
 
 public void mostrarpila(){
     Nodo actual= new Nodo();
     actual=primero;
     if (primero!=null) {
         while(actual!=null){
              model.insertRow(model.getRowCount(),new Object[] {
                    actual.carnet,actual.nombre,actual.adress,
                 actual.Email,actual.Password});
            // System.out.println(actual.carnet+" , "+actual.nombre+" , "+actual.Curso+" , "+actual.adress+" , "+actual.Email+" , "+actual.Password);
         actual=actual.siguiente;
         }
     }else{ 
         System.out.println("\nLa pila esta vacia\n"); 
     }
 }
 
 public void mostrarpila3(){
     Nodo actual= new Nodo();
     actual=primero;
     if (primero!=null) {
         while(actual!=null){
              model1.insertRow(model1.getRowCount(),new Object[] {
                    actual.carnet,actual.nombre,actual.adress,
                 actual.Email,actual.Password});
            // System.out.println(actual.carnet+" , "+actual.nombre+" , "+actual.Curso+" , "+actual.adress+" , "+actual.Email+" , "+actual.Password);
         actual=actual.siguiente;
         }
     }else{ 
         System.out.println("\nLa pila esta vacia\n"); 
     }
 }
 }


