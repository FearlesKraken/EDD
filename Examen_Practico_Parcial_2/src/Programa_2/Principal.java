/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);
        MatrizIncidencia miMatriz = new MatrizIncidencia();
        int opcion, nodo, conexion1, conexion2, conexion3, cont = 0;
        System.out.println("Eliga el tipo de grafo:\n1)Matriz de incidencia"
                + "\n2)Lista de adyacencia"
                + "\n3)Matriz de adyacencia");
        opcion = sInput.nextInt();
        switch (opcion) {        //ELECCION DE TIPO DE MATRIZ
            case 1:
                do {//PREGUNTAR LOS NODOS Y CONEXIONES
                    System.out.println("Introduce un nodo, para terminar escriba '0'");
                    cont++;
                    nodo = sInput.nextInt();
                    if (cont != 1) {
                        System.out.println("¿Cuantas conexiones desea, 1, 2 o 3?");
                        int seleccion = sInput.nextInt();
                        switch (seleccion) {
                            case 1:
                                System.out.println("¿A que nodo quiere conectarlo?(primero)");
                                conexion1 = sInput.nextInt();
                                miMatriz.agregarNodo(new Nodo(nodo), conexion1, 0, 0);
                                break;
                            case 2:
                                System.out.println("¿A que nodo quiere conectarlo?(primero)");
                                conexion1 = sInput.nextInt();
                                System.out.println("¿A que nodo quiere conectarlo?(segundo)");
                                conexion2 = sInput.nextInt();
                                miMatriz.agregarNodo(new Nodo(nodo), conexion1, conexion2, 0);
                                break;
                            case 3:
                                System.out.println("¿A que nodo quiere conectarlo?(primero)");
                                conexion1 = sInput.nextInt();
                                System.out.println("¿A que nodo quiere conectarlo?(segundo)");
                                conexion2 = sInput.nextInt();
                                System.out.println("¿A que nodo quiere conectarlo?(tercero)");
                                conexion3 = sInput.nextInt();
                                miMatriz.agregarNodo(new Nodo(nodo), conexion1, conexion2, conexion3);
                                break;

                        }

                    }
                    if (nodo != 0) {
                        miMatriz.agregarNodo(new Nodo(nodo), 0, 0, 0);
                    }
                } while (nodo != 0);
                miMatriz.imprimir();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
