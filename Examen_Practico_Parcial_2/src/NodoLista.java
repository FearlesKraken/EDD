/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class NodoLista {
    //DOS COSAS:
    //VALOR A ALMACENAR Y LA REFERENCIA
    private String dato;
    private NodoLista siguiente;
    //CADA VEZ QUE CREAN UN NODO
    // LA REFERENCIA SE DEBE INICIALIZAR

    public NodoLista() {
        siguiente = null;
    }

    public NodoLista(String dato) {
        this.dato = dato;
        siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}