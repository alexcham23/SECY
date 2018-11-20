/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simple;
import javax.swing.JOptionPane;
import static sistema.Visualizarcurso.model;
import static sistema.Masivacurso2.model2;
import static sistema.asignacion2.boxlab;
import static sistema.asignacion2.txtasignarlab;
import static sistema.asignacion2.amenudo;
import static sistema.asignacion2.seccionclass;
import sistema.principal;
import static sistema.ingresar_nota.cursolist;
import static sistema.masivanotas.model4;
import static sistema.masivanotas.cursolist1;
import static sistema.listadoprofe.model5;
import static sistema.listadoprofe.cursolist2;
/**
 *
 * @author james
 */
public class Listasimplecircular {
public static String num2,namec,cate,pre,post,lab,seccion1;
//public static String [] vector=new String[20];
public static int credit;
//public static String [] vector=new String[20];
int contador=0;
    Nodo ultimo;
    Nodo primero;

    public Listasimplecircular() {
        primero = null;
        ultimo = null;
    }

    public void insertar(String numero, String nombre, String catedratico, int Creditos, String laboratorio,
            String prerequisito, String postrequisito,String seccion) {
        Nodo actual = new Nodo();
        actual.numero = numero;
        actual.nombre = nombre;
        actual.catedratico = catedratico;
        actual.Creditos = Creditos;
        actual.laboratorio = laboratorio;
        actual.prerequisito = prerequisito;
        actual.postrequisito = postrequisito;
        actual.seccion=seccion;

        if (primero == null) {
            primero = actual;
            ultimo = primero;
            primero.siguiente = ultimo;
        } else {
           
            ultimo.siguiente = actual;
            actual.siguiente = primero;
            ultimo = actual;
        }
        mostrarlista();
    }

    public void modificar(String numero, String nombre, String catedratico, int Creditos, String laboratorio,
            String prerequisito, String postrequisito, String seccion) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean bandera = false;
        do {
            if (actual.numero.equals(numero)) {
                actual.numero = numero;
                actual.nombre = nombre;
                actual.catedratico = catedratico;
                actual.Creditos = Creditos;
                actual.laboratorio = laboratorio;
                actual.prerequisito = prerequisito;
                actual.postrequisito = postrequisito;
                actual.seccion=seccion;
                bandera = true;
            }
            actual = actual.siguiente;
        } while (actual != primero);
        if (bandera == true) {
            System.out.println("nodo ha sido modificado");
        } else {
            System.out.println("El nodo no existe");
        }
    }
