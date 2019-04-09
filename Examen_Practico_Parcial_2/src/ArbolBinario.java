/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class ArbolBinario {

    Lista lLista = new Lista();
    private NodoArbol root;

    public ArbolBinario() {
        this.root = null;
    }

    public void agregarNodo(NodoArbol nNuevo) {
        if (root == null) {
            root = nNuevo;
        } else {
            //INICIA LA RECURSIVIDAD
            agregarRecursivo(root, nNuevo);
        }
    }

    private void agregarRecursivo(NodoArbol nActual, NodoArbol nNuevo) {
        //MENOR QUE EL VALOR ACTUAL --> IZQ
        if (nNuevo.getDato().compareToIgnoreCase(nActual.getDato()) < 0) {
            //ESPACIO DISPONIBLE, INSERTAMOS
            if (nActual.getIzq() == null) {
                nActual.setIzq(nNuevo);
            } else {
                agregarRecursivo(nActual.getIzq(), nNuevo);
            }
        } //MAYOR QUE EL VALOR ACTUAL --> DER
        else if (nNuevo.getDato().compareToIgnoreCase(nActual.getDato()) > 0) {
            //ESPACIO DISPONIBLE, INSERTAMOS
            if (nActual.getDer() == null) {
                nActual.setDer(nNuevo);
            } else {
                agregarRecursivo(nActual.getDer(), nNuevo);
            }
        } else {
            //ES IGUAL QUE EL VALOR ACTUAL --> NO HACEMOS NADA
            System.out.println("Valor repetido");
        }
    }

    public void imprimirInOrder() {
        inOrder(root);
    }

    public void imprimirPreOrder() {
        preOrder(root);
    }

    public void imprimirPostOrder() {
        postOrder(root);
    }

    private void inOrder(NodoArbol nActual) {
        /*RECORREMOS IZQ, LEEMOS, RECORREMOS DER*/
        if (nActual != null) {
            inOrder(nActual.getIzq());
            System.out.print("[" + nActual.getDato() + "]");
            inOrder(nActual.getDer());
        }
    }

    private void preOrder(NodoArbol nActual) {
        /*LEEMOS, RECORRESMO IZQ, RECORREMOS DER*/
        if (nActual != null) {
            System.out.print("[" + nActual.getDato() + "]");
            preOrder(nActual.getIzq());
            preOrder(nActual.getDer());
        }
    }

    private void postOrder(NodoArbol nActual) {
        /*RECORREMOS IZQ, RECORREMOS DER, LEEMOS*/
        if (nActual != null) {
            postOrder(nActual.getIzq());
            postOrder(nActual.getDer());
            System.out.print("[" + nActual.getDato() + "]");

        }
    }

    public void exportarLista() {
        inOrderExportarLista(root);
    }

    private void inOrderExportarLista(NodoArbol nActual) {
        /*RECORREMOS IZQ, LEEMOS, RECORREMOS DER*/
        if (nActual != null) {
            inOrderExportarLista(nActual.getIzq());
            //System.out.print("[" + nActual.getDato() + "]");
            lLista.agregarNodo(new NodoLista(nActual.getDato()));
            inOrderExportarLista(nActual.getDer());
        }
    }

    public void imprimirLista() {
        lLista.imprimir();
    }

    /*public void borrarNodo(String posicion) {
        //VERIFICAR SI EL BORRADO ES POSIBLE
        // 1. HAY NODOS
         //2. IPOS ES VALIDO 
        if (root != null) {
            //PRIMER NODO DE LA LISTA
            if (posicion.compareTo(root.getDato()) == 0) {
                //SI HAY UN SOLO NODO
                if (root.getDer() == null && root.getIzq() == null) {// UN SOLO NODO
                    root = null;
                } else {//MAS NODOS, RECONECTADOS
                    if (root.getIzq().getDer() != null) {
                        root.getIzq().getDer()
                        root.getIzq().setDer(root.getDer());
                        root = root.getIzq();
                    } else {
                        root.getIzq().setDer(root.getDer());
                        root = root.getIzq();
                    }

                }

            } else {                              //AQUI VA A ESTAR EL DESMADRE JAJA ASI ES
                //CUALQUIER NODO
                //ULTIMO NODO
                //LLEGAR HASTA LA POSICION PREVIA
                int iCont = 0;
                NodoArbol nTemp = root;
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
    }*/
}
