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
        ListaDoble lsLista = new ListaDoble();
        lsLista.agregarNodo(new Nodo(100));
        lsLista.agregarNodo(new Nodo(200));
        lsLista.agregarNodo(new Nodo(300));
        lsLista.agregarNodo(new Nodo(400));
        lsLista.agregarNodo(new Nodo(500));
        lsLista.agregarInicio(new Nodo(10));
        //lsLista.imprimir();
        lsLista.agregarEn(1, new Nodo(35));
        //lsLista.imprimirInverso();
        lsLista.imprimir();
        lsLista.borrar(2);
        lsLista.imprimir();
        lsLista.imprimirInverso();
        //agregar en +DONE
        //borrar 
        //imprimir inverso +DONE
        //ver cuales mas modificar
    }

}
