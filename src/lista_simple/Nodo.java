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
    public String seccion;
    public Nodo siguiente;

   public Nodo(){
      this.numero="";
      this.nombre="";
      this.catedratico="";
      this.Creditos=0;
      this.laboratorio="";
      this.prerequisito="";
      this.postrequisito="";
      this.seccion="";
      this.siguiente=null;
   }

    public Nodo(String numero, String nombre, String catedratico, int Creditos, String laboratorio, String prerequisito, String postrequisito, String seccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.catedratico = catedratico;
        this.Creditos = Creditos;
        this.laboratorio = laboratorio;
        this.prerequisito = prerequisito;
        this.postrequisito = postrequisito;
        this.seccion = seccion;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(String prerequisito) {
        this.prerequisito = prerequisito;
    }

    public String getPostrequisito() {
        return postrequisito;
    }

    public void setPostrequisito(String postrequisito) {
        this.postrequisito = postrequisito;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
   
    
}
