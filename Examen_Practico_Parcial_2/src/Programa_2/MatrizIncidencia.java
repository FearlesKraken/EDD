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
public class MatrizIncidencia {

    private Nodo root;

    public MatrizIncidencia() {
        this.root = null;
    }
    
    public void agregarNodo(Nodo nNuevo,int conexion1,int conexion2,int conexion3){
        if(root == null){
            root = nNuevo;
        }else{
            nNuevo.setApuntador1(new Nodo(conexion1));
            nNuevo.setApuntador2(new Nodo(conexion2));
            nNuevo.setApuntador3(new Nodo(conexion3));
        }
    }
    
    
    public void imprimir(){
        imprimirMatriz(root);
    }
    
    public void imprimirMatriz(Nodo nActual){
        if(nActual != null){
        System.out.println("[" + root.getDato() + "]");
        imprimirMatriz(nActual.getApuntador1());
        imprimirMatriz(nActual.getApuntador2());
        imprimirMatriz(nActual.getApuntador3());
        }
    }
}
