
import java.util.Scanner;

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
        Lista lstMilista = new Lista();
        int aiDatos[] = new int [1000000];
        /*lstMilista.agregarNodo(new Nodo(100));
        lstMilista.agregarNodo(new Nodo(200));
        lstMilista.agregarNodo(new Nodo(300));
        lstMilista.agregarNodo(new Nodo(400));
        lstMilista.agregarNodo(new Nodo(500));
        lstMilista.agregarNodo(new Nodo(600));
        lstMilista.agregarNodo(new Nodo(700));
        lstMilista.agregarNodo(new Nodo(800));
        lstMilista.agregarNodo(new Nodo(900));
        lstMilista.agregarNodo(new Nodo(1000));*/
        //System.out.println("En la lista hay: " + lstMilista.longitud() + " nodo(s)");
        lstMilista.imprimir();
        for (int i = 0; i < aiDatos.length; i++) {
            int iVal =
            aiDatos[i] = (int)(Math.random() * 1000);
            
        }
        System.out.println("eso fue rapido");
        for (int i = 0; i < 10; i++) {
            int iVal = (int)(Math.random() * 1000);
            lstMilista.agregarNodo(new Nodo(iVal));
        }
        /*System.out.println("Tamaño = " + lstMilista.longitud());
        lstMilista.vaciar();
        System.out.println("Tamaño = " + lstMilista.longitud());*/
        lstMilista.imprimir();
        lstMilista.agregarNodo(new Nodo(99999));
        lstMilista.imprimir();
        lstMilista.borrar(0);
        lstMilista.imprimir();
        lstMilista.borrar(7);
        lstMilista.imprimir();
        System.out.println("VALOR [4] = " + lstMilista.obtener(4));
        lstMilista.agregarEn(2, new Nodo (555));
        lstMilista.imprimir();
        Scanner scInput = new Scanner(System.in);
        System.out.println("Valor a buscar: ");
        int iValBus = scInput.nextInt();
        scInput.nextLine();
        System.out.println("El valor " + iValBus + " esta en la posicion " + lstMilista.buscar(iValBus));
        Lista lsCopia = lstMilista.copiaLista();
        lsCopia.imprimir();
        lstMilista.agregarNodo(new Nodo (80));
        lstMilista.imprimir();
        lsCopia.imprimir();
        
    }
    
    
}
