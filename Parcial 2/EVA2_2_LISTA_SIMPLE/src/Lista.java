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
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    //AGREGAR NODOS AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNuevo) {
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
        Nodo nTemp = inicio;
        while (nTemp != null) {
            System.out.print("[" + nTemp.getDato() + "]");
            nTemp = nTemp.getSiguiente();
        }
        System.out.println("");
    }

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

            } else {
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
                nTemp.setSiguiente(nSig.getSiguiente().getSiguiente());
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
    public int obtener(int iPos) {
        //VALIDAR LA POSICION
        int iResu = 0;
        if (inicio != null) { //LISTA NO ESTE VACIA
            int iCont = 0;
            Nodo nTemp = inicio;
            while (iCont < iPos) {
                nTemp = nTemp.getSiguiente();
                iCont++;
            }
            return nTemp.getDato();
        }
        return iResu;
    }
    //EFICIENCIA O(1)
    public boolean estaVacia() {
        if (inicio == null)
            return true;
         else {
            return false;
        }
    }
    //EFICIENCIA O(N)
    public int buscar(int iValBus) {
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
    //EFICIENCIA O(N)
    public Lista copiaLista(){
        Lista lsCopia = new Lista();
        Nodo nTemp = inicio;
        while (nTemp != null) {
            lsCopia.agregarNodo(new Nodo (nTemp.getDato()));
            nTemp = nTemp.getSiguiente();
        }
        return lsCopia;
    }
}
