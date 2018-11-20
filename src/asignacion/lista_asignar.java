/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion;

import javax.swing.JOptionPane;
import static sistema.asignacion2.model2;
import static sistema.Resultado.model;
import static sistema.Resultado.aprovedbox;
import static sistema.ingresar_nota.cursolist;
import static sistema.ingresar_nota.model3;
import static sistema.masivanotas.model4;
import static sistema.listadoprofe.model5;

/**
 *
 * @author james
 */
public class lista_asignar {

    public static String codigocurso, nombrecurso, catedratico, carnetprofe, seccion, carnetalumno, nombrealumno, status, semestre;
    public static int notafinal, ordenasignacion, credit;
    public static int contador, sumanotas;

    Nodo primero;
    Nodo ultimo;

    public lista_asignar() {
        primero = null;
        ultimo = null;
    }

    public void insertar(String codigoCurso, String nombrecurso, String catedratico, String carnetprofe,
            String Seccion, String CarnetStudent, String nombrestudent, String status, String semestre, int notafinal, int orden, int credito,
            String laboratorio) {
        Nodo actual = new Nodo();
        actual.codigoCurso = codigoCurso;
        actual.nombrecurso = nombrecurso;
        actual.catedratico = catedratico;
        actual.carnetprofe = carnetprofe;
        actual.Seccion = Seccion;
        actual.nombrestudent = nombrestudent;
        actual.CarnetStudent = CarnetStudent;
        actual.status = status;
        actual.semestre = semestre;
        actual.notafinal = notafinal;
        actual.orden = orden;
        actual.credito = credito;
        actual.laboratorio = laboratorio;

        if (primero == null) {
            primero = actual;
            primero.siguiente = null;
            primero.anterior = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = actual;
            actual.anterior = ultimo;
            actual.siguiente = null;
            ultimo = actual;
        }
    }

    public void buscar(String carnetstudent) {
        Nodo actual = new Nodo();
        actual = primero;

        do {
            if (actual.CarnetStudent.equals(carnetstudent)) {
                nombrecurso = actual.nombrecurso;
                catedratico = actual.catedratico;
                carnetprofe = actual.carnetprofe;
                seccion = actual.Seccion;
                carnetalumno = actual.CarnetStudent;
                nombrealumno = actual.nombrestudent;
                status = actual.status;
                semestre = actual.semestre;
                codigocurso = actual.codigoCurso;
                notafinal = actual.notafinal;
                ordenasignacion = actual.orden;
                credit = actual.credito;
            }
            actual = actual.siguiente;
        } while (actual != null);

    }

    public void buscar2(String carnetstudent) {
        Nodo actual = new Nodo();
        actual = primero;

        do {
            if (actual.CarnetStudent.equals(carnetstudent)) {
                boolean tomar = true;
                model2.insertRow(model2.getRowCount(), new Object[]{actual.orden, actual.nombrecurso, actual.catedratico, actual.Seccion, actual.credito, tomar});
            
            }
            actual = actual.siguiente;
        } while (actual != null);

    }

        public void listado (String carnetstudent,String semes,String Curs) {
        Nodo actual = new Nodo();
        actual = primero;
        //int num=0;
        do {
            if (actual.carnetprofe.equals(carnetstudent)&& actual.semestre.equals(semes)&& actual.nombrecurso.equals(Curs)) {
               credit=actual.credito;
               codigocurso=actual.codigoCurso; 
               model3.insertRow(model3.getRowCount(), new Object[]{actual.CarnetStudent , actual.nombrestudent, actual.notafinal});
            }
            actual = actual.siguiente;
        } while (actual != null);

    }
           public void listado2 (String carnetstudent,String semes,String Curs) {
        Nodo actual = new Nodo();
        actual = primero;
        //int num=0;
        do {
            if (actual.carnetprofe.equals(carnetstudent)&& actual.semestre.equals(semes)&& actual.nombrecurso.equals(Curs)) {
               credit=actual.credito;
               codigocurso=actual.codigoCurso;
                model4.insertRow(model4.getRowCount(), new Object[]{actual.CarnetStudent , actual.nombrestudent, actual.notafinal});
            }
            actual = actual.siguiente;
        } while (actual != null);

    }
                      public void listado3 (String carnetstudent,String semes,String Curs) {
        Nodo actual = new Nodo();
        actual = primero;
        contador=1;
sumanotas=0;
        do {
            if (actual.carnetprofe.equals(carnetstudent)&& actual.semestre.equals(semes)&& actual.nombrecurso.equals(Curs)) {
               codigocurso=actual.codigoCurso;
                credit=actual.credito;
                model5.insertRow(model5.getRowCount(), new Object[]{contador,actual.CarnetStudent , actual.nombrestudent, actual.notafinal});
             sumanotas=sumanotas+actual.notafinal;
             contador++;
            }
            actual = actual.siguiente;
        } while (actual != null);

    }
    public void buscar1(String carnetsp) {
        Nodo actual = new Nodo();
        actual = primero;

        do {
            if (actual.carnetprofe.equals(carnetsp)) {
                boolean existe = false;
                for (int i = 0; i < cursolist.getItemCount() && existe; i++) {
                    if (actual.nombrecurso.equals(cursolist.getItemAt(i).toString())) {
                        existe = true;
                        actual = actual.siguiente;
                    }

                }
                if (!existe) {

                    cursolist.addItem(actual.nombrecurso);

                }
            }
            actual = actual.siguiente;
        } while (actual != null);

    }

