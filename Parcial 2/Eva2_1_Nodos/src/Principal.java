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
        Nodo nObj1, nObj2, nObj3;
        nObj1 = new Nodo();
        nObj1.dato = 100;
        nObj1.siguiente = null;
        
        nObj2 = new Nodo();
        nObj2.dato = 200;
        nObj2.siguiente = null;
        
        nObj3 = new Nodo();
        nObj3.dato = 300;
        nObj3.siguiente = null;
        
        //vincular nObj1 -> nObj2 -> nObj3;
        nObj1.siguiente = nObj2;
        nObj2.siguiente = nObj3;
        //IMPRIMIR VALORES
        //NO PODEMOS VER TODOS LOS ELEMENTOS COMO EN UN ARREGLO
        //SOLO TENEMOS ACCESO AL PRIMERO ELEMENTO
        System.out.println("obj1 = " + nObj1.dato);
        System.out.println("obj2 = " + nObj1.siguiente.dato);
        System.out.println("obj3 = " + nObj1.siguiente.siguiente.dato);
        //RECORRER UNA LISTA
        Nodo nTemp = nObj1;
        while(nTemp != null){
            System.out.println(nTemp.dato);
            nTemp = nTemp.siguiente;
        }
    }
    
}
//ESLABONES
class Nodo{
    //SELECCION DE DATOS
    public int dato;
    //REFERENCIAS (S) PARA CREAR LA CADENA
    public Nodo siguiente;
    //SIEMPRE QUE CREAMOS UN NODO, LAS REFERENCIAS SE 
    //IGUALAN A NULL
}