/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class NodoArbol {
    private String dato;
    private NodoArbol izq;
    private NodoArbol der;
    
    public NodoArbol() {
        this.izq = null;
        this.der = null;
    }

    public NodoArbol(String dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
    
    
}

