/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simple;

/**
 *
 * @author james
 */
public class Nodo {
    public String numero;
    public String nombre;
    public String catedratico;
    public int Creditos;
    public String laboratorio;
    public String prerequisito;
    public String postrequisito;
    public Nodo siguiente;

   public Nodo(){
      this.numero="";
      this.nombre="";
      this.catedratico="";
      this.Creditos=0;
      this.laboratorio="";
      this.prerequisito="";
      this.postrequisito="";
   }
   
    
}
