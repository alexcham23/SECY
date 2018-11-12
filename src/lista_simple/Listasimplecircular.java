/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simple;
import javax.swing.JOptionPane;
import static sistema.Visualizarcurso.model;
import sistema.principal;
/**
 *
 * @author james
 */
public class Listasimplecircular {
public static String num2,namec,cate,pre,post,lab;
public static int credit;
    Nodo ultimo;
    Nodo primero;

    public Listasimplecircular() {
        primero = null;
        ultimo = null;
    }

    public void insertar(String numero, String nombre, String catedratico, int Creditos, String laboratorio,
            String prerequisito, String postrequisito) {
        Nodo actual = new Nodo();
        actual.numero = numero;
        actual.nombre = nombre;
        actual.catedratico = catedratico;
        actual.Creditos = Creditos;
        actual.laboratorio = laboratorio;
        actual.prerequisito = prerequisito;
        actual.postrequisito = postrequisito;

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
            String prerequisito, String postrequisito) {
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
                actual.laboratorio, actual.prerequisito, actual.postrequisito});
            actual = actual.siguiente;
        } while (actual != primero);

    }

}
