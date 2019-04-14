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
        Lista lstMiLista = new Lista();
        
        for (int i = 0; i < 1000000; i++) {
            int iVal = (int)(Math.random() * 1000);
            lstMiLista.agregarInicio(new Nodo(iVal));
            
        }
        System.out.println("Eso fue rapido");
        System.out.println("Cantidad de nodos: " + lstMiLista.longitud());
    }
    
}
