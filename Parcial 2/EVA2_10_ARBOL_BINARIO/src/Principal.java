/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario abArbol = new ArbolBinario();
        abArbol.agregarNodo(new Nodo(13));
        abArbol.agregarNodo(new Nodo(10));
        abArbol.agregarNodo(new Nodo(18));
        abArbol.agregarNodo(new Nodo(2));
        abArbol.agregarNodo(new Nodo(11));
        abArbol.agregarNodo(new Nodo(17));
        abArbol.agregarNodo(new Nodo(20));
        abArbol.agregarNodo(new Nodo(16));
        abArbol.agregarNodo(new Nodo(16));
        System.out.println("InOrder");
        abArbol.imprimirInOrder();
        System.out.println("\nPreOrder");
        abArbol.imprimirPreOrder();
        System.out.println("\nPostOrder");
        abArbol.imprimirPostOrder();
        
    }
    
}
