/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Nodo {
    //DOS COSAS:
    //VALOR A ALMACENAR Y LA REFERENCIA
    private int dato;
    private Nodo siguiente;
    private Nodo previo;
    //CADA VEZ QUE CREAN UN NODO
    // LA REFERENCIA SE DEBE INICIALIZAR

    public Nodo() {
        siguiente = null;
        previo = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
        previo = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
}
