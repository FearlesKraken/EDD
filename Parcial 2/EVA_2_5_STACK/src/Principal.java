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
        Pila pMiPila = new Pila();
        pMiPila.push(new Nodo(100));
        pMiPila.push(new Nodo(200));
        pMiPila.push(new Nodo(300));
        pMiPila.push(new Nodo(400));
        pMiPila.push(new Nodo(500));
        pMiPila.imprimir();
        System.out.println("Cima = " + pMiPila.peek());
        pMiPila.imprimir();
        System.out.println("Cima = " + pMiPila.pop());
        pMiPila.imprimir();
    }
    
}