    public void buscartable2(String carnetstudent, String f, String g) {
        Nodo actual = new Nodo();
        actual = primero;
        boolean tomar=false;
        do {
            if (actual.CarnetStudent.equals(carnetstudent) && actual.status.equals(f) && actual.semestre.equals(g)) {
                   model.insertRow(model.getRowCount(), new Object[]{actual.nombrecurso, actual.catedratico, actual.Seccion, actual.notafinal, actual.status});
            
            } 
            actual = actual.siguiente;
        } while (actual != null);
        if(tomar=true){
            System.out.println("Informaicion guardada");
        }else {
                JOptionPane.showMessageDialog(null, "Lamento decirte que no tienes cursos Aprovados");
            }
    }

    public void modificar(String codigoCurso, String nombrecurso, String catedratico, String carnetprofe,
            String Seccion, String CarnetStudent, String nombrestudent, String status, String semestre, int notafinal, int orden, int credito,
            String laboratorio) {
        Nodo actual = new Nodo();
        actual = primero;

        do {
            if (actual.CarnetStudent.equals(CarnetStudent)) {
                actual.nombrecurso = nombrecurso;
                actual.catedratico = catedratico;
                actual.carnetprofe = carnetprofe;
                actual.Seccion = Seccion;
                actual.CarnetStudent = CarnetStudent;
                actual.nombrestudent = nombrestudent;
                actual.status = status;
                actual.semestre = semestre;
                actual.codigoCurso = codigoCurso;
                actual.notafinal = notafinal;
                actual.orden = orden;
                actual.credito = credito;
                actual.laboratorio = laboratorio;
            }
            actual = actual.siguiente;
        } while (actual != null);

    }
    public void modificarlista1( String studentcard,String cardprofe,String curs,String semes,String codigocurso,String status,int nota) {
        Nodo actual = new Nodo();
        actual = primero;

        do {
            if (actual.CarnetStudent.equals(studentcard) && actual.carnetprofe.equals(cardprofe)
                    && actual.nombrecurso.equals(curs)&& actual.semestre.equals(semes) && actual.codigoCurso.equals(codigocurso)) {
                
                actual.status = status;
                actual.notafinal = nota;
                
            }
            actual = actual.siguiente;
        } while (actual != null);

    }
    public void eliminar(String n) {
        Nodo actual = new Nodo();
        Nodo finals = new Nodo();
        actual = primero;
        finals = null;
        while (actual != null) {
            if (actual.CarnetStudent.equals(n)) {
                if (actual == primero) {
                    primero = primero.siguiente;
                    primero.anterior = null;
                } else {
                    finals.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

            }
            finals = actual;
            actual = actual.siguiente;
        }
    }

    public void ascendentecurso() {
        Nodo actual = new Nodo();
        Nodo aux = new Nodo();
        actual = primero;
        aux = null;
        while (actual.siguiente != null) {
            aux = actual.siguiente;
            while (aux != null) {
                if (aux.nombrecurso.compareToIgnoreCase(actual.nombrecurso) < 0) {
                    String p = actual.nombrecurso;
                    actual.nombrecurso = aux.nombrecurso;
                    aux.nombrecurso = p;
                }
                //  JOptionPane.showMessageDialog(null,actual.seccion);
                aux = aux.siguiente;
            }

            actual = actual.siguiente;

        }

    }

    public void ascendente() {
        Nodo actual = new Nodo();
        Nodo aux = new Nodo();
        actual = primero;
        aux = null;
        while (actual.siguiente != null) {
            aux = actual.siguiente;
            while (aux != null) {
                if (aux.notafinal < actual.notafinal) {
                    int p = actual.notafinal;
                    actual.notafinal = aux.notafinal;
                    aux.notafinal = p;
                }
                //  JOptionPane.showMessageDialog(null,actual.seccion);
                aux = aux.siguiente;
            }

            actual = actual.siguiente;

        }

    }

    public void descendente() {
        Nodo actual = new Nodo();
        Nodo aux = new Nodo();
        actual = primero;
        aux = null;
        while (actual.siguiente != null) {
            aux = actual.siguiente;
            while (aux != null) {
                if (aux.notafinal > actual.notafinal) {
                    int p = actual.notafinal;
                    actual.notafinal = aux.notafinal;
                    aux.notafinal = p;
                }
                //  JOptionPane.showMessageDialog(null,actual.seccion);
                aux = aux.siguiente;
            }

            actual = actual.siguiente;

        }

    }

    public void eliminarasignacion(String n, String c, String k, String s) {
        Nodo actual = new Nodo();
        Nodo finals = new Nodo();
        actual = primero;
        finals = null;
        boolean bandera = false;

        while (actual != null) {
            if (actual.CarnetStudent.equals(n) && actual.nombrecurso.equals(c)
                    && actual.catedratico.equals(k) && actual.Seccion.equals(s)) {
                bandera = true;
                if (actual == primero) {
                    primero = primero.siguiente;
                    primero.anterior = null;
                } else {
                    finals.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

            }
            finals = actual;
            actual = actual.siguiente;
        }
        if (bandera == true) {
            JOptionPane.showMessageDialog(null, "El curso fue eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "El curso no Existe");
        }
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = ultimo;
        while (actual != null) {
            System.out.println(actual.CarnetStudent + " , " + actual.status + " , " + actual.orden);
            actual = actual.anterior;
        }
    }
}
