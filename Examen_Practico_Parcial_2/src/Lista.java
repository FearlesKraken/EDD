/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Lista {

    //UNA REFERENCIA QUE INDIQUE EL INICIO DE LA LISTA
    private NodoLista inicio;
    private NodoLista fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    //AGREGAR NODOS AL FINAL DE LA LISTA
    public void agregarNodo(NodoLista nNuevo) {
        if (inicio == null) {//LISTA VACIA (NO HAY NODOS)
            inicio = nNuevo;
            fin = nNuevo; //CAMBIO
        } else {//HAY NODOS
            //MOVERNOS AL FINAL DE LA LISTA
            /*Nodo nTemp = inicio;
             while (nTemp.getSiguiente() != null) {
             nTemp = nTemp.getSiguiente();
             }
             //CONECTAMOS AL FINAL DE LA LISTA CON EL NUEVO NODO
             nTemp.setSiguiente(nNuevo);*/
            fin.setSiguiente(nNuevo); //CAMBIO
            fin = nNuevo;
        }

    }

    public void imprimir() {
        NodoLista nTemp = inicio;
        while (nTemp != null) {
            System.out.print("[ " + nTemp.getDato() + " ]");
            nTemp = nTemp.getSiguiente();
        }
        System.out.println("");
    }

    
}