public void ascendente(){
    Nodo actual = new Nodo();
    Nodo aux = new Nodo();
    actual=primero;
    aux=null;
    while(actual.siguiente!=primero){
         aux=actual.siguiente;
        while(aux!=primero){
            if(aux.seccion.compareToIgnoreCase(actual.seccion)<0){
            String p=actual.seccion;
            actual.seccion=aux.seccion;
            aux.seccion=p;
            }
          //  JOptionPane.showMessageDialog(null,actual.seccion);
       aux=aux.siguiente;     
    }
      
    actual=actual.siguiente;
        
}
    
}
    public void eliminar(String p) {
        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();
        actual = primero;
        anterior = ultimo;
        boolean bandera = false;
        do {
            if (actual.numero.equals(p)) {
                if (actual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                } else if (actual == ultimo) {
                    anterior.siguiente = ultimo.siguiente;
                    ultimo = anterior;
                } else {
                    anterior.siguiente = actual.siguiente;

                }

                bandera = true;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != primero);
        if (bandera == true) {
           JOptionPane.showMessageDialog(null, "El curso fue eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "El curso no Existe");
        }
    }

    public void buscar3(String numero) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean bandera = false;
        do {
            
            if (actual.numero.equals(numero)) {
                bandera = true;
                num2=actual.numero;
                namec=actual.nombre;
                cate=actual.catedratico;
                credit=actual.Creditos;
                lab=actual.laboratorio;
                pre=actual.prerequisito;
                post=actual.postrequisito;
                seccion1=actual.seccion;
            }
            actual = actual.siguiente;
        } while (actual!= primero);
        if (bandera == true) {
            System.out.println(num2+" , "+namec+" , "+cate );
            System.out.println("nodo existe");
        } else {
            System.out.println("El nodo no existe");
        }
    }
    public void buscarcursprofe(String numero) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean bandera = false;
        do {
            
            if (actual.catedratico.equals(numero)) {
                bandera = true;
               cursolist.addItem(actual.nombre);
            }
            actual = actual.siguiente;
        } while (actual!= primero);
        if (bandera == true) {
            System.out.println(num2+" , "+namec+" , "+cate );
            System.out.println("nodo existe");
        } else {
            System.out.println("El nodo no existe");
        }
    }
    
        public void buscarcursprofe1(String numero) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean bandera = false;
        do {
            
            if (actual.catedratico.equals(numero)) {
                bandera = true;
               cursolist1.addItem(actual.nombre);
            }
            actual = actual.siguiente;
        } while (actual!= primero);
        if (bandera == true) {
            System.out.println(num2+" , "+namec+" , "+cate );
            System.out.println("nodo existe");
        } else {
            System.out.println("El nodo no existe");
        }
    }
        
         public void buscarcursprofe2(String numero) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean bandera = false;
        do {
            
            if (actual.catedratico.equals(numero)) {
                bandera = true;
               cursolist2.addItem(actual.nombre);
            }
            actual = actual.siguiente;
        } while (actual!= primero);
        if (bandera == true) {
            System.out.println(num2+" , "+namec+" , "+cate );
            System.out.println("nodo existe");
        } else {
            System.out.println("El nodo no existe");
        }
    }
        public void buscarparaasignacion(String curso,String sect) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean bandera = false;
        do {
            
            if (actual.nombre.equals(curso)&&actual.seccion.equals(sect)) {
                bandera = true;
                num2=actual.numero;
                namec=actual.nombre;
                cate=actual.catedratico;
                credit=actual.Creditos;
                lab=actual.laboratorio;
                pre=actual.prerequisito;
                post=actual.postrequisito;
                seccion1=actual.seccion;
            }
            actual = actual.siguiente;
        } while (actual!= primero);
        if (bandera == true) {
            System.out.println(num2+" , "+namec+" , "+cate );
            System.out.println("nodo existe");
        } else {
            System.out.println("El nodo no existe");
        }
    }
 public void buscarseccion(String clase) {
        Nodo actual = new Nodo();
      
        actual = primero;
        boolean bandera = false;
        do {
            
            if (actual.nombre.equals(clase)) {
                bandera = true;
                boolean existe=false;
                for (int i = 0; i <seccionclass.getItemCount()&&existe; i++) {
                    if(actual.seccion.equals(seccionclass.getItemAt(i))){
                        existe=true; 
                        actual=actual.siguiente;
                    }
                    
                                           }
                if(!existe){
                     if(actual.laboratorio.equals("S")){   
                         lab=actual.laboratorio;
                     boxlab.setVisible(true);
                     txtasignarlab.setVisible(true);
                    seccionclass.addItem(actual.seccion);
                     
                     }else{
                         seccionclass.addItem(actual.seccion);
                     }
                }
            }
            actual = actual.siguiente;
        } while (actual!= primero&&contador!=20);
        if (bandera == true) {
            //System.out.println(num2+" , "+namec+" , "+cate );
            System.out.println("nodo existe");
        } else {
            System.out.println("El nodo no existe");
        }
    }
    public void mostrarlista() {
        Nodo actual = new Nodo();
        actual = primero;
        do {
            System.out.println(actual.laboratorio+" , " + actual.numero+ " , "+actual.laboratorio);
            actual = actual.siguiente;
        } while (actual != primero);

    }
    public void mostrarlista2() {
        Nodo actual = new Nodo();
        actual = primero;
        do {
            model.insertRow(model.getRowCount(), new Object[]{
                actual.numero, actual.nombre, actual.catedratico, actual.Creditos,
                actual.laboratorio, actual.prerequisito, actual.postrequisito,actual.seccion});
            actual = actual.siguiente;
        } while (actual != primero);

    }
    public void mostrarlista3() {
        Nodo actual = new Nodo();
        actual = primero;
        do {
            model2.insertRow(model2.getRowCount(), new Object[]{
                actual.numero, actual.nombre, actual.catedratico, actual.Creditos,actual.seccion
                ,actual.laboratorio, actual.prerequisito, actual.postrequisito});
            actual = actual.siguiente;
        } while (actual != primero);

    }
    public void mostrarlista4() {
        Nodo actual = new Nodo();
        actual = primero;
        do {

            amenudo.addItem(actual.getNombre());

            actual = actual.siguiente;
        } while (actual != primero);

    }

   
}
