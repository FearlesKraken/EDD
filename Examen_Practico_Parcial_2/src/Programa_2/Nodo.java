/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa_2;

/**
 *
 * @author Adrian
 */
public class Nodo {
    private int dato;
    private Nodo apuntador1;
    private Nodo apuntador2;
    private Nodo apuntador3;

    public Nodo() {
        this.apuntador1 = null;
        this.apuntador2 = null;
        this.apuntador3 = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.apuntador1 = null;
        this.apuntador2 = null;
        this.apuntador3 = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getApuntador1() {
        return apuntador1;
    }

    public void setApuntador1(Nodo apuntador1) {
        this.apuntador1 = apuntador1;
    }

    public Nodo getApuntador2() {
        return apuntador2;
    }

    public void setApuntador2(Nodo apuntador2) {
        this.apuntador2 = apuntador2;
    }

    public Nodo getApuntador3() {
        return apuntador3;
    }

    public void setApuntador3(Nodo apuntador3) {
        this.apuntador3 = apuntador3;
    }
    
    
}
