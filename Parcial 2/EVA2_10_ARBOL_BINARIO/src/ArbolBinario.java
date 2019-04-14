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

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    public void agregarNodo(Nodo nNuevo) {
        if (root == null) {
            root = nNuevo;
        } else {
            //INICIA LA RECURSIVIDAD
            agregarRecursivo(root, nNuevo);
        }
    }

    private void agregarRecursivo(Nodo nActual, Nodo nNuevo) {
        //MENOR QUE EL VALOR ACTUAL --> IZQ
        if (nNuevo.getDato() < nActual.getDato()) {
            //ESPACIO DISPONIBLE, INSERTAMOS
            if (nActual.getIzq() == null) {
                nActual.setIzq(nNuevo);
            } else {
                agregarRecursivo(nActual.getIzq(), nNuevo);
            }
        } //MAYOR QUE EL VALOR ACTUAL --> DER
        else if (nNuevo.getDato() > nActual.getDato()) {
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
    
    private void inOrder(Nodo nActual) {
        /*RECORREMOS IZQ, LEEMOS, RECORREMOS DER*/
        if (nActual != null) {
            inOrder(nActual.getIzq());
            System.out.print("[" + nActual.getDato() + "]");
            inOrder(nActual.getDer());
        }
    }
    
    private void preOrder(Nodo nActual) {
        /*LEEMOS, RECORRESMO IZQ, RECORREMOS DER*/
        if (nActual != null) {
            System.out.print("[" + nActual.getDato() + "]");
            preOrder(nActual.getIzq());
            preOrder(nActual.getDer());
        }
    }
    
    private void postOrder(Nodo nActual) {
        /*RECORREMOS IZQ, RECORREMOS DER, LEEMOS*/
        if (nActual != null) {
            postOrder(nActual.getIzq());
            postOrder(nActual.getDer());
            System.out.print("[" + nActual.getDato() + "]");
            
        }
    }
}
