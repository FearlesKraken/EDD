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
    }
    //EFICENCIA O(N)
    //EFICIENCIA O(1) CON EL NODO FIN
    //AGREGAR NODOS AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNuevo) {
        if (inicio == null) {//LISTA VACIA (NO HAY NODOS)
            inicio = nNuevo;
            fin = nNuevo;
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
    //EFICENCIA O(1)
    public void agregarInicio(Nodo nNuevo){
        if(inicio == null){
            inicio = nNuevo;
        }else{
            nNuevo.setSiguiente(inicio);
            inicio = nNuevo;
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
}
