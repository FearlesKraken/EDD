
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adrian
 */
public class Programa_1 {

    public static void main(String[] arg) {
        Scanner sInput = new Scanner(System.in);
        String dato;
        int iOpcion;
        boolean salir = false;
        ArbolBinario abCadena = new ArbolBinario();
        System.out.println("Ingrese datos, para finalizar ingrese 'exit'");
        do {
            dato = sInput.next();
            if (dato.equalsIgnoreCase("exit")) {
                salir = true;
            } else {
                salir = false;
                abCadena.agregarNodo(new NodoArbol(dato));
            }

        } while (salir != true);
        System.out.println("Escriba el numero de la opcion que desea:"
                + "\n1)Imprimir PreOrder"
                + "\n2)Imprimir InOrder"
                + "\n3)Imprimir PostOrder");
        iOpcion = sInput.nextInt();
        switch (iOpcion) {

            case 1:
                abCadena.imprimirPreOrder();
                break;
            case 2:
                abCadena.imprimirInOrder();
                break;
            case 3:
                abCadena.imprimirPostOrder();
                break;
        }
        System.out.println("\nMostrando arbol exportado a lista:");
        abCadena.exportarLista();
        abCadena.imprimirLista();
        System.out.println("Escriba el valor del arbol que desea eliminar");
        dato = sInput.next();
        //abCadena.borrarNodo(dato);
        abCadena.imprimirInOrder();
    }
}
