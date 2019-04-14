
import java.io.File;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author invitado
 */
public class ListaDoble {

    //UNA REFERENCIA QUE INDIQUE EL INICIO DE LA LISTA
    private Nodo inicio;
    private Nodo fin;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    //AGREGAR NODOS AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNuevo) {
        if (inicio == null) {//LISTA VACIA (NO HAY NODOS)
            inicio = nNuevo;
            fin = nNuevo; //CAMBIO
        } else {//HAY NODOS
            fin.setSiguiente(nNuevo); //CAMBIO
            nNuevo.setPrevio(fin);
            fin = nNuevo;
        }

    }

    public void imprimir() {
        Nodo nTemp = inicio;
        while (nTemp != null) {
            System.out.print("[x = " + nTemp.getiCoorX() + "] ");
            System.out.print("[y = " + nTemp.getiCoorY() + "]");
            nTemp = nTemp.getSiguiente();
        }

        System.out.println("");
    }

    public void guardar(String nombre) {

        try {
            Nodo nTemp = inicio;
            File archivo = new File(nombre + ".txt");
            FileWriter escribir = new FileWriter(archivo, true);
            while (nTemp != null) {
                escribir.write(nTemp.getiCoorX() + "-");
                escribir.write(nTemp.getiCoorY() + "-");
                nTemp = nTemp.getSiguiente();
            }

            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
    
    /*public void imprimirInverso(){
     Nodo nTemp = fin;
     while (nTemp != null) {
     System.out.print("[" + nTemp.getDato() + "]");
     nTemp = nTemp.getPrevio();
     }
     System.out.println("");
     }*/

    public int longitud() {
        int iCont = 0;
        Nodo nTemp = inicio;
        while (nTemp != null) {
            iCont++;
            nTemp = nTemp.getSiguiente();
        }
        return iCont;
    }

    //EFICENCIA O(1)
    public void vaciar() {
        inicio = null;
        fin = null;
    }

    public void agregarInicio(Nodo nNuevo) {
        if (inicio == null) {//LISTA VACIA (NO HAY NODOS)
            inicio = nNuevo;
            fin = nNuevo; //CAMBIO
        } else { // HAY AL MENOS UN NODO
            nNuevo.setSiguiente(inicio);
            inicio.setPrevio(nNuevo);
            inicio = nNuevo;
        }
    }

    public void agregarEn(int iPos, Nodo nNuevo) {
        //POSICION VALIDA
        //LISTA VACIA 
        //AL INICIO
        if (inicio != null) {
            //AL INICIO
            if (iPos == 0) {
                agregarInicio(nNuevo);
            } else { //EN CUALQUIER OTRO LADO
                int iCont = 0;
                Nodo nTemp = inicio;
                while (iCont < (iPos - 1)) {
                    nTemp = nTemp.getSiguiente();
                    iCont++;
                }
                nNuevo.setSiguiente(nTemp.getSiguiente());
                nNuevo.setPrevio(nTemp);
                Nodo nTempSiguiente = nTemp.getSiguiente();
                nTempSiguiente.setPrevio(nNuevo);
                nTemp.setSiguiente(nNuevo);
            }
        }//else --> error

    }

    //EFICIENCIA O(N)
    public void borrar(int iPos) {
        //VERIFICAR SI EL BORRADO ES POSIBLE
        /* 1. HAY NODOS
         2. IPOS ES VALIDO */
        if (inicio != null) {
            //PRIMER NODO DE LA LISTA
            if (iPos == 0) {
                //SI HAY UN SOLO NODO
                if (inicio == fin) {// UN SOLO NODO
                    inicio = null;
                    fin = null;
                } else {//MAS NODOS, RECONECTADOS
                    inicio = inicio.getSiguiente();
                }

            } else {                              //AQUI VA A ESTAR EL DESMADRE JAJA ASI ES
                //CUALQUIER NODO
                //ULTIMO NODO
                //LLEGAR HASTA LA POSICION PREVIA
                int iCont = 0;
                Nodo nTemp = inicio;
                while (iCont < (iPos - 1)) {
                    nTemp = nTemp.getSiguiente();
                    iCont++;
                }
                //nTemp en la posicion de borrado
                Nodo nSig = nTemp.getSiguiente();
                nTemp.setSiguiente(nSig.getSiguiente());
                nSig = nSig.getSiguiente();
                nSig.setPrevio(nTemp);
                //HAY QUE RECONECTA FIBN SI BORRAMOS
                //EL NODO FINAL
                //COMO SABER QUE BORRAMOS EL ULTIMO NODO
                if (nTemp.getSiguiente() == null) {
                    fin = nTemp;
                }
            }
        }
    }

    //EFICIENCIA O(N)
    public int obtenerX(int iPos) {
        //VALIDAR LA POSICION
        int iResu = 0;
        if (inicio != null) { //LISTA NO ESTE VACIA
            int iCont = 0;
            Nodo nTemp = inicio;
            while (iCont < iPos) {
                nTemp = nTemp.getSiguiente();
                iCont++;
            }
            return nTemp.getiCoorX();
        }
        return iResu;
    }

    public int obtenerY(int iPos) {
        //VALIDAR LA POSICION
        int iResu = 0;
        if (inicio != null) { //LISTA NO ESTE VACIA
            int iCont = 0;
            Nodo nTemp = inicio;
            while (iCont < iPos) {
                nTemp = nTemp.getSiguiente();
                iCont++;
            }
            return nTemp.getiCoorY();
        }
        return iResu;
    }

    //EFICIENCIA O(1)
    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    //EFICIENCIA O(N)
    /*public int buscar(int iValBus) {
     int iPos = -1;
     Nodo nTemp = inicio;
     int iCont = 0;
     while (nTemp != null) {
     if (iValBus == nTemp.getDato()) {
     iPos = iCont;
     break;
     }
     iCont++;
     nTemp = nTemp.getSiguiente();

     }
     return iPos;
     }
     */
    //EFICIENCIA O(N)
    /*public ListaDoble copiaLista(){
     ListaDoble lsCopia = new ListaDoble();
     Nodo nTemp = inicio;
     while (nTemp != null) {
     lsCopia.agregarNodo(new Nodo (nTemp.getDato()));
     nTemp = nTemp.getSiguiente();
     }
     return lsCopia;
     }*/

    public boolean termino(int iPos) {
        boolean condicion = false;
        Nodo nTemp = inicio;
        if (nTemp.getSiguiente() != null) {
            nTemp = nTemp.getSiguiente();
        } else {
            condicion = true;
        }

        return condicion;
    }
}
